# Aula 09

## Class Diagram

```mermaid
    classDiagram
        JogadorNaoEncontradoException <|-- Exception
        Jogador <|-- Atacante
        Jogador <|-- Zagueiro
        Time "1" --> "0..*" Jogador

        class Jogador {
            <<abstract>>
            -String nome
            -int numeroCamisa

            +jogar()* void
        }
        class JogadorNaoEncontradoException {

        }
        class Atacante {
            +jogar() void
        }
        class Time {
            -String nome
            -List~Jogador~ elenco

            +escalar() void
            +escalarVarios() void
            +expulsar() void
            +listarElenco() void

        }
        class Zagueiro {
            +jogar() void
        }
 ```