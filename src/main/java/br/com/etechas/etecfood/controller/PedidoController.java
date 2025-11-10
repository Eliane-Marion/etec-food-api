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