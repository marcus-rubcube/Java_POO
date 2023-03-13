public class CriarConta {
    public static void main(String[] args){
        Conta primeiraConta = new Conta();

        Conta segundaConta = new Conta();

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta!");
        } else{
            System.out.println("São contas diferentes!");
        }
    }
}
