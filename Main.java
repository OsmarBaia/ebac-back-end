import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entradaParte1, entradaParte2;
        // Parte 1
        System.out.println("\nParte 1:\n");

        // Entrada da lista
        System.out.println("Por Favor insira um lista de nomes dividida por virgulas: ");
        // entradaParte1 = sc.nextLine();

        //Simulação de entrada
        entradaParte1 = "João, Maria, José, Ana, Pedro";
        System.out.println(entradaParte1);

        //Separação dos nomes
        List<String> part1Nome = Arrays.asList(entradaParte1.split(",\\s*"));
        Collections.sort(part1Nome);

        //Impresão
        System.out.println("\nNomes Ordenados:");
        for (String nome : part1Nome) {
            System.out.println(nome);
        }


        // Parte 2
        System.out.println("\nParte 2:\n");

        // Entrada de nomes e sexo
        System.out.println("Por Favor insira um lista de 'nomes-sexo' dividida por virgulas: ");
        //entradaParte2 = sc.nextLine();

        //Simulação de entrada
        entradaParte2 = "João-Masculino, Maria-Feminino, José-Masculino, Ana-Feminino, Pedro-Masculino";

        System.out.println(entradaParte2);

        // Separação, classificação e ordenação
        Map<String, String> mapNomeSexo = new TreeMap<>();
        for (String entradaNomeSexo : entradaParte2.split(",\\s*")) {
            String[] partes = entradaNomeSexo.split("-");
            mapNomeSexo.put(partes[0], partes[1].toUpperCase());
        }

        // Impressão
        System.out.println("\nPessoas do sexo masculino:");
        for (Map.Entry<String, String> entry : mapNomeSexo.entrySet()) {
            if (entry.getValue().equals("MASCULINO")) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("\nPessoas do sexo feminino:");
        for (Map.Entry<String, String> entry : mapNomeSexo.entrySet()) {
            if (entry.getValue().equals("FEMININO")) {
                System.out.println(entry.getKey());
            }
        }

        sc.close();
    }
}
