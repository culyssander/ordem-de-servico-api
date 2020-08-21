package com.culysoft.ordemdeservico.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.culysoft.ordemdeservico.domain.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente(1L, "Quitumba", "quitumba@culysoft.com", "999999999");
		Cliente cliente2 = new Cliente(2L, "Wilson", "wilson@culysoft.com", "999999998");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
