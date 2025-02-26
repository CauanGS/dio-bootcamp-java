package main;

import java.util.Scanner;
import modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone2g = new Iphone();
        int opcao;

        // Lista de musicas pre-determinadas (Michael Jackson)
        String[] musicas = {
                "Thriller",
                "Billie Jean",
                "Beat It",
                "Bad",
                "Smooth Criminal",
                "Black or White",
                "Man in the Mirror"
        };

        do {
            // Exibir menu
            System.out.println("\n--- Menu do iPhone 2G ---");
            System.out.println("1. Ligar iPhone");
            System.out.println("2. Desligar iPhone");
            System.out.println("3. Exibir pagina (Navegador)");
            System.out.println("4. Adicionar nova aba (Navegador)");
            System.out.println("5. Atualizar pagina (Navegador)");
            System.out.println("6. Tocar musica (Reprodutor Musical)");
            System.out.println("7. Pausar musica (Reprodutor Musical)");
            System.out.println("8. Selecionar musica (Reprodutor Musical)");
            System.out.println("9. Telefonar (Telefone)");
            System.out.println("10. Atender ligacao (Telefone)");
            System.out.println("11. Iniciar correio de voz (Telefone)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    iphone2g.ligar();
                    break;
                case 2:
                    iphone2g.desligar();
                    break;
                case 3:
                    if (iphone2g.isLigado()) {
                        System.out.print("Digite a URL: ");
                        String url = scanner.nextLine();
                        iphone2g.exibirPagina(url);
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 4:
                    if (iphone2g.isLigado()) {
                        iphone2g.adicionarNovaAba();
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 5:
                    if (iphone2g.isLigado()) {
                        iphone2g.atualizarPagina();
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 6:
                    if (iphone2g.isLigado()) {
                        iphone2g.tocar();
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 7:
                    if (iphone2g.isLigado()) {
                        iphone2g.pausar();
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 8:
                    if (iphone2g.isLigado()) {
                        System.out.println("\nLista de musicas:");
                        for (int i = 0; i < musicas.length; i++) {
                            System.out.println((i + 1) + ". " + musicas[i]);
                        }
                        System.out.print("Escolha o numero da musica: ");
                        int escolha = scanner.nextInt();
                        if (escolha > 0 && escolha <= musicas.length) {
                            iphone2g.selecionarMusica(musicas[escolha - 1]);
                        } else {
                            System.out.println("Escolha invalida!");
                        }
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 9:
                    if (iphone2g.isLigado()) {
                        System.out.print("Digite o numero para telefonar: ");
                        String numero = scanner.nextLine();
                        iphone2g.telefonar(numero);
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 10:
                    if (iphone2g.isLigado()) {
                        iphone2g.atender();
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 11:
                    if (iphone2g.isLigado()) {
                        iphone2g.iniciarCorreioVoz();
                    } else {
                        System.out.println("O iPhone esta desligado!");
                    }
                    break;
                case 0:
                    System.out.println("Desligando o sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}