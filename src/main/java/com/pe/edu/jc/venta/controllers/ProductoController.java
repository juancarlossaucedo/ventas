package com.pe.edu.jc.venta.controllers;

import com.pe.edu.jc.venta.models.Pedido;
import com.pe.edu.jc.venta.models.Producto;
import com.pe.edu.jc.venta.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> buscarTodosLosProductos() {
        return productoService.buscarTodosLosProductos();
    }

    @PostMapping
    public Producto crearPedido(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto buscarProductoPorId(@PathVariable Integer id) {
        return productoService.buscarProductoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Integer id) {
        productoService.eliminarProducto(id);
    }

}