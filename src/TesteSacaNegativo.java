public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        conta.deposita(100);

        // atributos privados, alterando-os e exibindo-os apenas pelos metodos
        if(conta.saca(200)) {
            System.out.println("Novo Saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }
}
