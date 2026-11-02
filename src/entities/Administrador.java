package entities;

import interfaces.Autenticacao;

public class Administrador extends Usuario implements Autenticacao {

    private int codigo;

    public Administrador() {
        super();
    }

    public Administrador(String nome, String login, String senha, int codigo) {
        super(nome, login, senha);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return validarCredenciais(login, senha);
    }

    @Override
    public String toString() {
        return "Administrador - Nome: " + super.getNome()
                + ", Código: " + codigo;
    }
}
