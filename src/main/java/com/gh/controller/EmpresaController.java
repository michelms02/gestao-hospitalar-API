package com.gh.controller;

import com.gh.model.Contato;
import com.gh.model.Empresa;
import com.gh.model.Funcionario;
import com.gh.model.Logradouro;
import com.gh.service.ContatoService;
import com.gh.service.EmpresaService;
import com.gh.service.FuncionarioService;
import com.gh.service.LogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController implements BaseController<Empresa> {
    @Autowired
    private EmpresaService empresaService;
    @Autowired
    private FuncionarioService funcionarioService;
    @Autowired
    private ContatoService contatoService;
    @Autowired
    private LogradouroService logradouroService;

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
    @PostMapping(path = "/create")
    public ResponseEntity<Empresa> create(@RequestBody Empresa empresa) {
        return ResponseEntity.ok().body(this.empresaService.create(empresa));
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Empresa> update(@PathVariable(name = "id") Integer id, @RequestBody Empresa empresa) {
        return ResponseEntity.ok().body(this.empresaService.update(id, empresa));
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
        this.empresaService.delete(id);
        return ResponseEntity.ok("Empresa deletada com sucesso!");
    }

    @GetMapping(path = "/funcionarios/{id}")
    public ResponseEntity<List<Funcionario>> findAllFuncionariosById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(funcionarioService.findAllByIdEmpresa(id));
    }

    @GetMapping(path = "/contato/{id}")
    public ResponseEntity<Contato> findContatoById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.contatoService.findByIdEmpresa(id));
    }

    @GetMapping(path = "/logradouro/{id}")
    public ResponseEntity<Logradouro> findLogradouroById(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.logradouroService.findByIdEmpresa(id));
    }

//    @GetMapping(path = "/estatisticas")
//    public ResponseEntity findAllEstatisticas() {
//        empresaService.findAllEstatisticas();
//        return null;
//    }

    @GetMapping(path = "/maior-risco-ocupacional/{id}")
    public ResponseEntity<String> findMaiorRiscoByIdEmpresa(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.empresaService.findMaiorRiscoByIdEmpresa(id));
    }

    @GetMapping(path = "/contagem-riscos-ocupacionais/{id}")
    public ResponseEntity<Map<String, Long>> findContagemRiscosByIdEmpresa(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok().body(this.empresaService.findContagemRiscosByIdEmpresa(id));
    }
}