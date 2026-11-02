package entities;

public class CursoPresencial extends Curso{

	private String salaDeAula;

	public CursoPresencial(String nome, int codigo, String cargaHoraria, String salaDeAula) {
		super(nome, codigo, cargaHoraria);
		this.salaDeAula = salaDeAula;
	}

	public String getSalaDeAula() {
		return salaDeAula;
	}

	public void setSalaDeAula(String salaDeAula) {
		this.salaDeAula = salaDeAula;
	}
	
	@Override
	public String detalharCurso() {
		return "Curso - Nome: " + super.getNome() 
			+ ", Código: " + super.getCodigo() 
			+ ", Carga Horaria: " 
			+ super.getCargaHoraria() 
			+ ", Sala de Aula: " 
			+ salaDeAula;
	}
}
