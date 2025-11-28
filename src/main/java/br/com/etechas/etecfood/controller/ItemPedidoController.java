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

import br.com.etechas.etecfood.entity.Item_pedido;
import br.com.etechas.etecfood.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/itens-pedido")


public class ItemPedidoController {
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @GetMapping
    public List<Item_pedido> listar() {
        return itemPedidoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Item_pedido buscarPorId(@PathVariable Long id)
    {
        var item = itemPedidoRepository.findById(id);
        if(item.isPresent())
        {
            return item.get();
        }
        return null;
    }

    @PostMapping
    public void cadastrar(@RequestBody Item_pedido itemPedido)
    {
        itemPedidoRepository.save(itemPedido);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id)
    {
        var item = itemPedidoRepository.findById(id);
        if(item.isPresent())
        {
            itemPedidoRepository.delete(item.get());
        }
    }
}
