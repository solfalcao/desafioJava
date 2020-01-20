package br.com.digitalhouse.desafiojava;

import java.util.Objects;

abstract class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempo;
    private Integer codigo;

    public Professor();

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getTempo() {
        return tempo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object codigo) {
        Professor professor = (Professor) codigo;
        if (professor.codigo.equals(((Professor) codigo).getCodigo())){
            return true;
    }
    else {
        return false;
    }
}

  
}
