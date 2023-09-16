package com.pe.edu.jc.venta.services;


import com.pe.edu.jc.venta.models.Cliente;
import com.pe.edu.jc.venta.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarClientePorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> buscarTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public void eliminarCliente(Integer id) {
        clienteRepository.deleteById(id);
    }

}