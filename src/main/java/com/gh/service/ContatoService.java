package com.gh.service;

import com.gh.dao.ContatoRepository;
import com.gh.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository repository;

    public List<Contato> findAll() {
        return this.repository.findAll();
    }

    public Optional<Contato> findById(Integer id) {
        return this.repository.findById(id);
    }

    public Contato findByIdEmpresa(Integer idEmpresa) {
        return this.repository.findByIdEmpresa(idEmpresa);
    }

    @Transactional
    public Contato create(Contato contato) {
        return this.repository.save(contato);
    }

    @Transactional
    public Contato update(Integer id, Contato contato) {
        contato.setId(id);
        return this.repository.save(contato);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}