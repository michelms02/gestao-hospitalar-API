package com.gh.controller;

import com.gh.model.RiscoOcupacional;
import com.gh.service.RiscoOcupacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/risco-ocupacional")
public class RiscoOcupacionalController implements BaseController<RiscoOcupacional> {
    @Autowired
    private RiscoOcupacionalService riscoOcupacionalService;

    @Override
    public ResponseEntity<List<RiscoOcupacional>> findAll() {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.findAll());
    }

    @Override
    public ResponseEntity<Optional<RiscoOcupacional>> findById(Integer id) {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.findById(id));
    }

    @GetMapping(path = "/exame/{id}")
    public ResponseEntity<RiscoOcupacional> findByIdExame(@PathVariable(name = "id") Integer idExame) {
        return ResponseEntity.ok().body(this.riscoOcupacionalService.findByIdExame(idExame));
    }

    @Override
    public ResponseEntity<RiscoOcupacional> create(RiscoOcupacional object) {
        return null;
    }

    @Override
    public ResponseEntity<RiscoOcupacional> update(Integer id, RiscoOcupacional object) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }
}
