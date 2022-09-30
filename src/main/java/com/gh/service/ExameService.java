package com.gh.service;

import com.gh.dao.ExameRepository;
import com.gh.model.Exame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ExameService {
    @Autowired
    private ExameRepository repository;

    public List<Exame> findAll() {
        return this.repository.findAll();
    }

    public List<Exame> findAllByIdFuncionario(Integer idFuncionario) {
        return this.repository.findAllByIdFuncionario(idFuncionario);
    }

    public Optional<Exame> findById(Integer id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Exame create(Exame exame) {
        return this.repository.save(exame);
    }

    @Transactional
    public Exame update(Integer id, Exame exame) {
        exame.setId(id);
        return this.repository.save(exame);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}