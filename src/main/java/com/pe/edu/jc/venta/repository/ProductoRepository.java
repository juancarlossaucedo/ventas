package com.pe.edu.jc.venta.repository;

import com.pe.edu.jc.venta.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
