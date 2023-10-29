package com.pe.edu.jc.venta.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table (name = "detalle")
public class Detalle {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_seq")
    @SequenceGenerator(name = "detalle_seq", sequenceName = "detalle_sequence", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad")
    private Integer cantidad;


    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;


    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
}
