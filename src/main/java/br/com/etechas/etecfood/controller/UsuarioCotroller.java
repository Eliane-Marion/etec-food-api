package br.com.etechas.etecfood.controller;

import br.com.etechas.etecfood.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.etechas.etecfood.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
// Classe responsável por gerenciar as requisições relacionadas aos usuários.
public class UsuarioController {
    @Autowired
// Repositório usado para operações de CRUD com a entidade Usuario
    private UsuarioRepository usuarioRepository;
}
@GetMapping
public List<Usuario> listar(){
    return UsuarioRepository.findAll();
}