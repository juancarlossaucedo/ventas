package com.pe.edu.jc.venta.controllers;

import com.pe.edu.jc.venta.models.Detalle;
import com.pe.edu.jc.venta.services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.pe.edu.jc.venta.controllers.apis.Apis.DETALLE_API;

@RestController
@RequestMapping(DETALLE_API)
public class DetalleController {

    @Autowired
    private DetalleService detalleService;

    @GetMapping
    public List<Detalle> buscarTodosLosDetalles() {
        return detalleService.buscarTodosLosDetalles();
    }

    @PostMapping
    public Detalle crearDetalle(@RequestBody Detalle detalle) {
        return detalleService.crearDetalle(detalle);
    }

    @GetMapping("/{id}")
    public Detalle buscarDetallePorId(@PathVariable Integer id) {
        return detalleService.buscarDetallePorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetalle(@PathVariable Integer id) {
        detalleService.eliminarDetalle(id);
    }

}