public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String sobrenome, String cnpj, String razaoSocial) {
        super(nome, sobrenome, cnpj);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Juridica -");
        System.out.println("\nNome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Razão Social: " + getRazaoSocial());
    }
}
