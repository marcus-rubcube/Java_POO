public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta Destino){
        if(this.saldo >= valor){
            this.saca(valor);
            Destino.deposita(valor);
            return true;
        }
        return false;
    }
}
// são os atributos/propriedades/campos -- um tipo