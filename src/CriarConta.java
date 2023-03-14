public class CriarConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta(1337, 24226);

        Conta segundaConta = new Conta(1337, 24228);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta!");
        } else{
            System.out.println("São contas diferentes!");
        }
    }
}
