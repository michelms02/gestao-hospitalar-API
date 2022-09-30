package com.gh.dao;

import com.gh.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Integer> {
    /* TODO according to demand */
    List<Exame> findAllByIdFuncionario(Integer idFuncionario);
}
