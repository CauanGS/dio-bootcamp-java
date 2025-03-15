package modelo;

public class Conta {
    private String numConta;
    private String agencia;
    private TipoConta tipoConta;
    private double saldo;

    public Conta(String numConta, String agencia, TipoConta tipoConta) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldo = 0.0d;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void transferir(Conta conta, double valor){
        this.saldo -= valor;
        conta.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numConta='" + numConta + '\'' +
                ", agencia='" + agencia + '\'' +
                ", tipoConta=" + tipoConta +
                ", saldo=" + saldo +
                '}';
    }
}
