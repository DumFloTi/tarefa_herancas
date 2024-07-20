public class PessoaFisica extends Pessoa {

    private String cpf;
    private String morada;

    public PessoaFisica(String nome, String sobrenome, String cpf, String morada) {
        super(nome, sobrenome, cpf);
        this.cpf = cpf;
        this.morada = morada;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Fisica -");
        System.out.println("\nNome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Morada: " + getMorada());
    }
}
