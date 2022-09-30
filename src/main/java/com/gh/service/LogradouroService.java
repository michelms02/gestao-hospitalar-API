package com.gh.service;

import com.gh.dao.LogradouroRepository;
import com.gh.model.Logradouro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LogradouroService {
    @Autowired
    private LogradouroRepository repository;

    public List<Logradouro> findAll() {
        return this.repository.findAll();
    }

    public Optional<Logradouro> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Logradouro create(Logradouro logradouro) {
        return this.repository.save(logradouro);
    }

    @Transactional
    public Logradouro update(Integer id, Logradouro logradouro) {
        logradouro.setId(id);
        return this.repository.save(logradouro);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}