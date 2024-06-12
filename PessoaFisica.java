public class PessoaFisica extends Pessoa{
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + getNome() + " e sou uma Pessoa Física.");
    }

    @Override
    public String getNumIdentificacao(){
        return this.cpf;
    }

    @Override
    public String setNumIdentificacao(String identificacao){
        return this.cpf;
    }
}
