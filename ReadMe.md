# Tarefa Annotations

```mermaid
classDiagram
    class Tabela {
        <<annotation>>
        +String value()
    }

    class Cliente {
        -int id
        -String nome
        +Cliente()
        +int getId()
        +void setId(int id)
        +String getNome()
        +void setNome(String nome)
    }

    class Main {
        +void main(String[] args)
    }

    Tabela --|> Annotation
    Cliente ..> Tabela : @Tabela("Clientes")
    Main --> Cliente : uses