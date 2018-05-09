package br.com.app.backend.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.backend.domain.Recibo;
import br.com.app.backend.domain.ReciboSimplificado;
import br.com.app.backend.domain.RespostaListaRecibos;
import br.com.app.backend.domain.RespostaListaUnidades;
import br.com.app.backend.domain.RespostaRecibo;
import br.com.app.backend.domain.RespostaReciboUnico;
import br.com.app.backend.domain.Unidade;

@RestController
@RequestMapping(value="/recibos")
public class ReciboResource { 

	
	private static final String NOME_LUI = "Anakin Skywalker";
	private static final String NOME_FLA = "Obi-Wan Kenobi";
	private static final String NOME_MAR = "Padmé Amidala";
	private static final String NOME_CAR = "Supreme Leader Snoke";
	private static final String VAZIO = "";
	private static final String BL_FLA = "01";
	private static final String BL_CAR = "02";
	private static final String UNI_LUI = "202";
	private static final String UNI_FLA = "201";
	private static final String UNI_MAR = "102";
	private static final String UNI_CAR = "101";
	private static final String NO_COND_LUI = "Edifício Santos Dumont";
	private static final String NO_COND_FLA = "Edifício Itália";
	private static final String NO_COND_MAR = "Barra Quality";
	private static final String NO_COND_CAR = "Edifício Brasil";
	private static final String COD_COND_LUI = "433";
	private static final String COD_COND_FLA = "432";
	private static final String COD_COND_MAR = "431";
	private static final String COD_COND_CAR = "430";
	
	
	private static final String VALOR_FIXO = "850,00";
	private static final int TIPO_LISTA_UNIDADES = 1;
	private static final int TIPO_LISTA_RECIBOS = 2;
	private static final int TIPO_RECIBO_UNICO = 3;
	
	private static final String DATA_VENCIMENTO_FIXA = "01/09/2018";
	private static final String NUMERO_RECIBO_FIXO = "17897000";
	private static final String CODCON_FIXO = "300" ;
	private static final String UNIDADE_FIXO = "501";
	private static final String BLOCO_FIXO = BL_FLA;
	private static final String NOME_CONDOMINIO_FIXO = "Edifício Jardins";
	private static final String NOME_CONDOMINO_FIXO = "José das Couves de Freitas";
	private static final String COD_BARRAS_FIXO = "55680000003-2 07740296201-1 80310038000-2 00213190124-7";


	
	
	@RequestMapping(value = "/tipo/{tipo}/filtro/{filtro}" , 
			method =RequestMethod.GET, 
			produces = "application/json")
	@ResponseBody
	public RespostaRecibo buscaRecibos
	  (@PathVariable long tipo, @PathVariable String filtro) {
		if(tipo ==TIPO_LISTA_UNIDADES) {
			//Código e  Nome do Condomínio
			//concatenar com traço no app
			//Bloco e Unidade
			//Nome 
			List<Unidade> lista = new ArrayList<>();

			if(filtro.equals("00000000000")) {
				lista.add(new Unidade(COD_COND_CAR,NO_COND_CAR, UNI_CAR,BL_CAR,NOME_CAR));
				lista.add(new Unidade(COD_COND_MAR,NO_COND_MAR, UNI_MAR,VAZIO,NOME_MAR));
				lista.add(new Unidade(COD_COND_FLA,NO_COND_FLA, UNI_FLA,BL_FLA,NOME_FLA));
				lista.add(new Unidade(COD_COND_LUI,NO_COND_LUI, UNI_LUI,VAZIO,NOME_LUI));
			}
			
			if(filtro.equals("11111111111")) {
				return retornaListaRecibos(CODCON_FIXO + UNIDADE_FIXO + BLOCO_FIXO); 
			}
			
			if(filtro.equals("22222222222")) {
				return montaRecibo(CODCON_FIXO, UNIDADE_FIXO, BLOCO_FIXO, NUMERO_RECIBO_FIXO, 
						DATA_VENCIMENTO_FIXA, NOME_CONDOMINO_FIXO, NOME_CONDOMINIO_FIXO, 
						COD_BARRAS_FIXO,VALOR_FIXO);			
			}
			

			RespostaListaUnidades resp = new RespostaListaUnidades("1", lista);
			
			return resp;
			
		}else if(tipo ==TIPO_LISTA_RECIBOS){
			return retornaListaRecibos(filtro);
			
		}else if (tipo==TIPO_RECIBO_UNICO) {
			return retornaReciboUnico(filtro);
		}
			
		return null;
		
	}



