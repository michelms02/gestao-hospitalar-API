package com.gh.controller;

import com.gh.model.Funcionario;
import com.gh.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController implements BaseController<Funcionario> {
    @Autowired
    private FuncionarioService funcionarioService;

    @Override
    public ResponseEntity<List<Funcionario>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Optional<Funcionario>> findById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Funcionario> create(Funcionario object) {
        return null;
    }

    @Override
    public ResponseEntity<Funcionario> update(Integer id, Funcionario object) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }
}
