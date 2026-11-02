package model;

public class Avaliacao {

	private double nota;
	private String descricao;
	private Aluno aluno;
	
	public Avaliacao() {
	}

	public Avaliacao(double nota, String descricao) {
	    this.descricao = descricao;
	    atribuirNota(nota);
	}

	public double getNota() {
		return nota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void atribuirNota(double nota) {
	    if (nota >= 0 && nota <= 10) {
	        this.nota = nota;
	    } else {
	        System.out.println("Nota inválida! Deve estar entre 0 e 10.");
	    }
	}
}
