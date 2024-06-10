# Tarefa - Collections Parte 1

## Implementação

```
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Entrada Manual
            // System.out.println("Entre a lista de nomes, os nomes devem ser separados por virgulas");            
            // String entriedNames = sc.nextLine();            


            //Entrada Simulada
            String entriedNames =  "Maria, João, Ana, Pedro, Sofia, Lucas, Laura, Miguel, Isabela, Gabriel";                   
            
            String[] names =  entriedNames.trim().split(",");
            
            Collator collator = Collator.getInstance(new Locale("pt", "BR"));
            Arrays.sort(names,collator);
            
            for (String nome : names) {
            System.out.println(nome);
            }
        }
    }
```
