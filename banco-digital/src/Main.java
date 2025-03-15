import modelo.Conta;
import modelo.TipoConta;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new Conta("0000-1", "01", TipoConta.CORRENTE);
        Conta conta02 = new Conta("0000-1", "01", TipoConta.CORRENTE);

        conta01.depositar(22.50d);
        conta02.depositar(10.23d);

        conta01.consultarSaldo();
        conta02.consultarSaldo();

        conta01.sacar(2.50d);
        conta01.transferir(conta02, 15.00d);

        System.out.println("=============================");

        conta01.consultarSaldo();
        conta02.consultarSaldo();
    }
}