public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1337, 24226);  // primeiraConta é um referencia apenas

        Conta segundaConta = primeiraConta; // criando uma outra referencia para a classe Conta

        // altera a referencia "primeiraConta" também, pois estão apontando para o mesmo endereço de memoria

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
