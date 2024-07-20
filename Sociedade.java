public class Sociedade {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "da Silva", "123.456.789-00", "Rua Imaginaria");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Canalização","LTDa.", "12.345.678/0001-99", "Canalização LTDa");

        System.out.println();
        pessoaFisica.exibirDados();
        System.out.println();
        pessoaJuridica.exibirDados();
    }
}
