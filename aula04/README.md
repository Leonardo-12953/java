# Aula 04

## Class Diagram

```mermaid
    classDiagram
        Jogador <|-- Atacante
        Jogador <|-- Zagueiro
        Jogador <|-- MeiaAtacante 
        MeiaAtacante ..|> BatedorDeFalta
        class Jogador {
            <<abstract>>
            #String nome
            #int numeroCamisa

            +jogar()* void
        }
        class BatedorDeFalta {
            <<interface>>
            +cobrarFalta() void
        }
        class Atacante {
            +jogar() void
        }
        class MeiaAtacante {
            +jogar() void
            +cobrarFalta() void
        }
        class Zagueiro {
            +jogar() void
        }

```