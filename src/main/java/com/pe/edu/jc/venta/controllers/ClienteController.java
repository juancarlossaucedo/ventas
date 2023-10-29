package com.pe.edu.jc.venta.controllers;

import com.pe.edu.jc.venta.models.Cliente;
import com.pe.edu.jc.venta.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pe.edu.jc.venta.controllers.apis.Apis.CLIENTE_API;

@RestController
@RequestMapping(CLIENTE_API)
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> buscarTodosLosClientes() {

        return clienteService.buscarTodosLosClientes();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {

        return clienteService.crearCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Integer id) {
        return clienteService.buscarClientePorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Integer id) {
        clienteService.eliminarCliente(id);
    }

}
