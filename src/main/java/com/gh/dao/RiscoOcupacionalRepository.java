package com.gh.dao;

import com.gh.model.RiscoOcupacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiscoOcupacionalRepository extends JpaRepository<RiscoOcupacional, Integer> {
    /* TODO according to demand */
    RiscoOcupacional findByIdExame(Integer idExame);
}
