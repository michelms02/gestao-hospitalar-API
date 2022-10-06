package com.gh.controller;

import com.gh.model.Funcionario;
import com.gh.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController implements BaseController<Funcionario> {
    @Autowired
    private FuncionarioService funcionarioService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<Funcionario>> findAll() {
        return ResponseEntity.ok().body(this.funcionarioService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Funcionario>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.funcionarioService.findById(id));
    }

    @Override
    @PostMapping(path = "/create")
    public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario) {
        return ResponseEntity.ok().body(this.funcionarioService.create(funcionario));
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Funcionario> update(@PathVariable(name = "id") Integer id, @RequestBody Funcionario funcionario) {
        return ResponseEntity.ok().body(this.funcionarioService.update(id, funcionario));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.funcionarioService.delete(id);
        return ResponseEntity.ok("Funcionário deletado com sucesso!");
    }
}
