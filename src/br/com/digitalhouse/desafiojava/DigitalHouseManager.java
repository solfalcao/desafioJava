package br.com.digitalhouse.desafiojava;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    Curso curso;
    Aluno aluno;
    Professor professor;
    Matricula matricula;

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso();
        listaCursos.add(curso);
    }

    public void excluirCurso(Integer codigoCurso) {
        for (Integer codigoCurso : listaCursos) {
            if {
                codigoCurso = listaCursos.getcodigoCurso();
                listaCursos.remove(codigoCurso);
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer qtdeHoras) {
        Professor professorAdjunto = new Professor(String nome, String sobrenome, Integer codigoProfessor, Integer qtdeHoras);
        listaProfessores.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        Professor professorTitular = new Professor (String nome, String sobrenome, Integer codigoProfessor, String especialidade);
        listaProfessores.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (Integer codigoProfessor : listaProfessores) {
            if {
                codigoProfessor = listaProfessores.getcodigoProfessor();
                listaProfessores.remove(codigoProfessor);
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno();
        listaAlunos.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer
            codigoCurso)

}



