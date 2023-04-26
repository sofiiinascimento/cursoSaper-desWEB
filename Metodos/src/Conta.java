public class Conta {
    private String name;
    private double saldo;

    public Conta(String nomeInicial){
        name = nomeInicial;
    }

    public String getName() {
        return name;
    }

    public void setName(String nomeCliente) {
        this.name = nomeCliente;
    }
    public void saque(double valorSaque){
        this.saldo = saldo - valorSaque;
    }
    public void deposito(double valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public double getSaldo() {
        return saldo;
    }
}

