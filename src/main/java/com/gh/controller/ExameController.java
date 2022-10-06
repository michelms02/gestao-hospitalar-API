package com.gh.controller;

import com.gh.model.Exame;
import com.gh.service.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/exame")
public class ExameController implements BaseController<Exame> {
    @Autowired
    private ExameService exameService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<Exame>> findAll() {
        return ResponseEntity.ok().body(this.exameService.findAll());
    }

    @GetMapping(path = "/funcionario/{id}")
    public ResponseEntity<List<Exame>> findAllByIdFuncionario(@PathVariable(name = "id") Integer idFuncionario) {
        return ResponseEntity.ok().body(this.exameService.findAllByIdFuncionario(idFuncionario));
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Exame>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.exameService.findById(id));
    }

    @Override
    @PostMapping(path = "/create")
    public ResponseEntity<Exame> create(@RequestBody Exame exame) {
        return ResponseEntity.ok().body(this.exameService.create(exame));
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Exame> update(@PathVariable(name = "id") Integer id, @RequestBody Exame exame) {
        return ResponseEntity.ok().body(this.exameService.update(id, exame));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.exameService.delete(id);
        return ResponseEntity.ok("Exame deletado com sucesso!");
    }
}