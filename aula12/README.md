# Aula 12

## Class Diagram

```mermaid
    classDiagram
    GestaoFaculdade "1" --> "0..*" Aluno : gerencia
    class Aluno {
        -String matricula
        -String nome
        -String email

        +exibirDados() void
    }
    class GestaoFaculdade {
        -Set~String~ emailsCadastrados
        -Map~String, Aluno~ mapaAlunos

        +cadastrarEmail(String email) void
        +matricularAluno(Aluno aluno) void
        +buscarPorMatricula(String matricula) Aluno
    }
 ```