	private RespostaRecibo retornaReciboUnico(String filtro) {
		if(filtro.equals("17897099") || filtro.equals("17897600") ||  filtro.equals("17897400")) {
			return montaRecibo(COD_COND_CAR, UNI_CAR, BL_CAR, filtro, 
					DATA_VENCIMENTO_FIXA,NOME_CAR,NO_COND_CAR,
					COD_BARRAS_FIXO,VALOR_FIXO);					
		}else if(filtro.equals("18897099") || filtro.equals("18897600") ) {
			return montaRecibo(COD_COND_MAR, UNI_MAR, VAZIO, filtro, 
					DATA_VENCIMENTO_FIXA, NOME_MAR, NO_COND_MAR,
					COD_BARRAS_FIXO,VALOR_FIXO);		
		}
		return montaRecibo("049-3", "502", BL_FLA, "17897099", 
				"23/02/2018", "Supreme Leader Snoke", "Solar de Lourdes", 
				"84680000003-2 07740296201-1 80310038000-2 00213190124-7","1.700,00");		
	}



	private RespostaRecibo retornaListaRecibos(String filtro) {
		String codCond =VAZIO;
		String bloco = VAZIO;
		String unidade= VAZIO;

		if(filtro != null && !filtro.isEmpty()) {
			codCond = filtro.substring(0, 3);

			if(filtro.length() == 6) {
				unidade = filtro.substring(3, 6);
			}else {
				bloco = filtro.substring(3, 5);
				unidade = filtro.substring(5, 8);
			}

		}
		
		List<ReciboSimplificado> lista = new ArrayList<>();
		
		if(filtro.equals(COD_COND_CAR + BL_CAR + UNI_CAR)) {
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, "17897099", "23/01/2018"));
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, "17897600", "23/02/2018"));
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, "17897400", "23/03/2018"));
		}
		else if(filtro.equals(COD_COND_MAR + VAZIO + UNI_MAR)) {
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, "18897099", "18/01/2018"));
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, "18897600", "18/02/2018"));			
		}
		else if(filtro.equals("42001201") || filtro.equals("420202")) {
			return montaRecibo(codCond, unidade, bloco, NUMERO_RECIBO_FIXO, 
					DATA_VENCIMENTO_FIXA, NOME_CONDOMINO_FIXO, NOME_CONDOMINIO_FIXO,
					COD_BARRAS_FIXO,VALOR_FIXO);			
		}else {
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, NUMERO_RECIBO_FIXO, DATA_VENCIMENTO_FIXA));
			lista.add(new ReciboSimplificado(codCond, unidade, bloco, NUMERO_RECIBO_FIXO.replace( "1", "9") , DATA_VENCIMENTO_FIXA));
		}

		RespostaListaRecibos resp = new RespostaListaRecibos("2", lista);
		return resp;
	}

	private RespostaReciboUnico montaRecibo(String codCondominio, String unidade, String bloco, String numero, String vencimento,
			String destinatario, String nomeCondominio, String codigoBarras, String valor) {
		
		Recibo recibo = new Recibo(codCondominio,unidade,bloco,numero, vencimento, destinatario, nomeCondominio, codigoBarras, valor);			
		
		RespostaReciboUnico resp = new RespostaReciboUnico("3", recibo);
		return resp;
	}
}
