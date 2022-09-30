package com.gh.controller;

import com.gh.model.Empresa;
import com.gh.model.Funcionario;
import com.gh.service.EmpresaService;
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
@RequestMapping(value = "/empresa")
public class EmpresaController implements BaseController<Empresa> {
    @Autowired
    EmpresaService empresaService;
    @Autowired
    FuncionarioService funcionarioService;

    @Override
    @GetMapping(path = "/all")
    public ResponseEntity<List<Empresa>> findAll() {
        return ResponseEntity.ok(empresaService.findAll());
    }

    @Override
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Empresa>> findById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(empresaService.findById(id));
    }

    @Override
    public ResponseEntity<Empresa> create(Empresa object) {
        return null;
    }

    @Override
    public ResponseEntity<Empresa> update(Integer id, Empresa object) {
        return null;
    }

    @Override
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }

    @GetMapping(path = "/funcionarios/{id}")
    public ResponseEntity<List<Funcionario>> findAllFuncionarios(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(funcionarioService.findAllByIdEmpresa(id));
    }
}
