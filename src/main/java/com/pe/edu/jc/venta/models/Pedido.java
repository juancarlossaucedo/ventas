package com.pe.edu.jc.venta.models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_sequence", allocationSize = 1)

    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
