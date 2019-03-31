package com.teste.cielo.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.teste.cielo.model.Extrato;

public interface ExtratoService {
	
	public Extrato getExtrato() throws JsonParseException, JsonMappingException, IOException;

}
