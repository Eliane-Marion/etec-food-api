/*
* Nomes:
* Victor de Melo - Github: Viccitor
* Miguel Angel - Github: miguel320007
* Anderson Filipim - Github: AndersonFilipimdeSousaFilho
* Gabriel de Albuquerque - Github: GabrieldeAlbuquerqueMagalhaes
* Jonatas Calebe - Github: calebe-007
* Cauã Santos - Github: CauaSantos41
* */

package br.com.etechas.etecfood.controller;

import br.com.etechas.etecfood.entity.Pedido;
import br.com.etechas.etecfood.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;


    @GetMapping
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }


    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        var pedido = pedidoRepository.findById(id);
        if (pedido.isPresent()) {
            return pedido.get();
        }
        return null;
    }
    @PostMapping
    public void cadastrar(@RequestBody Pedido pedido) {
        pedidoRepository.save(pedido);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        var pedido = pedidoRepository.findById(id);
        if (pedido.isPresent()) {
            pedidoRepository.delete(pedido.get());
        }
    }
}

