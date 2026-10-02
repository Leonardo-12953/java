# Aula 06

## Class Diagram

```mermaid
    classDiagram
        Jogador <|-- Atacante
        Jogador <|-- MeioCampista
        Jogador <|-- Zagueiro
        class Jogador {
            <<abstract>>
            #String nome
            #int numeroCamisa

            +jogar()* void
        }
        class Atacante {
            +jogar() void
        }
        class MeioCampista {
            +jogar() void
        }
        class Zagueiro {
            +jogar() void
        }

```