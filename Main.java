public class Main {
    public static void main(String[] args) {
       Carro car =  new Carro("Hyundai","HB20S",2020);
       car.setQntLitrosGasolina(50);
       System.out.printf("-==   Dados do carro   ==- \n %s\n com %.2f L de gasolina", car.toString(), car.getQntLitrosGasolina());
       System.out.printf("\nAcelerar! %s", car.Acelerar());
       System.out.printf("\nCombustivel após a brincadeira: %.2f L", car.getQntLitrosGasolina());
    }
}

