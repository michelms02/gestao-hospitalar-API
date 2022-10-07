package com.gh.service;

import com.gh.dao.EmpresaRepository;
import com.gh.dao.ExameRepository;
import com.gh.dao.FuncionarioRepository;
import com.gh.dao.RiscoOcupacionalRepository;
import com.gh.model.Empresa;
import com.gh.model.Exame;
import com.gh.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private ExameRepository exameRepository;
    @Autowired
    private RiscoOcupacionalRepository riscoOcupacionalRepository;

    public List<Empresa> findAll() {
        return this.empresaRepository.findAll();
    }

    public Optional<Empresa> findById(Integer id) {
        return this.empresaRepository.findById(id);
    }

    @Transactional
    public Empresa create(Empresa empresa) {
        return this.empresaRepository.save(empresa);
    }

    @Transactional
    public Empresa update(Integer id, Empresa empresa) {
        empresa.setId(id);
        return this.empresaRepository.save(empresa);
    }

    @Transactional
    public void delete(Integer id) {
        this.empresaRepository.deleteById(id);
    }

//    public void findAllEstatisticas() {
//        List<Empresa> empresas = this.empresaRepository.findAll();
//        Map<Integer, String> estatisticas = new HashMap<>();
//
//        for (Empresa empresa : empresas) {
//            List<String> estatistica = new ArrayList<>();
//            List<Funcionario> funcionarios = this.funcionarioRepository.findAllByIdEmpresa(empresa.getId());
//
//            for (Funcionario funcionario : funcionarios) {
//                List<Exame> exames = this.exameRepository.findAllByIdFuncionario(funcionario.getId());
//
//                for (Exame exame : exames) {
//                    estatistica.add(this.riscoOcupacionalRepository.getById(exame.getIdRiscoOcupacional()).getNome());
//                }
//            }
//            String tipoMaisComum
//                    = estatistica.stream()
//                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
//                    .entrySet()
//                    .stream()
//                    .max(Comparator.comparing(Map.Entry::getValue))
//                    .get()
//                    .getKey();
//
//            estatisticas.put(empresa.getId(), tipoMaisComum);
//        }
//
//    }

    public String findMaiorRiscoByIdEmpresa(Integer idEmpresa) {
        List<Funcionario> funcionarios = this.funcionarioRepository.findAllByIdEmpresa(idEmpresa);
        List<String> riscos = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            List<Exame> exames = this.exameRepository.findAllByIdFuncionario(funcionario.getId());

            for (Exame exame : exames) {
                riscos.add(this.riscoOcupacionalRepository.getById(exame.getIdRiscoOcupacional()).getNome());
            }
        }

        String maisComum
                = riscos.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey();

        return maisComum;
    }

    public Map<String, Long> findContagemRiscosByIdEmpresa(Integer idEmpresa) {
        List<Funcionario> funcionarios = this.funcionarioRepository.findAllByIdEmpresa(idEmpresa);
        List<String> riscos = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            List<Exame> exames = this.exameRepository.findAllByIdFuncionario(funcionario.getId());

            for (Exame exame : exames) {
                riscos.add(this.riscoOcupacionalRepository.getById(exame.getIdRiscoOcupacional()).getNome());
            }
        }

        return riscos.stream().collect(Collectors.groupingBy(risco -> risco, Collectors.counting()));
    }
}