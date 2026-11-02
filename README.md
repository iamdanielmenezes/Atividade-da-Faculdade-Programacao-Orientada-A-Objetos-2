# Sistema de Gestão Educacional

Projeto desenvolvido em **Java** como parte de uma atividade MAPA da disciplina de **Imersão Profissional: Aplicando Orientação a Objetos**, do curso de **Análise e Desenvolvimento de Sistemas (ADS)** da UniCesumar.

O objetivo da atividade foi desenvolver um sistema simplificado de gestão educacional, colocando em prática conceitos fundamentais de **Programação Orientada a Objetos (POO)**, desde a criação de classes e objetos até a organização do projeto em diferentes camadas.

O projeto foi desenvolvido gradualmente, dividido em **7 fases e uma fase final**, com commits realizados ao longo das etapas para registrar a evolução do código e dos conceitos aplicados.

## Conceitos praticados

- Classes, objetos, atributos e métodos
- Construtores
- Encapsulamento, getters e setters
- Modificadores de acesso (`private`, `public` e `protected`)
- Relacionamento e associação entre objetos
- Coleções com `ArrayList` e `List`
- Herança e polimorfismo
- Classes abstratas e interfaces
- Sobrescrita de métodos (`@Override`)
- Validação de dados e regras de negócio
- Tratamento de exceções (`try/catch`)
- Entrada de dados com `Scanner`
- Estruturas condicionais e de repetição
- Organização do código em pacotes
- Separação de responsabilidades entre camadas

## Sobre a atividade

A atividade propõe o desenvolvimento de um **Sistema de Gestão Educacional**, capaz de representar e gerenciar informações de alunos, professores, cursos, turmas e avaliações.

O sistema foi construído de maneira progressiva, permitindo aplicar os conceitos de orientação a objetos conforme novas funcionalidades eram adicionadas.

Nas primeiras fases, o foco foi a modelagem das entidades e seus relacionamentos. Posteriormente, foram implementados encapsulamento, herança, interfaces, polimorfismo e geração de relatórios.

Por fim, o projeto foi organizado em camadas e integrado a um menu interativo, permitindo realizar cadastros, criar turmas, associar alunos e professores, registrar avaliações e consultar relatórios pelo console.

## Fases

### Fase 1 — Modelagem das Classes Básicas

Aplicar os conceitos iniciais de Programação Orientada a Objetos, representando os principais elementos de um sistema educacional por meio de classes Java.

**O que foi desenvolvido:**

- Criar a classe `Aluno`, com os atributos:
  - `String nome`
  - `int matricula`
  - `String curso`
- Criar a classe `Professor`, com os atributos:
  - `String nome`
  - `String especialidade`
  - `int registro`
- Criar a classe `Curso`, com os atributos:
  - `String nome`
  - `int codigo`
  - `String cargaHoraria`
- Implementar construtores para inicializar os objetos.
- Criar métodos getters e setters para acessar e modificar os atributos.
- Sobrescrever o método `toString()` para apresentar as informações dos objetos.
- Instanciar alunos, professores e cursos na classe principal e exibir seus dados no console.

Nesta fase, foi construída a base do sistema, utilizando classes para representar entidades do ambiente educacional.

### Fase 2 — Relacionamento entre Objetos

Implementar associações entre as classes, permitindo organizar alunos, professores e cursos em turmas.

**O que foi desenvolvido:**

- Criar a classe `Turma`.
- Implementar os atributos:
  - `int codigo`
  - `Professor professor`
  - `Curso curso`
  - `List<Aluno> listaAlunos`
- Utilizar `ArrayList` para armazenar os alunos associados à turma.
- Criar métodos para:
  - `adicionarAluno()`
  - `removerAlunos()`
  - `quantidadeAlunos()`
- Associar uma turma a um professor e a um curso.
- Implementar o método `toString()` para apresentar as informações da turma e a quantidade de alunos.

Nesta etapa, foram praticados os conceitos de **associação entre objetos e utilização de coleções**, permitindo que uma turma reunisse diferentes entidades do sistema.

### Fase 3 — Encapsulamento e Controle de Avaliações

Aplicar encapsulamento para proteger as informações das avaliações e estabelecer regras para atribuição de notas.

**O que foi desenvolvido:**

