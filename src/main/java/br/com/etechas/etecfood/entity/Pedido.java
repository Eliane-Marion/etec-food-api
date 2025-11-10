package br.com.etechas.etecfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PEDIDO")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Long id;

    @Column(name = "DATA")
    private LocalDate data;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne
    @JoinColumn(name = "RESTAURANTE_ID")
    private Restaurante restaurante;

}
