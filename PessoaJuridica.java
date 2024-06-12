public class PessoaJuridica extends Pessoa{
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, nós somos a empresa " + getNome() + " e somos uma Pessoa Jurídica.");
    }

    @Override
    public String getNumIdentificacao(){
        return this.cnpj;
    }

    @Override
    public String setNumIdentificacao(String identificacao){
        return this.cnpj;
    }

}

