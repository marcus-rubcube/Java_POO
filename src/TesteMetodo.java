public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);

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

        System.out.println("Saldo Final da conta: R$" + conta.saldo);
        System.out.println("Conta 2 - Saldo: R$" + conta2.saldo);

    }
}
