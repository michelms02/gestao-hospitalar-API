package com.gh.controller;

import com.gh.model.Exame;
import com.gh.service.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/exame")
public class ExameController implements BaseController<Exame> {
    @Autowired
    private ExameService exameService;

    @Override
    public ResponseEntity<List<Exame>> findAll() {
        return null;
    }

    @GetMapping(path = "/funcionario/{id}")
    public ResponseEntity<List<Exame>> findAllByIdFuncionario(@PathVariable(name = "id") Integer idFuncionario) {
        return ResponseEntity.ok().body(this.exameService.findAllByIdFuncionario(idFuncionario));
    }

    @Override
    public ResponseEntity<Optional<Exame>> findById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Exame> create(Exame object) {
        return null;
    }

    @Override
    public ResponseEntity<Exame> update(Integer id, Exame object) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }
}