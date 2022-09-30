package com.gh.service;

import com.gh.dao.EmpresaRepository;
import com.gh.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository repository;

    public List<Empresa> findAll() {
        return this.repository.findAll();
    }

    public Optional<Empresa> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Empresa create(Empresa empresa) {
        return this.repository.save(empresa);
    }

    @Transactional
    public Empresa update(Integer id, Empresa empresa) {
        empresa.setId(id);
        return this.repository.save(empresa);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}