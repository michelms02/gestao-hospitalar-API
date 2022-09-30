package com.gh.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_exame", schema = "gestao_hospitalar", catalog = "")
public class TipoExame {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nome")
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoExame tipoExame = (TipoExame) o;

        if (id != null ? !id.equals(tipoExame.id) : tipoExame.id != null) return false;
        if (nome != null ? !nome.equals(tipoExame.nome) : tipoExame.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }
}
