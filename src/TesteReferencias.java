public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();  // primeiraConta é um referencia apenas
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // criando uma outra referencia para a classe Conta
        System.out.println("Saldo da primeira conta: R$" + segundaConta.saldo);

        segundaConta.saldo += 100;
        // altera a referencia "primeiraConta" também, pois estão apontando para o mesmo endereço de memoria
        System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
        System.out.println("Saldo da primeira conta: R$" + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
