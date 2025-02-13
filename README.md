# Injeção de Dependências

## O que é Injeção de Dependencias?
É um padrão de design usado para implementar o princípio de inversão de controle, o qual permite que as dependências de uma classe sejam fornecidas externamente, em vez de serem criadas internamente pela própria classe, com  objetivo de separar a lógica de criação de objetos da lógica de negócioso tornando o código mais modularizado, testável e fácil de manter.

### Exemplo *SEM* Injeção de Dependência:

Abaixo, a classe `Car` está diretamente acoplada à classe `Engine`. Isso dificulta a substituição de `Engine` por uma implementação diferente (por exemplo, um motor 
elétrico).

```java
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // A classe Car cria sua própria dependência (Engine).
    }
}
```

### Exemplo *COM* Injeção de Dependência:

Ao implementarmos a inverção de controle, a classe `Car` não mais precisa criar `Engine`. A dependência é fornecida externamente, o que torna o código mais flexível.

```java
public class Car {
    private Engine engine;

    public Car(Engine engine) { // A dependência (Engine) é injetada via construtor.
        this.engine = engine;
    }
}
```

---

## Tipos de Injeção de Dependência:

1. **Injeção por Construtor**:
   - As dependências são fornecidas através do construtor da classe.
   - Exemplo:
     ```java
     public class Car {
         private Engine engine;

         public Car(Engine engine) {
             this.engine = engine;
         }
     }
     ```

2. **Injeção por Setter**:
   - As dependências são fornecidas através de métodos setter.
   - Exemplo:
     ```java
     public class Car {
         private Engine engine;

         public void setEngine(Engine engine) {
             this.engine = engine;
         }
     }
     ```

3. **Injeção por Campo**:
   - As dependências são injetadas diretamente em campos da classe (geralmente usando frameworks como Spring).
   - Exemplo:
     ```java
     public class Car {
         @Autowired
         private Engine engine;
     }
     ```

---

## O que é Injeção de Dependência por String?

É uma abordagem em que as dependências são identificadas por **nomes (strings)** em vez de tipos ou interfaces, é comum em frameworks ou sistemas que usam configurações baseadas em texto (como XML ou JSON) para definir dependências.  

O Spring é o framework mais popular para injeção de dependência em Java e suporta configuração via XML, anotações ou código Java. 

### Exemplo com XML:

O Spring lê o arquivo de configuração e resolve as dependências com base nas strings fornecidas.

```xml
<beans>
    <bean id="engine" class="com.example.ElectricEngine" />
    <bean id="car" class="com.example.Car">
        <property name="engine" ref="engine" />
    </bean>
</beans>
```

Nesse exemplo,
+ O `id` é uma string que identifica a dependência.
+ O `ref` é uma string que referencia outra dependência.
O spring sabe que a dependência `engine` deve ser uma instância de `ElectricEngine` e a injeta na classe `Car`.

---

### Exemplo com Anotações:
   ```java
   @Component
   public class ElectricEngine implements Engine {
       @Override
       public void start() {
           System.out.println("Electric Engine started.");
       }
   }

   @Component
   public class Car {
       private final Engine engine;

       @Autowired
       public Car(Engine engine) {
           this.engine = engine;
       }

       public void drive() {
           engine.start();
       }
   }
   ```
