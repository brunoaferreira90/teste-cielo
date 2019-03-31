package com.teste.cielo.service;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teste.cielo.model.Extrato;

@Service("extratoService")
public class ExtratoServiceImpl implements ExtratoService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Extrato getExtrato() throws JsonParseException, JsonMappingException, IOException {

		Extrato extrato = new Extrato();
		
		ObjectMapper objectMapper = new ObjectMapper();
		extrato = objectMapper.readValue(new File("lancamento-conta-legado.json"), Extrato.class);
		logger.info("\n----------------------------\n" + extrato + "\n");
		
        return extrato;
		
	}

}
