package repository;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Professor;
import model.Curso;
import model.Turma;

public class SistemaRepository {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}
