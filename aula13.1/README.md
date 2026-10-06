# Aula 13.1

## Class Diagram

```mermaid
    classDiagram
        EnviadorEmail ..|> Runnable
        class EnviadorEmail {
            -String email
            -String mensagem

            +run() void
        }
        class Runnable {
            <<interface>>
            +run() void
        }
 ```