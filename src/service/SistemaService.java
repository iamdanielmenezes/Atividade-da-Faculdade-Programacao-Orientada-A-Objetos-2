package service;

import java.util.List;

import model.Aluno;
import model.Curso;
import model.Professor;
import model.Turma;
import repository.SistemaRepository;

public class SistemaService {

    private SistemaRepository repository;

    public SistemaService(SistemaRepository repository) {
        this.repository = repository;
    }

    public void cadastrarAluno(Aluno aluno) {
        repository.adicionarAluno(aluno);
    }

    public void cadastrarProfessor(Professor professor) {
        repository.adicionarProfessor(professor);
    }

    public void cadastrarCurso(Curso curso) {
        repository.adicionarCurso(curso);
    }

    public void cadastrarTurma(Turma turma) {
        repository.adicionarTurma(turma);
    }
    
    public List<Aluno> listarAlunos() {
        return repository.getAlunos();
    }

    public List<Professor> listarProfessores() {
        return repository.getProfessores();
    }

    public List<Curso> listarCursos() {
        return repository.getCursos();
    }
}
