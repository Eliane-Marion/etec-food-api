package br.com.etechas.etecfood.controller ;

import br.com.etechas.etecfood.entity.Avaliacao;
import br.com.etechas.etecfood.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;


    @GetMapping
    public List<Avaliacao> listar() {
        return avaliacaoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Avaliacao buscarPorId(@PathVariable Long id) {
        var avaliacao = avaliacaoRepository.findById(id);
        if (avaliacao.isPresent()) {
            return avaliacao.get();
        }
        return null;
    }
    @PostMapping
    public void cadastrar(@RequestBody Avaliacao avaliacao) {
        avaliacaoRepository.save(avaliacao);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        var avaliacao = avaliacaoRepository.findById(id);
        if (avaliacao.isPresent()) {
            avaliacaoRepository.delete(avaliacao.get());
        }
    }
}


