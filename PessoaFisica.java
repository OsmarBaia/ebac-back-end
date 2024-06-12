public class PessoaFisica extends Pessoa{
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    // Getter e Setter específico
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void pagarImpostos() {
        System.out.println(getNome() + " está pagando impostos como Pessoa Física.");
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + getNome() + " e sou uma Pessoa Física.");
    }
}
