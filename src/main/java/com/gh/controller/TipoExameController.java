package com.gh.controller;

import com.gh.model.TipoExame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gh.service.TipoExameService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tipo-exame")
public class TipoExameController implements BaseController<TipoExame> {
    @Autowired
    private TipoExameService tipoExameService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<TipoExame>> findAll() {
        return ResponseEntity.ok(this.tipoExameService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<TipoExame>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.tipoExameService.findById(id));
    }

    /**
     * There must be five TipoExame only, there's no need to create, update or delete them.
     */

    @Override
    public ResponseEntity<TipoExame> create(TipoExame object) {
        return null;
    }

    @Override
    public ResponseEntity<TipoExame> update(Integer id, TipoExame object) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }
}