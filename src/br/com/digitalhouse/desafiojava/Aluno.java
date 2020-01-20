package br.com.digitalhouse.desafiojava;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object codigo) {
        if (this == codigo) return true;
        Aluno aluno = (Aluno) codigo;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(sobrenome, aluno.sobrenome) &&
                Objects.equals(codigoAluno, aluno.codigoAluno);
    }


}
