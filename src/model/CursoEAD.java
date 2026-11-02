package model;

public class CursoEAD extends Curso{

	private String plataformaVirtual;

	public CursoEAD(String nome, int codigo, String cargaHoraria, String plataformaVirtual) {
		super(nome, codigo, cargaHoraria);
		this.plataformaVirtual = plataformaVirtual;
	}

	public String getPlataformaVirtual() {
		return plataformaVirtual;
	}

	public void setPlataformaVirtual(String plataformaVirtual) {
		this.plataformaVirtual = plataformaVirtual;
	}
	
	@Override
	public String detalharCurso() {
		return "Curso - Nome: " + super.getNome() 
			+ ", Código: " + super.getCodigo() 
			+ ", Carga Horaria: " 
			+ super.getCargaHoraria() 
			+ ", Plataforma Virtual: " 
			+ plataformaVirtual;
	}
}
