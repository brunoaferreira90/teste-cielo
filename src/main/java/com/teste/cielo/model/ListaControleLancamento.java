package com.teste.cielo.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ListaControleLancamento {
	
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataEfetivaLancamento;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataLancamentoContaCorrenteCliente;
		
	private Long numeroEvento;
	
	private String descricaoGrupoPagamento;
	
	private Long codigoIdentificadorUnico;
	
	private String nomeBanco;
	
	private Long quantidadeLancamentoRemessa;
	
	private Long numeroRaizCNPJ;
	
	private Long numeroSufixoCNPJ;
	
	private Double valorLancamentoRemessa;
	
	private Date dateLancamentoContaCorrenteCliente;
	
	private Date dateEfetivaLancamento;

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}


	public Long getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public Long getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(Long codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public Long getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(Long numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public Long getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(Long numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}


	public Date getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(Date dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public Date getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(Date dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public Date getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(Date dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public Date getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(Date dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public Double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(Double valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	

}
