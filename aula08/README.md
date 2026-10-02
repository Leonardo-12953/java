# Aula 08

## Class Diagram

```mermaid
    BolsaNinja~T~ "1" --> "0..*" Kunai
    BolsaNinja~T~ "1" --> "0..*" Shuriken
    BolsaNinja~T~ "1" --> "0..*" Pergaminho
    classDiagram
        class BolsaNinja~T~ {
            -List~T~ ferramentas
            
            +adicionarFerramenta(T ferramenta) void
            +mostrarFerramenta() void
        }
        class Kunai {
            -String nome

            +toString() String
        }
        class Pergaminho {
            -String conteudo

            +toString() String
        }
        class Shuriken {
            -int tamanho

            +toString() String
        }

 ```