public class TesteCliente {
    public static void main(String[] args){
        Cliente marcus = new Cliente();
        marcus.nome = "Marcus Ramos";
        marcus.cpf = "123.456.789-09";
        marcus.profissao = "programador";

        Conta contaDoMarcus = new Conta();
        contaDoMarcus.deposita(100);

        contaDoMarcus.titular = marcus;
        System.out.println(contaDoMarcus.titular.nome);
    }
}
