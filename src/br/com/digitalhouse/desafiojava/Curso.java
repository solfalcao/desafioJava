package br.com.digitalhouse.desafiojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private Professor professorAd;
    private Professor professorTit;
    private Integer qtdeMaxAlunos;
    List<Aluno> listaAlunosMatriculados = new ArrayList<>();

    public Curso(String nome, Integer codigoCurso, Integer qtdeMaxAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }


    public String getNome() {
        return nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Professor getProfessorAd() {
        return professorAd;
    }

    public void setProfessorAd(Professor professorAd) {
        this.professorAd = professorAd;
    }

    public Professor getProfessorTit() {
        return professorTit;
    }

    public void setProfessorTit(Professor professorTit) {
        this.professorTit = professorTit;
    }

    public Integer getQtdeMaxAlunos() {
        return qtdeMaxAlunos;
    }

    public void setQtdeMaxAlunos(Integer qtdeMaxAlunos) {
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    @Override
    public boolean equals(Object codigo) {
        Curso curso = (Curso) codigo;
        if (curso.codigoCurso.equals(((Curso) codigo).getCodigoCurso())) {
            return true;
        } else {
            return false;
        }
    }

        public Boolean adicionarUmAluno (Aluno umAluno) {
            for (int i = 0; i <qtdeMaxAlunos ; i++) {
                listaAlunosMatriculados.add(umAluno);
                return true;
            } else {
                (i >= qtdeMaxAlunos)
                return false;
            }
        }

        public void excluirUmAluno (Aluno umAluno){
            listaAlunosMatriculados.remove(umAluno);
        }


}

