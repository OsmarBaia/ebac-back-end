# 13 - Interfaces, Heranças, Composição e agregação

```mermaid
classDiagram
direction BT

class IEndereco {
<<Interface>>
    +setEndereco(endereco : String) : Void
    +getEndereco() : String
}

class IIdentidade {
<<Interface>>
    + setNumIdentificacao(num: String) 
    + getNumIdentificacao() : String
    + setNome(name : String)
    + getNome() : String
  }

  class Main {
    + Main()
    + main(String[]) void
  }

  class Pessoa {
    + Pessoa(String, String)
    - String nome
    - String endereco
    + setNumIdentificacao(String) : Void
    + getNumIdentificacao() : String    
    + getNome () : String
    + setNome (nome : String) : void
    + String getEndereco() : String
    + setEndereco (endereco : String): void
    + getnumIdentificacao () : String
    + setnumIdentificacaov(identificacao : String)
    + apresentar() : void
  }
  class PessoaFisica {
    - String cpf
    + PessoaFisica(String, String, String)    
    + getnumIdentificacao () : String
    + setnumIdentificacaov(identificacao : String)
    + apresentar() : void
  }
  class PessoaJuridica {
    - String cnpj
    + PessoaJuridica(String, String, String)    
    + getnumIdentificacao () : String
    + setnumIdentificacaov(identificacao : String)
    + apresentar() : void
  }

Pessoa  ..>  IEndereco
Pessoa  ..>  IIdentidade
PessoaFisica  -->  Pessoa
PessoaJuridica  -->  Pessoa 

```
