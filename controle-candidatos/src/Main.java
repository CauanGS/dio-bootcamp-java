import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        selecionarCandidatos();
    }

    static void selecionarCandidatos(){
        String[] candidatos = {"FELIPE","GLEYSON","JULIETA","ANTONY","MIRELLA","JULIANA","SAMIRA","EDUARDO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato =  candidatos[candidatoAtual];
            double salarioPretendido = gerarValor();

            System.out.println("O candidato "+ candidato + " solicitou este valor de salario: "+salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato +" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double gerarValor(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Aguardando resultado para os demais candidato");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}