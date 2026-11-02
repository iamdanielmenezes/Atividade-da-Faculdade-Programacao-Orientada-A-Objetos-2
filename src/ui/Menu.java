package ui;

import java.util.Scanner;

import model.Aluno;
import model.Curso;
import model.Professor;
import service.SistemaService;

public class Menu {

	private SistemaService service;

	public Menu(SistemaService service) {
	    this.service = service;
	}

    public void exibirMenu() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---- RELATÓRIOS ----");
            System.out.println("1 - Relatório de Cursos");
            System.out.println("2 - Relatório de Alunos");
            System.out.println("3 - Relatório de Professores");
            System.out.println("4 - Encerrar");

            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

            	for (Curso curso : service.listarCursos()) {
            	    System.out.println(curso.gerarRelatorio());
            	}

            } else if (opcao == 2) {

            	for (Aluno aluno : service.listarAlunos()) {
            	    System.out.println(aluno.gerarRelatorio());
            	}

            } else if (opcao == 3) {

            	for (Professor professor : service.listarProfessores()) {
            	    System.out.println(professor.gerarRelatorio());
            	}

            } else if (opcao == 4) {

                System.out.println("Encerrando o programa...");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}
