import com.cauangs.modelo.ContaTerminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();
        try{
            System.out.println("Digite o número da conta:");
            conta.setNumero(scanner.nextInt());

            System.out.println("Digite a agência:");
            conta.setAgencia(scanner.next());

            System.out.println("Digite o nome do cliente:");
            conta.setCliente(scanner.next());

            System.out.println("Digite o saldo:");
            conta.setSaldo(scanner.nextFloat());
            System.out.println("Olá "+ conta.getCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.getAgencia() +", conta "+ conta.getNumero() +" e seu saldo "+ conta.getSaldo() +" já está disponível para saque.");
        } catch (InputMismatchException e){
            System.out.println("Valor(es) do(s) campo(s) incorreto(s)!");
        } finally {
            System.out.println("Encerrando a aplicação!");
        }
    }
}