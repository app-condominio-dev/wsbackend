package br.com.app.backend.service;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.app.backend.domain.Complemento;
import br.com.app.backend.dto.UsuarioFixo;
import br.com.app.backend.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
    
    private static final Map<String, UsuarioFixo> myMap;
    static {
        Map<String, UsuarioFixo> aMap = new HashMap<String, UsuarioFixo>();
        aMap.put("carol",
				new UsuarioFixo("SINDICO", "senha01", 
						new Complemento("049-3","Solar de Lourdes","Ana Carolina","00","502","SINDICO")
						)
				);
        aMap.put("mauricio",
				new UsuarioFixo("UNIDADE", "senha123", 
						new Complemento("045-3","Predio da esquina","Luiz Mauricio","00","502","UNIDADE")
						)
				);
        
        myMap = Collections.unmodifiableMap(aMap);
    }
    

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

		UsuarioFixo fixo = myMap.get(login);
		if(fixo == null) {
			throw new UsernameNotFoundException(login);
		}
		
		String senha = bCryptPasswordEncoder().encode(fixo.getSenha());
		Set<String> meusPerfis = new HashSet<>();
		meusPerfis.add(fixo.getSenha());
		return new UserSS(1,login,senha, meusPerfis, fixo.getComplento());
	}
	
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
