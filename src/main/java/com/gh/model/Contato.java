package com.gh.model;

import javax.persistence.*;

@Entity
public class Contato {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "id_empresa")
    private Integer idEmpresa;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "ddd")
    private String ddd;
    @Basic
    @Column(name = "telefone")
    private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contato contato = (Contato) o;

        if (id != null ? !id.equals(contato.id) : contato.id != null) return false;
        if (idEmpresa != null ? !idEmpresa.equals(contato.idEmpresa) : contato.idEmpresa != null) return false;
        if (email != null ? !email.equals(contato.email) : contato.email != null) return false;
        if (ddd != null ? !ddd.equals(contato.ddd) : contato.ddd != null) return false;
        if (telefone != null ? !telefone.equals(contato.telefone) : contato.telefone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idEmpresa != null ? idEmpresa.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (ddd != null ? ddd.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        return result;
    }
}
