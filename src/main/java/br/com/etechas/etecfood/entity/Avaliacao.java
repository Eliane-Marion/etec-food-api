/*
 * Nomes:
 * Victor de Melo - Github: Viccitor
 * Miguel Angel - Github: miguel320007
 * Anderson Filipim - Github: AndersonFilipimdeSousaFilho
 * Gabriel de Albuquerque - Github: GabrieldeAlbuquerqueMagalhaes
 * Jonatas Calebe - Github: calebe-007
 * Cauã Santos - Github: CauaSantos41
 * */

package br.com.etechas.etecfood.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AVALIACAO")

public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AVALIACAO")
    private Long id;

    @Column(name = "NOTA")
    private Integer nota;

    @Column(name = "COMENTARIO")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID") 
    private Pedido pedido;
}
