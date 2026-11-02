package entities;

import interfaces.Autenticacao;

public class Aluno extends Usuario implements Autenticacao {

    private int matricula;
    private String curso;

    public Aluno() {
    	super();
    }

    public Aluno(String nome, String login, String senha, int matricula, String curso) {

        super(nome, login, senha);

        this.matricula = matricula;
        this.curso = curso;
    }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String gerarRelatorio() {
		return "Aluno - Nome: " + super.getNome() + ", Matricula: " + matricula + ", Curso: " + curso;
	}

	@Override
    public boolean autenticar(String login, String senha) {
        return validarCredenciais(login, senha);
    }
}
