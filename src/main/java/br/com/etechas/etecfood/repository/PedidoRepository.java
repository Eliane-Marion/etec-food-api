package br.com.etechas.etecfood.repository;

import br.com.etechas.etecfood.entity.Pedido;

import java.util.List;

public interface PedidoRepository {
    List<Pedido> findAll();
}
