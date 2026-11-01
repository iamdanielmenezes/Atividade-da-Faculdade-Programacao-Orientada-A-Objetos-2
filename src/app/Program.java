package app;

import entities.Aluno;
import entities.Curso;
import entities.Professor;

public class Program {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Daniel", 123, "Java");
		Professor professor = new Professor("João", "Backend", 456);
		Curso curso = new Curso("Java", 789, "58 horas");

		System.out.println(aluno);
		System.out.println(professor);
		System.out.println(curso);
		
	}
}
