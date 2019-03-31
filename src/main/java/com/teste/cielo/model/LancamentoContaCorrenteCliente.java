package com.teste.cielo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LancamentoContaCorrenteCliente {

	private Long numeroRemessaBanco;
	
	@JsonIgnore
	private List<Integer> dadosAnaliticoLancamentoFinanceiroCliente;
	
	private String nomeSituacaoRemessa;
	
	private DadosDomicilioBancario dadosDomicilioBancario;
	
	private String nomeTipoOperacao;

	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public List<Integer> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Integer> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	
	
	}
