package modelo;

import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import interfaces.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, Navegador {

	private boolean ligado;

	public Iphone() {
		this.ligado = true;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
        if(!ligado){
			ligado = true;
		} else {
			System.out.println("O aparelho ja esta ligado!");
		}
    }

    public void desligar() {
		if(ligado){
			ligado = false;
		} else {
			System.out.println("O aparelho ja esta desligado!");
		}
    }

	@Override
	public void exibirPagina(String url) {
		if(ligado){
			System.out.println("Exibindo pagina: "+ url);
		}
	}

	@Override
	public void adicionarNovaAba() {
		if(ligado){
			System.out.println("Adicionando nova aba...");
		}
	}

	@Override
	public void atualizarPagina() {
		if(ligado){
			System.out.println("Atualizando a pagina...");
		}
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo musica...");
	}

	@Override
	public void pausar() {
		if(ligado){
			System.out.println("Pausando musica...");
		}
	}

	@Override
	public void selecionarMusica(String musica) {
		if(ligado){
			System.out.println("Selecionando musica: "+ musica);
		}
	}

	@Override
	public void telefonar(String numero) {
		if(ligado){
			System.out.println("Ligando para o numero: "+ numero);
		}
	}

	@Override
	public void atender() {
		if(ligado){
			System.out.println("Atendendo a ligacao...");
		}
	}

	@Override
	public void iniciarCorreioVoz() {
		if(ligado){
			System.out.println("Iniciando o correio de voz...");
		}
	}
}
