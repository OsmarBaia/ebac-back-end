public class Main {
    public static void main(String[] args) {
        CalculoMedia gradesCalc = new CalculoMedia();
        gradesCalc.setNotas(4);
        float avarege = gradesCalc.getAvarege();
        System.out.printf("A média do aluno é: %.2f\n", avarege);
        if(avarege >= 7){
            System.out.println("Aluno Aprovado!");
        }else if(avarege >=5){
             System.out.println("Aluno em Recuperação!");
        }else{
            System.out.println("Aluno em Reprovado!");
        }
     }
}
