package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	SaleService saleService;

	public ResponseEntity<List<SaleDTO>> buscarTodos(){
		List<SaleDTO> lista = saleService.buscarTodos();
		return ResponseEntity.ok(lista);
	}
	
	
	
}
