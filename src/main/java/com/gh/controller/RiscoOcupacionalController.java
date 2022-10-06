package com.gh.controller;

import com.gh.model.RiscoOcupacional;
import com.gh.service.RiscoOcupacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/risco-ocupacional")
public class RiscoOcupacionalController implements BaseController<RiscoOcupacional> {
    @Autowired
    private RiscoOcupacionalService riscoOcupacionalService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<RiscoOcupacional>> findAll() {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<RiscoOcupacional>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.findById(id));
    }

    @GetMapping(path = "/exame/{id}")
    public ResponseEntity<RiscoOcupacional> findByIdExame(@PathVariable(name = "id") Integer idExame) {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.findByIdExame(idExame));
    }

    @Override
    @PostMapping(path = "/create")
    public ResponseEntity<RiscoOcupacional> create(@RequestBody RiscoOcupacional riscoOcupacional) {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.create(riscoOcupacional));
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<RiscoOcupacional> update(@PathVariable(name = "id") Integer id, @RequestBody RiscoOcupacional riscoOcupacional) {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.update(id, riscoOcupacional));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.riscoOcupacionalService.delete(id);
        return ResponseEntity.ok("Risco ocupacional deletado com sucesso!");
    }
}