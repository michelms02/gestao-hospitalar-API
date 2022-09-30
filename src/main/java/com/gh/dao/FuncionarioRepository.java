package com.gh.dao;

import com.gh.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    /* TODO according to demand */
    List<Funcionario> findAllByIdEmpresa(Integer idEmpresa);
}
