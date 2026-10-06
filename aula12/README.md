# Aula 12

## Class Diagram

```mermaid
    class Aluno {
    GestaoFaculdade "1" --> "0..*" Aluno : gerencia
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