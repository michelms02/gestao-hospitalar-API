package com.gh.controller;

import com.gh.model.Logradouro;
import com.gh.service.LogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logradouro")
public class LogradouroController implements BaseController<Logradouro>{
    @Autowired
    private LogradouroService logradouroService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<Logradouro>> findAll() {
        return ResponseEntity.ok().body(this.logradouroService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Logradouro>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.logradouroService.findById(id));
    }

    @Override
    @PostMapping(path = "/create")
    public ResponseEntity<Logradouro> create(@RequestBody Logradouro logradouro) {
        return ResponseEntity.ok().body(this.logradouroService.create(logradouro));
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Logradouro> update(@PathVariable(name = "id") Integer id, @RequestBody Logradouro logradouro) {
        return ResponseEntity.ok().body(this.logradouroService.update(id, logradouro));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.logradouroService.delete(id);
        return ResponseEntity.ok("Logradouro deletado com sucesso!");
    }
}
