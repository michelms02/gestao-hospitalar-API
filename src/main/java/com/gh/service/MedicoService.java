package com.gh.service;

import com.gh.dao.MedicoRepository;
import com.gh.model.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository repository;

    public List<Medico> findAll() {
        return this.repository.findAll();
    }

    public Optional<Medico> findById(Integer id) {
        return this.repository.findById(id);
    }

    public Medico findByCrm(String crm) {
        return this.repository.findByCrm(crm);
    }

    @Transactional
    public Medico create(Medico medico) {
        return this.repository.save(medico);
    }

    @Transactional
    public Medico update(Integer id, Medico medico) {
        medico.setId(id);
        return this.repository.save(medico);
    }

    @Transactional
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}