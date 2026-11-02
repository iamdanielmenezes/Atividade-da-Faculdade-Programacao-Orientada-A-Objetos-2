package entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private int codigo;
	private Professor professor;
	private Curso curso;
	private List<Aluno> listaAlunos;
	private List<Avaliacao> avaliacao;

	public Turma() {
	}

	public Turma(int codigo, Professor professor, Curso curso) {
	    this.codigo = codigo;
	    this.professor = professor;
	    this.curso = curso;
	    this.listaAlunos = new ArrayList<>();
	    this.avaliacao = new ArrayList<>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }
	
	public void removerAlunos(Aluno aluno) {
		this.listaAlunos.remove(aluno);
	}
	
	public int quantidadeAlunos() {
	    return listaAlunos.size();
	}
	
	public void adicionarAvaliacao(Avaliacao avaliacao) {
	    this.avaliacao.add(avaliacao);
	}
	
	@Override
	public String toString() {
		return "Turma:"
				+ "\nCódigo: " + codigo 
				+ "\n" + professor 
				+ "\n" + curso 
				+ "\nQuantidade de alunos: " + listaAlunos.size();
	}
}
