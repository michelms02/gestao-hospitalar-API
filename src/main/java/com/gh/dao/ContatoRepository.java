package com.gh.dao;

import com.gh.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
    /* TODO according to demand */
    Contato findByIdEmpresa(Integer idEmpresa);
}