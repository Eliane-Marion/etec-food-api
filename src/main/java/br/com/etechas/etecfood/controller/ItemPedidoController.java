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
}
