public class Main {
    public static void main(String[] args) {
        PessoaFisica pfJoao = new PessoaFisica("João Silva", "Avenida lugar nenhum", "12365478900");
        PessoaJuridica pjMagazine = new PessoaJuridica("Mega Mercadão do Jão", "Travessa algum lugar", "00019876543210");

       pfJoao.apresentar();
       pjMagazine.apresentar();

       System.out.println("A classe de pfJoao é: "+pfJoao.getClass());
       System.out.println("A classe de pjMagazine é: "+pjMagazine.getClass());
    }
}
