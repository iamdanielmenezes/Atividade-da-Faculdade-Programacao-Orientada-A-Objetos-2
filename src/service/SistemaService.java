
package service;

import java.util.List;

import model.Aluno;
import model.Avaliacao;
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
        if (buscarAluno(aluno.getMatricula()) != null) {
            throw new IllegalArgumentException("Matrícula já cadastrada!");
        }
        repository.adicionarAluno(aluno);
    }

    public void cadastrarProfessor(Professor professor) {
        if (buscarProfessor(professor.getRegistro()) != null) {
            throw new IllegalArgumentException("Registro já cadastrado!");
        }
        repository.adicionarProfessor(professor);
    }

    public void cadastrarCurso(Curso curso) {
        if (buscarCurso(curso.getCodigo()) != null) {
            throw new IllegalArgumentException("Código de curso já cadastrado!");
        }
        repository.adicionarCurso(curso);
    }

    public void cadastrarTurma(Turma turma) {
        if (buscarTurma(turma.getCodigo()) != null) {
            throw new IllegalArgumentException("Código de turma já cadastrado!");
        }
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

    public List<Turma> listarTurmas() {
        return repository.getTurmas();
    }

    public Aluno buscarAluno(int matricula) {
        for (Aluno aluno : repository.getAlunos()) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public Professor buscarProfessor(int registro) {
        for (Professor professor : repository.getProfessores()) {
            if (professor.getRegistro() == registro) {
                return professor;
            }
        }
        return null;
    }

    public Curso buscarCurso(int codigo) {
        for (Curso curso : repository.getCursos()) {
            if (curso.getCodigo() == codigo) {
                return curso;
            }
        }
        return null;
    }

    public Turma buscarTurma(int codigo) {
        for (Turma turma : repository.getTurmas()) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }

    public void associarAlunoTurma(int matricula, int codigoTurma) {
        Aluno aluno = buscarAluno(matricula);
        Turma turma = buscarTurma(codigoTurma);

        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não encontrado!");
        }

        if (turma == null) {
            throw new IllegalArgumentException("Turma não encontrada!");
        }

        if (turma.getListaAlunos().contains(aluno)) {
            throw new IllegalArgumentException("Aluno já está nesta turma!");
        }

        turma.adicionarAluno(aluno);
    }

    public void registrarAvaliacao(
            int matricula, int codigoTurma,
            double nota, String descricao) {

        Aluno aluno = buscarAluno(matricula);
        Turma turma = buscarTurma(codigoTurma);

        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não encontrado!");
        }

        if (turma == null) {
            throw new IllegalArgumentException("Turma não encontrada!");
        }

        if (!turma.getListaAlunos().contains(aluno)) {
            throw new IllegalArgumentException(
                "Aluno não pertence a esta turma!"
            );
        }

        if (Double.isNaN(nota) || nota < 0 || nota > 10) {
            throw new IllegalArgumentException(
                "Nota inválida! Deve estar entre 0 e 10."
            );
        }

        Avaliacao avaliacao = new Avaliacao(nota, descricao);
        avaliacao.setAluno(aluno);
        turma.adicionarAvaliacao(avaliacao);
    }
}
