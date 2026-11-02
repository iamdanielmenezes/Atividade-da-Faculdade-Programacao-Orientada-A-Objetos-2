package entities;

import interfaces.Autenticacao;

public class Professor extends Usuario implements Autenticacao {

    private String especialidade;
    private int registro;

    public Professor() {
        super();
    }

    public Professor(String nome, String login, String senha, String especialidade, int registro) {

        super(nome, login, senha);

        this.especialidade = especialidade;
        this.registro = registro;
    }

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return "Professor - Nome: " + super.getNome() + ", Especialdiade: " + especialidade + ", Registro: " + registro;
	}
	
	 @Override
	    public boolean autenticar(String login, String senha) {
	        return validarCredenciais(login, senha);
	    }
}
