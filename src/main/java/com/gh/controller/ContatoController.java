package com.gh.controller;

import com.gh.model.Contato;
import com.gh.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contato")
public class ContatoController implements BaseController<Contato>{
    @Autowired
    private ContatoService contatoService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<Contato>> findAll() {
        return ResponseEntity.ok().body(this.contatoService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Contato>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.contatoService.findById(id));
    }

    @Override
    @PostMapping(path = "/create")
    public ResponseEntity<Contato> create(@RequestBody Contato contato) {
        return ResponseEntity.ok().body(this.contatoService.create(contato));
    }

    @Override
    @PutMapping(path = "/update")
    public ResponseEntity<Contato> update(@PathVariable(name = "id") Integer id, @RequestBody Contato contato) {
        return ResponseEntity.ok().body(this.contatoService.update(id, contato));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.contatoService.delete(id);
        return ResponseEntity.ok("Contato deletado com sucesso!");
    }
}