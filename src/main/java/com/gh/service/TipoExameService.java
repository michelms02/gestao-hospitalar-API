package com.gh.service;

import com.gh.dao.TipoExameRepository;
import com.gh.model.TipoExame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TipoExameService {
    @Autowired
    private TipoExameRepository repository;

    public List<TipoExame> findAll() {
        return this.repository.findAll();
    }

    public Optional<TipoExame> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Transactional
    public TipoExame create(TipoExame tipoExame) {
        return this.repository.save(tipoExame);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}