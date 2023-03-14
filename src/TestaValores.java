public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1337, 24227);
        Conta conta3 = new Conta(1337, 24228);

        conta.setAgencia(-50);
        conta.setNumero(-330);

        System.out.println(Conta.getTotal());
    }
}
