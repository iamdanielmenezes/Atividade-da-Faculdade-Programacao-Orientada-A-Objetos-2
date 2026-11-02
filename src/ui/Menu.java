
package ui;

import java.util.Scanner;

import model.Aluno;
import model.Professor;
import model.Curso;
import model.CursoPresencial;
import model.CursoEAD;
import model.Turma;
import service.SistemaService;

public class Menu {

    private SistemaService service;
    private Scanner sc;

    public Menu(SistemaService service) {
        this.service = service;
        this.sc = new Scanner(System.in);
    }

    public void exibirMenu() {

        int opcao = 0;

        do {
            System.out.println("\n===== SISTEMA EDUCACIONAL =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar curso");
            System.out.println("4 - Criar turma");
            System.out.println("5 - Adicionar aluno à turma");
            System.out.println("6 - Registrar avaliação");
            System.out.println("7 - Gerar relatórios gerais");
            System.out.println("8 - Encerrar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        cadastrarProfessor();
                        break;
                    case 3:
                        cadastrarCurso();
                        break;
                    case 4:
                        criarTurma();
                        break;
                    case 5:
                        adicionarAlunoTurma();
                        break;
                    case 6:
                        registrarAvaliacao();
                        break;
                    case 7:
                        gerarRelatorios();
                        break;
                    case 8:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 8);

        sc.close();
    }

    private void cadastrarAluno() {

        System.out.println("\n--- CADASTRAR ALUNO ---");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("Matrícula: ");
        int matricula = Integer.parseInt(sc.nextLine());

        System.out.print("Curso do aluno: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno(
            nome, login, senha, matricula, curso
        );

        service.cadastrarAluno(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void cadastrarProfessor() {

        System.out.println("\n--- CADASTRAR PROFESSOR ---");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = sc.nextLine();

        System.out.print("Registro: ");
        int registro = Integer.parseInt(sc.nextLine());

        Professor professor = new Professor(
            nome, login, senha, especialidade, registro
        );

        service.cadastrarProfessor(professor);

        System.out.println("Professor cadastrado com sucesso!");
    }

    private void cadastrarCurso() {

        System.out.println("\n--- CADASTRAR CURSO ---");

        System.out.print("Nome do curso: ");
        String nome = sc.nextLine();

        System.out.print("Código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        System.out.print("Carga horária: ");
        String cargaHoraria = sc.nextLine();

        System.out.println("Tipo de curso:");
        System.out.println("1 - Presencial");
        System.out.println("2 - EAD");
        System.out.print("Escolha: ");
        int tipo = Integer.parseInt(sc.nextLine());

        Curso curso;

        if (tipo == 1) {

            System.out.print("Sala de aula: ");
            String sala = sc.nextLine();

            curso = new CursoPresencial(
                nome, codigo, cargaHoraria, sala
            );

        } else if (tipo == 2) {

            System.out.print("Plataforma virtual: ");
            String plataforma = sc.nextLine();

            curso = new CursoEAD(
                nome, codigo, cargaHoraria, plataforma
            );

        } else {
            System.out.println("Tipo de curso inválido!");
            return;
        }

        service.cadastrarCurso(curso);

        System.out.println("Curso cadastrado com sucesso!");
    }

    private void criarTurma() {

        System.out.println("\n--- CRIAR TURMA ---");

        System.out.print("Código da turma: ");
        int codigoTurma = Integer.parseInt(sc.nextLine());

        System.out.print("Registro do professor: ");
        int registro = Integer.parseInt(sc.nextLine());

        Professor professor = service.buscarProfessor(registro);

        if (professor == null) {
            System.out.println("Professor não encontrado!");
            return;
        }

        System.out.print("Código do curso: ");
        int codigoCurso = Integer.parseInt(sc.nextLine());

        Curso curso = service.buscarCurso(codigoCurso);

        if (curso == null) {
            System.out.println("Curso não encontrado!");
            return;
        }

        Turma turma = new Turma(
            codigoTurma, professor, curso
        );

        service.cadastrarTurma(turma);

        System.out.println("Turma criada com sucesso!");
    }

    private void adicionarAlunoTurma() {

        System.out.println("\n--- ADICIONAR ALUNO À TURMA ---");

        System.out.print("Matrícula do aluno: ");
        int matricula = Integer.parseInt(sc.nextLine());

        System.out.print("Código da turma: ");
        int codigoTurma = Integer.parseInt(sc.nextLine());

        service.associarAlunoTurma(matricula, codigoTurma);

        System.out.println("Aluno adicionado à turma com sucesso!");
    }

    private void registrarAvaliacao() {

        System.out.println("\n--- REGISTRAR AVALIAÇÃO ---");

        System.out.print("Matrícula do aluno: ");
        int matricula = Integer.parseInt(sc.nextLine());

        System.out.print("Código da turma: ");
        int codigoTurma = Integer.parseInt(sc.nextLine());

        System.out.print("Descrição da avaliação: ");
        String descricao = sc.nextLine();

        System.out.print("Nota (0 a 10): ");
        double nota = Double.parseDouble(
            sc.nextLine().replace(",", ".")
        );

        service.registrarAvaliacao(
            matricula, codigoTurma, nota, descricao
        );

        System.out.println("Avaliação registrada com sucesso!");
    }

    private void gerarRelatorios() {

        System.out.println("\n===== RELATÓRIOS GERAIS =====");

        System.out.println("\n--- ALUNOS ---");

        if (service.listarAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        }

        for (Aluno aluno : service.listarAlunos()) {
            System.out.println(aluno.gerarRelatorio());
        }

        System.out.println("\n--- PROFESSORES ---");

        if (service.listarProfessores().isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        }

        for (Professor professor : service.listarProfessores()) {
            System.out.println(professor.gerarRelatorio());
        }

        System.out.println("\n--- CURSOS ---");

        if (service.listarCursos().isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        }

        for (Curso curso : service.listarCursos()) {
            System.out.println(curso.gerarRelatorio());
        }

        System.out.println("\n--- TURMAS ---");

        if (service.listarTurmas().isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
        }

        for (Turma turma : service.listarTurmas()) {
            System.out.println(turma);
        }
    }
}
