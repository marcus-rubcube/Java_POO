public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(50);

        if(conta.saca(20)){
            System.out.println("Saque Realizado com Sucesso!");
        } else {
            System.out.println("Saldo Insuficiente!");
        }

        Conta conta2 = new Conta();
        if(conta.transfere(30, conta2)){
            System.out.println("Transferência Realizada com Sucesso!");
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }
}
