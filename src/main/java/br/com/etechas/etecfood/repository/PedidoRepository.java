/*
 * Nomes:
 * Victor de Melo - Github: Viccitor
 * Miguel Angel - Github: miguel320007
 * Anderson Filipim - Github: AndersonFilipimdeSousaFilho
 * Gabriel de Albuquerque - Github: GabrieldeAlbuquerqueMagalhaes
 * Jonatas Calebe - Github: calebe-007
 * Cauã Santos - Github: CauaSantos41
 * */

 br.com.etechas.etecfood.repository;

import br.com.etechas.etecfood.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}