public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        conta.deposita(50);

        if(conta.saca(20)){
            System.out.println("Saque Realizado com Sucesso!");
        } else {
            System.out.println("Saldo Insuficiente!");
        }

        Conta conta2 = new Conta(1337, 24227);
        if(conta.transfere(30, conta2)){
            System.out.println("Transferência Realizada com Sucesso!");
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }
}