- Criar a classe `Avaliacao`.
- Implementar os atributos privados:
  - `double nota`
  - `String descricao`
  - `Aluno aluno`
- Criar o método `atribuirNota(double nota)`.
- Validar as notas, permitindo somente valores entre **0 e 10**.
- Exibir uma mensagem quando uma nota inválida for informada.
- Associar uma avaliação a um aluno.
- Adicionar à classe `Turma` uma lista de avaliações.
- Criar o método `adicionarAvaliacao()` para armazenar avaliações na turma.

O principal objetivo desta fase foi compreender como o **encapsulamento** permite controlar a alteração de atributos e aplicar validações aos dados.

### Fase 4 — Herança e Especialização de Cursos

Aplicar os conceitos de herança e sobrescrita de métodos, permitindo representar diferentes modalidades de cursos.

**O que foi desenvolvido:**

- Utilizar `Curso` como classe base.
- Criar a classe `CursoPresencial`, herdando de `Curso`.
- Adicionar à classe `CursoPresencial` o atributo `salaDeAula`.
- Criar a classe `CursoEAD`, também herdando de `Curso`.
- Adicionar à classe `CursoEAD` o atributo `plataformaVirtual`.
- Implementar o método `detalharCurso()` na classe base.
- Sobrescrever `detalharCurso()` nas subclasses utilizando `@Override`.
- Apresentar informações específicas de cada modalidade de curso.

Nesta fase, foi possível compreender como a **herança** permite reutilizar atributos e métodos de uma classe base, enquanto a sobrescrita possibilita comportamentos específicos nas subclasses.

### Fase 5 — Classes Abstratas e Interfaces

Implementar uma estrutura comum para os usuários do sistema e definir um contrato de autenticação.

**O que foi desenvolvido:**

- Criar a classe abstrata `Usuario`.
- Implementar os atributos:
  - `String nome`
  - `String login`
  - `String senha`
- Criar construtores e métodos de acesso.
- Implementar o método `validarCredenciais()` para verificar login e senha.
- Criar a interface `Autenticacao`.
- Declarar na interface o método `boolean autenticar(String login, String senha)`.
- Fazer com que as classes `Aluno`, `Professor` e `Administrador` herdem de `Usuario` e implementem `Autenticacao`.
- Implementar o método `autenticar()` nas classes correspondentes.

Nesta etapa, foram praticados os conceitos de **abstração, herança e interfaces**, permitindo compartilhar características entre diferentes tipos de usuários e estabelecer um comportamento comum de autenticação.

### Fase 6 — Polimorfismo e Geração de Relatórios

Aplicar polimorfismo para permitir que diferentes entidades do sistema apresentem suas informações por meio de métodos com o mesmo nome.

**O que foi desenvolvido:**

- Implementar o método `gerarRelatorio()` na classe `Aluno`.
- Implementar o método `gerarRelatorio()` na classe `Professor`.
- Implementar o método `gerarRelatorio()` na classe `Curso`.
- Personalizar o conteúdo do relatório conforme o tipo de objeto.
- Criar um menu de relatórios no console.
- Utilizar `Scanner` para receber a opção escolhida pelo usuário.
- Implementar estruturas condicionais e de repetição para permitir a consulta de diferentes relatórios durante a execução.

O objetivo desta fase foi praticar o uso de **métodos com comportamentos específicos para diferentes objetos**, além de desenvolver a primeira versão de um menu interativo.

### Fase 7 — Organização do Projeto em Camadas

Organizar o código em pacotes, separando as responsabilidades de cada parte do sistema para facilitar a manutenção e a evolução do projeto.

**O que foi desenvolvido:**

- Criar o pacote `model`, responsável pelas entidades do sistema.
- Criar o pacote `repository`, responsável pelo armazenamento temporário dos dados.
- Implementar a classe `SistemaRepository`, utilizando listas para armazenar alunos, professores, cursos e turmas.
- Criar o pacote `service`, responsável pela comunicação com o repository e pelas regras de negócio.
- Implementar a classe `SistemaService`, com métodos para cadastro, consulta e gerenciamento das entidades.
- Criar o pacote `ui`, responsável pela interação com o usuário.
- Implementar a classe `Menu`, utilizando `Scanner` para receber os comandos.
- Organizar a classe `Main` no pacote `app`, responsável por inicializar e integrar as camadas.

