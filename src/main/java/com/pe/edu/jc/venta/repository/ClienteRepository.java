package com.pe.edu.jc.venta.repository;


import com.pe.edu.jc.venta.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}