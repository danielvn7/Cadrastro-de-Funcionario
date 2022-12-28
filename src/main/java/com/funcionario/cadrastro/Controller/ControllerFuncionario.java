package com.funcionario.cadrastro.Controller;

import com.funcionario.cadrastro.Entity.Funcionarios;
import com.funcionario.cadrastro.repositorios.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController  // trabalha com verbo HTTP
@RequestMapping("/funcionario")
public class ControllerFuncionario {
    @Autowired
    FuncionarioRepositorio funcionariosRepo;
    @PostMapping("/")
    public ResponseEntity<?> adicionaFuncionarios(@RequestBody Funcionarios funcionarios){
        Funcionarios funcionariosSalvo = funcionariosRepo.save(funcionarios);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/funcionario").path("/{id}").buildAndExpand(funcionariosSalvo.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    }

