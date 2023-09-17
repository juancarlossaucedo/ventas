package com.pe.edu.jc.venta.controllers;

import com.pe.edu.jc.venta.models.Pedido;
import com.pe.edu.jc.venta.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pe.edu.jc.venta.controllers.apis.Apis.PEDIDOS_API;

@RestController
@RequestMapping(PEDIDOS_API)
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> buscarTodosLosPedidos() {
        return pedidoService.buscarTodosLosPedidos();
    }

    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscarPedidoPorId(@PathVariable Integer id) {
        return pedidoService.buscarPedidoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable Integer id) {
        pedidoService.eliminarPedido(id);
    }

}
