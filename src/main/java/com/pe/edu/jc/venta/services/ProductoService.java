package com.pe.edu.jc.venta.services;

import com.pe.edu.jc.venta.models.Pedido;
import com.pe.edu.jc.venta.models.Producto;
import com.pe.edu.jc.venta.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto buscarProductoPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);

    }

    public List<Producto> buscarTodosLosProductos() {
        return productoRepository.findAll();
    }

    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}
