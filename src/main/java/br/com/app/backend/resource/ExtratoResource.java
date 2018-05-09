package br.com.app.backend.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.backend.domain.extrato.Cabecalho;
import br.com.app.backend.domain.extrato.ContaCorrente;
import br.com.app.backend.domain.extrato.Detalhe;
import br.com.app.backend.domain.extrato.Extrato;
import br.com.app.backend.domain.extrato.Resumo;
import br.com.app.backend.domain.extrato.ResumoCondominio;

@RestController
@RequestMapping(value="/extratos")
public class ExtratoResource {
	//Incluir o codigo do condomínio
	
	@RequestMapping(value = "co/{cond}/ref/{referencia}/tipo/{tipo}/filtro/{filtro}" , 
			method =RequestMethod.GET, 
			produces = "application/json")
	@ResponseBody
	public Object buscaExtratos
	  (@PathVariable String cond,
			  @PathVariable String referencia,
			  @PathVariable long tipo,
			  @PathVariable long filtro) {
			
			ResumoCondominio resumoCondominio = new ResumoCondominio("Condominio", "77.000,00", "17.000,00", "22.000,00", "77.000,00");
			List<ContaCorrente> listaContaCorrente= new ArrayList<>();
			
			criaCC1(listaContaCorrente);
			criaCC2(listaContaCorrente);
			Extrato extrato = new Extrato(listaContaCorrente, resumoCondominio);
			
			return extrato;

		}

	private void criaCC2(List<ContaCorrente> listaContaCorrente) {
		Cabecalho cabecalho = new Cabecalho("SOLAR DE LOURDES", "041-8", "FUNDO RESERVA", "Nov/2017");
		
		List<Detalhe> detalhes = new ArrayList<>() ;
		criaLinhasRecebimentosFundoReserva(detalhes);
		
		List<Resumo> resumos = new ArrayList<>();
		resumos.add(new Resumo("SALDO DO MES ANTERIOR", "72.000,00"));
		resumos.add(new Resumo("TOTAL RERECIDO DO MES", "12.000,00"));
		resumos.add(new Resumo("TOTAL PAGO NO MES", "22.000,00"));

		
		ContaCorrente cc2 = new ContaCorrente(cabecalho, detalhes, resumos);
		listaContaCorrente.add(cc2);
	}

	private void criaCC1(List<ContaCorrente> listaContaCorrente) {
		Cabecalho cabecalho = new Cabecalho("SOLAR DE LOURDES", "041-8", "CONDOMINIO", "Nov/2017");
		
		List<Detalhe> detalhes = new ArrayList<>() ;
		criaLinhasRecebimentos(detalhes);
		List<Resumo> resumos = new ArrayList<>();
		resumos.add(new Resumo("SALDO DO MES ANTERIOR", "72.000,00"));
		resumos.add(new Resumo("TOTAL RERECIDO DO MES", "12.000,00"));
		resumos.add(new Resumo("TOTAL PAGO NO MES", "22.000,00"));

		
		ContaCorrente cc1 = new ContaCorrente(cabecalho, detalhes, resumos);
		listaContaCorrente.add(cc1);
	}

	private void criaLinhasRecebimentosFundoReserva(List<Detalhe> detalhes) {
		detalhes.add(new Detalhe("21", "FUNDO RESERVA dez 2017"  , "APTO 101", "", "1700,00", "R"));
		detalhes.add(new Detalhe("16", "FUNDO RESERVA dez 2017"  , "APTO 102", "", "1700,00", "R"));
		detalhes.add(new Detalhe("01", "FUNDO RESERVA dez 2017"  , "APTO 201", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "FUNDO RESERVA dez 2017"  , "APTO 202", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "FUNDO RESERVA dez 2017"  , "APTO 301", "", "1700,00", "R"));
		detalhes.add(new Detalhe("08", "FUNDO RESERVA dez 2017"  , "APTO 302", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "FUNDO RESERVA dez 2017"  , "APTO 401", "", "1700,00", "R"));
		detalhes.add(new Detalhe("08", "FUNDO RESERVA dez 2017"  , "APTO 402", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "FUNDO RESERVA dez 2017"  , "APTO 501", "", "1700,00", "R"));
		detalhes.add(new Detalhe("08", "FUNDO RESERVA dez 2017"  , "APTO 502", "", "1700,00", "R"));
		detalhes.add(new Detalhe("", "" , "", "TOTAL DE RECEBIMENTOS", "1700","T"));		

	}

	private void criaLinhasRecebimentos(List<Detalhe> detalhes) {
		detalhes.add(new Detalhe("21", "Condominio dez 2017"  , "APTO 101", "", "1700,00", "R"));
		detalhes.add(new Detalhe("16", "Condominio dez 2017"  , "APTO 102", "", "1700,00", "R"));
		detalhes.add(new Detalhe("01", "Condominio dez 2017"  , "APTO 201", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "Condominio dez 2017"  , "APTO 202", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "Condominio dez 2017"  , "APTO 301", "", "1700,00", "R"));
		detalhes.add(new Detalhe("08", "Condominio dez 2017"  , "APTO 302", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "Condominio dez 2017"  , "APTO 401", "", "1700,00", "R"));
		detalhes.add(new Detalhe("08", "Condominio dez 2017"  , "APTO 402", "", "1700,00", "R"));
		detalhes.add(new Detalhe("21", "Condominio dez 2017"  , "APTO 501", "", "1700,00", "R"));
		detalhes.add(new Detalhe("08", "Condominio dez 2017"  , "APTO 502", "", "1700,00", "R"));
	}
	

}
