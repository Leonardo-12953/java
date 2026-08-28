## Garagem Desafio de Herança em Java 
# todo esse Readme foi feito pela AI, mas o codigo e lógica não.

Projeto prático desenvolvido para consolidar e validar o aprendizado dos pilares de **Orientação a Objetos (POO)** em Java, focando especificamente em **Herança** e **Encapsulamento**.

---

## Objetivo do Projeto

O objetivo deste desafio foi construir um sistema de veículos do zero, de forma independente (sem consultas ou modelos pré-prontos), para demonstrar a reutilização de código e a especialização de classes através de herança.

---

## Estrutura do Código

O projeto é composto por 4 partes principais:

* **`Veiculo.java` (Classe Mãe):** Define a estrutura base e armazena os atributos genéricos comuns a qualquer veículo (`marca`, `modelo`, `ano`, `cor`), utilizando encapsulamento com atributos `private` e métodos *getters/setters*.
* **`Carro.java` (Classe Filha):** Herda de `Veiculo` via `extends` e adiciona regras de negócio específicas para carros, como a obrigatoriedade do uso de cinto de segurança (`usarCintoSeguranca`).
* **`Moto.java` (Classe Filha):** Herda de `Veiculo` via `extends`, adiciona o atributo específico de segurança (`usarCapacete`) e implementa o método exclusivo `empinar()`.
* **`Main.java` (Execução):** Instancia os objetos na memória, atribui os dados, consome as propriedades herdadas e executa os comportamentos no console.

---

## Conceitos Aplicados

- **Herança (`extends`):** Compartilhamento de atributos e métodos da classe genérica para as classes especializadas.
- **Encapsulamento:** Proteção do estado interno dos objetos via modificador `private` e controle de acesso por *getters* e *setters* (utilizando a convenção `is` para booleanos).
- **Instanciação:** Criação de objetos distintos e vivos na memória usando o operador `new`.

---

## Exemplo de Saída no Terminal

```text
-- Veiculos --

Marca: Ford
Modelo: Ka
Ano: 2015
Cor: Prata
Obrigatório uso de cinto: true

Marca: Honda
Modelo: CG 150
Ano: 2015
Cor: Azul
Obrigatório uso de capacete: true
Vou fazer uma manobra pra demonstrar minha habilidade !
Empinando a moto: Veículo se equilibra sobre a roda traseira da moto, e dianteira fica no ar.