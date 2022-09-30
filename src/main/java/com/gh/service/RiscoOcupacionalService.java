package com.gh.service;

import com.gh.dao.RiscoOcupacionalRepository;
import com.gh.model.RiscoOcupacional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RiscoOcupacionalService {
    @Autowired
    private RiscoOcupacionalRepository repository;

    public List<RiscoOcupacional> findAll() {
        return this.repository.findAll();
    }

    public Optional<RiscoOcupacional> findById(Integer id) {
        return this.repository.findById(id);
    }

    public RiscoOcupacional findByIdExame(Integer idExame) {
        return this.repository.findByIdExame(idExame);
    }

    @Transactional
    public RiscoOcupacional create(RiscoOcupacional riscoOcupacional) {
        return this.repository.save(riscoOcupacional);
    }

    @Transactional
    public RiscoOcupacional update(Integer id, RiscoOcupacional riscoOcupacional) {
        riscoOcupacional.setId(id);
        return this.repository.save(riscoOcupacional);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}