package com.gh.model;

import javax.persistence.*;

@Entity
public class Exame {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "id_tipo_exame")
    private Integer idTipoExame;
    @Basic
    @Column(name = "id_funcionario")
    private Integer idFuncionario;
    @Basic
    @Column(name = "id_medico")
    private Integer idMedico;
    @Basic
    @Column(name = "id_risco_ocupacional")
    private Integer idRiscoOcupacional;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTipoExame() {
        return idTipoExame;
    }

    public void setIdTipoExame(Integer idTipoExame) {
        this.idTipoExame = idTipoExame;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdRiscoOcupacional() {
        return idRiscoOcupacional;
    }

    public void setIdRiscoOcupacional(Integer idRiscoOcupacional) {
        this.idRiscoOcupacional = idRiscoOcupacional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exame exame = (Exame) o;

        if (id != null ? !id.equals(exame.id) : exame.id != null) return false;
        if (idTipoExame != null ? !idTipoExame.equals(exame.idTipoExame) : exame.idTipoExame != null) return false;
        if (idFuncionario != null ? !idFuncionario.equals(exame.idFuncionario) : exame.idFuncionario != null)
            return false;
        if (idMedico != null ? !idMedico.equals(exame.idMedico) : exame.idMedico != null) return false;
        if (idRiscoOcupacional != null ? !idRiscoOcupacional.equals(exame.idRiscoOcupacional) : exame.idRiscoOcupacional != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idTipoExame != null ? idTipoExame.hashCode() : 0);
        result = 31 * result + (idFuncionario != null ? idFuncionario.hashCode() : 0);
        result = 31 * result + (idMedico != null ? idMedico.hashCode() : 0);
        result = 31 * result + (idRiscoOcupacional != null ? idRiscoOcupacional.hashCode() : 0);
        return result;
    }
}
