package com.gh.dao;

import com.gh.model.Logradouro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogradouroRepository extends JpaRepository<Logradouro, Integer> {
    /* TODO according to demand */
    Logradouro findByIdEmpresa(Integer idEmpresa);
}
