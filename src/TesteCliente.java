public class TesteCliente {
    public static void main(String[] args){
        Cliente marcus = new Cliente();
        marcus.setNome("Marcus Ramos");
        marcus.setCpf("123.456.789-09");
        marcus.setProfissao("programador");

        Conta contaDoMarcus = new Conta();
        contaDoMarcus.deposita(100);
    }
}
