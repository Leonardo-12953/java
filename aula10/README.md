# Aula 10

## Class Diagram

```mermaid
    classDiagram
        SaldoInsuficienteException <|-- RuntimeException
        class ContaBancaria {
            -String titular
            -double saldo

            +depositar() void
            +sacar() void
            +exibirSaldo() void
        }
        class SaldoInsuficienteException {

        }
 ```