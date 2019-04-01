package com.teste.cielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teste.cielo.model.Extrato;
import com.teste.cielo.service.ExtratoService;
import com.teste.cielo.util.ErroResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	@Autowired
	ExtratoService extratoService; // Service which will do all data retrieval/manipulation work

	@ApiOperation(value = "Buscar Extrato Cliente", response = Extrato.class, notes = "Operação responsável por buscar o extrato do cliente.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Operação responsável por buscar o extrato do cliente."),
			@ApiResponse(code = 400, message = "Caso não seja retornado nenhum dado a ser exibido na tela"),
			@ApiResponse(code = 500, message = "Caso tenhamos algum erro vamos retornar um ErroResponse") })

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/get/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> get() {
		Extrato extrato;
		try {
			extrato = extratoService.getExtrato();
			
		    if(extrato == null || extrato.getListaControleLancamento().isEmpty()) {
		    	return new ResponseEntity<ErroResponse>(new ErroResponse("400", "Nenhum dado encontrado."),
						HttpStatus.NOT_FOUND);
		    }
					
		} catch (Exception e) {
			return new ResponseEntity<ErroResponse>(new ErroResponse("500", "Erro ao buscar Extrato."),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Extrato>(extrato, HttpStatus.OK);
	}

}
