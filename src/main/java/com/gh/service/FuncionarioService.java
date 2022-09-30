package com.gh.service;

import com.gh.dao.FuncionarioRepository;
import com.gh.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findAll() {
        return this.repository.findAll();
    }

    public List<Funcionario> findAllByIdEmpresa(Integer idEmpresa) {
        return this.repository.findAllByIdEmpresa(idEmpresa);
    }

    public Optional<Funcionario> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Funcionario create(Funcionario funcionario) {
        return this.repository.save(funcionario);
    }

    @Transactional
    public Funcionario update(Integer id, Funcionario funcionario) {
        funcionario.setId(id);
        return this.repository.save(funcionario);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}