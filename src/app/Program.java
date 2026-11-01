package app;

import entities.Aluno;
import entities.Curso;
import entities.Professor;
import entities.Turma;

public class Program {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Daniel", 123, "Java");
		Aluno aluno2 = new Aluno("Maria", 321, "Java");
		
		Professor professor = new Professor("João", "Backend", 456);
		Curso curso = new Curso("Java", 789, "58 horas");
		
		Turma turma = new Turma(001, professor, curso);
		turma.adicionarAluno(aluno1);
		turma.adicionarAluno(aluno2);

		System.out.println(turma);
	}
}
