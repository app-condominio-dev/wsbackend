package br.com.app.backend.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.app.backend.domain.Complemento;

public class UserSS implements UserDetails {
	public UserSS() {
		
	};
	
	public UserSS(Integer id, String login, String senha, Set<String> perfis, Complemento complemento) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.authorities = perfis.stream().map(x -> new SimpleGrantedAuthority(x)).collect(Collectors.toList());
		this.complemento = complemento;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7567107090297031290L;
	private Integer id;
	private String login;
	private String senha;
	private Collection<? extends GrantedAuthority> authorities;
	private Complemento complemento;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public Integer getId() {
		return id;
	}

	public Complemento getComplemento() {
		return complemento;
	}

	public void setComplemento(Complemento complemento) {
		this.complemento = complemento;
	}


}
