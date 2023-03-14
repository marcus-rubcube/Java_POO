public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente marcus = new Cliente();

        marcus.setNome("Marcus Ramos");
        marcus.setCpf("123.456.789-09");

        conta.setTitular(marcus);

        // the same thing
        conta.getTitular().setProfissao("Developer");

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Developer!");
        //

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getProfissao());
    }
}
