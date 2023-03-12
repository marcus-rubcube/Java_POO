public class CriarConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.saldo += 100;
        System.out.println("Saldo 1ºConta: R$" + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Saldo 2ºConta: R$" + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta!");
        } else{
            System.out.println("São contas diferentes!");
        }
    }
}
