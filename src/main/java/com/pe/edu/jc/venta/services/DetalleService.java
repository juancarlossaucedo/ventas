package com.pe.edu.jc.venta.services;



import com.pe.edu.jc.venta.models.Detalle;
import com.pe.edu.jc.venta.repository.DetalleRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DetalleService {

    private final DetalleRepository detalleRepository;

    public DetalleService(DetalleRepository detalleRepository) {
        this.detalleRepository = detalleRepository;
    }

    public Detalle crearDetalle(Detalle detalle) {

        return detalleRepository.save(detalle);
    }

    public Detalle buscarDetallePorId(Integer id) {
        return detalleRepository.findById(id).orElse(null);
    }

    public List<Detalle> buscarTodosLosDetalles() {
        return detalleRepository.findAll();
    }

    public void eliminarDetalle(Integer id) {
        detalleRepository.deleteById(id);
    }

}