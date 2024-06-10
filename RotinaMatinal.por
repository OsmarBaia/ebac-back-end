programa {
  funcao AbrirOsOlhos()
  funcao Espregicar()
  funcao RemoverLencol()
  funcao LevantarDaCama()
  
  funcao Acordar(){
     AbrirOsOlhos()
     RemoverLencol()
     Espregicar()
     LevantarDaCama()
     Espregicar()
  }

  funcao AtravessarOQuarto()
  funcao PegarGarrafaTerminca()
  funcao LevarGarrafaAteABoca()
  funcao Beber(cadeia bebida)
  
  funcao Hidratar(){
      AtravessarOQuarto()
      PegarGarrafaTerminca()
      LevarGarrafaAteABoca()
      Beber("agua")
  }  

  funcao OperarPorta(cadeia acao)
  funcao AtravessarACasa()
  funcao AtravessarACozinha()
  funcao OperarCafeteira(cadeia acao)
  funcao PrepararCapsulaCafe()  
  funcao Aguardar()
  funcao LimparCafeteira()
  funcao LimparLouca()
  
  funcao CafeDaManha(){    
    AtravessarOQuarto()
    OperarPorta("abrir")
    AtravessarACasa()
    AtravessarACozinha()
    OperarCafeteira("ligar")
    PrepararCapsulaCafe()
    OperarCafeteira("coar")
    Aguardar()
    Beber("cafe")
    OperarCafeteira("desligar")
    LimparCafeteira()
    LimparLouca()
  }

  funcao EntrarBanheiro()
  funcao AtravessarBanheiro()
  funcao SeDespir()
  funcao EntrarBox()
  funcao Banho()
  funcao Enxugar()

  funcao Higiene(){
    AtravessarACozinha()
    AtravessarACasa()
    AtravessarOQuarto()    
    OperarPorta("abrir")
    EntrarBanheiro()
    OperarPorta("fechar")
    SeDespir()
    AtravessarBanheiro()
    OperarPorta("abrir")
    EntrarBox()
    OperarPorta("fechar")
    Banho()
    Enxugar()
    OperarPorta("abrir")
    AtravessarBanheiro()
    AtravessarOQuarto()
  }

  funcao PendurarToalha()
  funcao OperarArmario(cadeia acao)
  funcao VestirRoupas()
  funcao SentarNaCama()
  funcao CalcaSapatos()
  funcao PegarCelular()
  funcao PegarChavesCarro()
  funcao SairDeCasa()

  funcao Trabalhar(){
      PendurarToalha()
      OperarArmario("abrir")
      VestirRoupas()
      AtravessarOQuarto()
      SentarNaCama()
      CalcaSapatos()
      LevantarDaCama()
      AtravessarOQuarto()
      PegarCelular()      
      PegarChavesCarro()
      AtravessarOQuarto()
      OperarArmario("fechar")
      AtravessarOQuarto()
      OperarPorta("fechar")
      AtravessarACasa()
      OperarPorta("Abrir")
      SairDeCasa()
      OperarPorta("Fechar")
      OperarPorta("Trancar")
  }
  
  funcao inicio() {
    Acordar()
    CafeDaManha()
    Trabalhar()
  }
}
