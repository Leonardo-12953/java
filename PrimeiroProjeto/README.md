## Primeiro Projeto em Java

### Projeto Naruto

Projeto desenvolvido durante meus primeiros estudos de Java e
Programação Orientada a Objetos, acompanhado pelo conteúdo do canal Fiasco.

### Referência

Canal/aula utilizada como base:
[https://www.youtube.com/watch?v=OIYWA1GwCEs&list=WL&index=1]


## Testando Modelagem de Sistemas (UML)

### Diagrama de Classes

classDiagram
    %% Classe Mãe Ninja
    class Ninja {
        -String nome
        -String aldeia
        -int idade
        +getNome() String
        +getAldeia() String
        +getIdade() int
        +setNome(String nome) void
        +setAldeia(String aldeia) void
        +setIdade(int idade) void
    }

    %% Classes Filhas de Ninja
    class Uzumaki {
        -boolean temBiju
        +setTemBiju(boolean temBiju) void
        +isTemBiju() boolean
        +chakraInfinito() void
        +ModoSabioAtivado() void
    }

    class Uchiha {
        +sharinganAtivado() void
        +usarHabilidadeChakra(int nivelDeChakra) void
        +getNivelSharingan(int nivel) String
    }

    class Haruno {
        -boolean temByakugou
        -int nivelNinjutsuMedico
        -int forcaBruta
        +isTemByakugou() boolean
        +setTemByakugou(boolean temByakugou) void
        +getNivelNinjutsuMedico() int
        +getForcaBruta() int
        +setNivelNinjutsuMedico(int nivelNinjutsuMedico) void
        +setForcaBruta(int forcaBruta) void
        +curarParceiro() void
        +impactoMonstruoso() void
    }

    class Hyuga {
        -int danoJuuken
        -boolean byakuganAtivado
        +isByakuganAtivado() boolean
        +setByakuganAtivado(boolean byakuganAtivado) void
        +getDanoJuuken() int
        +setDanoJuuken(int danoJuuken) void
        +usarJuuken(int quantidadeDeGolpes) void
    }

    %% Hierarquia de Ninja (Herança)
    Ninja <|-- Uzumaki
    Ninja <|-- Uchiha
    Ninja <|-- Haruno
    Ninja <|-- Hyuga

    %% Classe Mãe Arma
    class Arma {
        -String nome
        -int danoBase
        +getNome() String
        +getDanoBase() int
        +usarArma() void
    }

    %% Classes Filhas de Arma
    class Shuriken {
        -int tipoDeShuriken
        +usarArma() void
    }

    class Kunai {
        -boolean temPapelBomba
        +usarArma() void
    }

    %% Hierarquia de Arma (Herança)
    Arma <|-- Shuriken
    Arma <|-- Kunai