package entities;

public class Curso {

	private String nome;
	private int codigo;
	private String cargaHoraria;
	
	public Curso() {
	}

	public Curso(String nome, int codigo, String cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso - Nome: " + nome + ", Código: " + codigo + ", Carga Horaria: " + cargaHoraria;
	}
}
