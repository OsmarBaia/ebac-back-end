# Tarefa Wrappers, (un)boxing e casting
## Implementação
### Main.java
```
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre um numero inteiro: ");
        int idade = sc.nextInt();

        // Boxing
        Integer idadeWrapper = idade;

        // Unboxing
        int idadePrimitiva = idadeWrapper; 

        // Casting
        System.out.println("Entre um numero decimal: ");
        double salarioDouble = sc.nextDouble();
        
        int salarioInteiro = (int) salarioDouble;

        System.out.println("Idade (Wrapper): " + idadeWrapper);
        System.out.println("Idade (Primitiva): " + idadePrimitiva);
        System.out.println("Salário (Inteiro): " + salarioInteiro);
    }
```
