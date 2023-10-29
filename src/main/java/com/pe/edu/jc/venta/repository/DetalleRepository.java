package com.pe.edu.jc.venta.repository;

import com.pe.edu.jc.venta.models.Detalle;
import com.pe.edu.jc.venta.models.Pedido;
import com.pe.edu.jc.venta.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DetalleRepository extends JpaRepository<Detalle, Integer> {

    Optional<Detalle> findByNombreIgnoreCase(Integer cantidad, Producto producto_id, Pedido pedido_id);

    Optional<Detalle> findAll(Integer cantidad, Producto productoId, Pedido pedidoId);
}