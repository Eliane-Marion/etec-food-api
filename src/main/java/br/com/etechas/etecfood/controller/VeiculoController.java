package br.com.etechas.etecfood.controllers;

import br.com.etechas.etecfood.entitys.Veiculo;
import br.com.etechas.etecfood.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")

public class VeiculoController {
    @Autowired
    public VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Veiculo listarPorId(@PathVariable Long id) {
        var veiculoId = veiculoRepository.findById(id);

        if(veiculoId.isPresent())
            return veiculoId.get();
        return null;
    }

    @PostMapping
    public void cadastrar(@RequestBody Veiculo veiculo) {
        veiculoRepository.save(veiculo);
    }

    @PutMapping("/{id}")
    public void atualizarPorId(@RequestBody Veiculo veiculo, @PathVariable Long id) {
        var veiculoId = veiculoRepository.findById(id);

        if(veiculoId.isPresent())
            veiculoRepository.save(veiculo);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        var veiculoId = veiculoRepository.findById(id);

        if (veiculoId.isPresent())
            veiculoRepository.deleteById(id);
    }
}
