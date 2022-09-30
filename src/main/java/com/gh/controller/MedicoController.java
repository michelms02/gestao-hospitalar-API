package com.gh.controller;

import com.gh.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gh.service.MedicoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/medico")
public class MedicoController implements BaseController<Medico> {
    @Autowired
    private MedicoService medicoService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<Medico>> findAll() {
        return ResponseEntity.ok(this.medicoService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Medico>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.medicoService.findById(id));
    }

    @GetMapping(path = "/crm/{crm}")
    public ResponseEntity<Medico> findByCrm(@PathVariable(name = "crm") String crm) {
        return ResponseEntity.ok().body(this.medicoService.findByCrm(crm));
    }

    @Override
    @PostMapping(path = "/create")
    public ResponseEntity<Medico> create(@RequestBody Medico medico) {
        return ResponseEntity.ok().body(this.medicoService.create(medico));
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Medico> update(@PathVariable(name = "id") Integer id, @RequestBody Medico medico) {
        return ResponseEntity.ok().body(this.medicoService.update(id, medico));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.medicoService.delete(id);
        return ResponseEntity.ok("Medico deletado com sucesso!");
    }
}