A estrutura foi organizada da seguinte forma:

```text
src/
├── app/
│   └── Main.java
├── interfaces/
│   └── Autenticacao.java
├── model/
│   ├── Administrador.java
│   ├── Aluno.java
│   ├── Avaliacao.java
│   ├── Curso.java
│   ├── CursoEAD.java
│   ├── CursoPresencial.java
│   ├── Professor.java
│   ├── Turma.java
│   └── Usuario.java
├── repository/
│   └── SistemaRepository.java
├── service/
│   └── SistemaService.java
└── ui/
    └── Menu.java
```

Nesta fase, foi praticada a **separação de responsabilidades**, organizando o fluxo de funcionamento do sistema entre a interface, as regras de negócio e o armazenamento dos dados.

### Fase Final — Integração do Sistema Educacional

Consolidar todas as funcionalidades desenvolvidas nas fases anteriores, criando um sistema interativo capaz de realizar operações de cadastro e gerenciamento educacional pelo console.

**O que foi desenvolvido:**

- Integrar as classes e funcionalidades das fases anteriores.
- Criar um menu interativo com as opções:
  - Cadastrar aluno.
  - Cadastrar professor.
  - Cadastrar curso.
  - Criar turma.
  - Adicionar aluno à turma.
  - Registrar avaliação.
  - Gerar relatórios gerais.
  - Encerrar o sistema.
- Permitir o cadastro de cursos presenciais e EAD.
- Associar professores e cursos às turmas.
- Associar alunos às turmas cadastradas.
- Registrar avaliações vinculadas aos alunos e às turmas.
- Validar notas, permitindo apenas valores entre 0 e 10.
- Impedir cadastros com matrículas, registros e códigos duplicados.
- Verificar a existência de alunos, professores, cursos e turmas antes de realizar determinadas operações.
- Implementar tratamento de exceções para entradas inválidas.
- Gerar relatórios gerais com as informações cadastradas.
- Realizar testes de sucesso e falha para verificar o comportamento do sistema.

**Cenários testados:**

- Cadastro de alunos, professores e cursos.
- Criação de turma e associação com professor e curso.
- Associação de aluno a uma turma existente.
- Registro de avaliação com nota válida.
- Geração de relatórios gerais.
- Tentativa de cadastro com matrícula duplicada.
- Tentativa de associação de aluno inexistente.
- Tentativa de registro de avaliação com nota fora do intervalo permitido.
- Seleção de uma opção inexistente no menu.

A fase final permitiu reunir os conceitos estudados durante a atividade em um único programa, demonstrando o funcionamento das entidades e a comunicação entre as camadas.

## Tecnologias utilizadas

- **Java**
- **Eclipse IDE**
- **Programação Orientada a Objetos (POO)**
- **Java Collections (`ArrayList` e `List`)**

## Como executar o projeto

1. Clone o repositório ou faça o download dos arquivos.
2. Abra o projeto no **Eclipse IDE**.
3. Certifique-se de que o Java esteja configurado no ambiente.
4. Localize a classe `Main.java`, dentro do pacote `app`.
5. Execute a classe utilizando **Run As → Java Application**.
6. Utilize o menu apresentado no console para realizar os cadastros e demais operações.

**Observação:** o sistema utiliza listas em memória para armazenar os dados. Portanto, os registros realizados durante a execução não são mantidos após o encerramento do programa.

## Objetivo pessoal

Este projeto teve como principal objetivo **praticar e aprofundar meus conhecimentos em Programação Orientada a Objetos utilizando Java**, aplicando gradualmente os conceitos estudados durante a disciplina.

O desenvolvimento por fases permitiu compreender melhor como classes e objetos se relacionam, como proteger informações utilizando encapsulamento e como aplicar herança, interfaces e polimorfismo na construção de um sistema.

Além disso, a organização do projeto em camadas contribuiu para o aprendizado sobre **estruturação de código, separação de responsabilidades e implementação de regras de negócio**.

Por se tratar de uma atividade acadêmica, o foco não foi desenvolver um sistema completo para uso em produção, mas compreender e aplicar os conceitos estudados, acompanhando a evolução do código desde as primeiras classes até a integração final.

---

**Projeto acadêmico desenvolvido para fins de estudo e prática.**
