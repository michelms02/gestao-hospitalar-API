package com.gh.model;

import javax.persistence.*;

@Entity
public class Empresa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "cnpj")
    private String cnpj;
    @Basic
    @Column(name = "razao_social")
    private String razaoSocial;
    @Basic
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Basic
    @Column(name = "id_logradouro")
    private Integer idLogradouro;
    @Basic
    @Column(name = "id_contato")
    private Integer idContato;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Integer getIdLogradouro() {
        return idLogradouro;
    }

    public void setIdLogradouro(Integer idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    public Integer getIdContato() {
        return idContato;
    }

    public void setIdContato(Integer idContato) {
        this.idContato = idContato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empresa empresa = (Empresa) o;

        if (id != null ? !id.equals(empresa.id) : empresa.id != null) return false;
        if (cnpj != null ? !cnpj.equals(empresa.cnpj) : empresa.cnpj != null) return false;
        if (razaoSocial != null ? !razaoSocial.equals(empresa.razaoSocial) : empresa.razaoSocial != null) return false;
        if (nomeFantasia != null ? !nomeFantasia.equals(empresa.nomeFantasia) : empresa.nomeFantasia != null)
            return false;
        if (idLogradouro != null ? !idLogradouro.equals(empresa.idLogradouro) : empresa.idLogradouro != null)
            return false;
        if (idContato != null ? !idContato.equals(empresa.idContato) : empresa.idContato != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cnpj != null ? cnpj.hashCode() : 0);
        result = 31 * result + (razaoSocial != null ? razaoSocial.hashCode() : 0);
        result = 31 * result + (nomeFantasia != null ? nomeFantasia.hashCode() : 0);
        result = 31 * result + (idLogradouro != null ? idLogradouro.hashCode() : 0);
        result = 31 * result + (idContato != null ? idContato.hashCode() : 0);
        return result;
    }
}
