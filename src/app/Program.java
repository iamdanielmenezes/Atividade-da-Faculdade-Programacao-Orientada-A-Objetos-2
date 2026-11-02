package app;

import java.util.Scanner;

import entities.Aluno;
import entities.Curso;
import entities.Professor;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Curso curso = new Curso();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		int relatorio;
		
	do {
		System.out.println();
		System.out.println("---- RELATÓRIOS ----");
		System.out.println("\n1 - Relatório de Cursos"
				+ "\n2 - Relatório de Alunos"
				+ "\n3 - Relatório de Professores"
				+ "\n4 - Encerrar");
		
		System.out.print("\nEscolha uma opção: ");
		relatorio = sc.nextInt();
		
		if (relatorio == 1) {
	        System.out.println(curso.gerarRelatorio());

	    } else if (relatorio == 2) {
	        System.out.println(aluno.gerarRelatorio());

	    } else if (relatorio == 3) {
	        System.out.println(professor.gerarRelatorio());

	    } else if (relatorio == 4) {
	        System.out.println("Encerrando o programa...");

	    } else {
	        System.out.println("Opção inválida!");
	    }

	} while (relatorio != 4);
		 
		sc.close();
	}
}
