package com.pe.edu.jc.venta.services;

import com.pe.edu.jc.venta.models.Pedido;
import com.pe.edu.jc.venta.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido crearPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedidoPorId(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> buscarTodosLosPedidos() {
        return pedidoRepository.findAll();
    }

    public void eliminarPedido(Integer id) {
        pedidoRepository.deleteById(id);
    }

}