package com.gh.dao;

import com.gh.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
    /* TODO: according to demand */
    Medico findByCrm(String crm);
}