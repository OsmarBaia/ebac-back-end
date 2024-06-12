public class PessoaJuridica extends Pessoa{
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void pagarTributos() {
        System.out.println(getNome() + " está pagando tributos como Pessoa Jurídica.");
    }

    // Implementação do método polimórfico
    @Override
    public void apresentar() {
        System.out.println("Olá, nós somos a empresa " + getNome() + " e somos uma Pessoa Jurídica.");
    }

}

