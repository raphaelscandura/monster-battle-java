package br.com.anhembi.batalha.view;

import java.util.Scanner;

import br.com.anhembi.batalha.control.Ataque;
import br.com.anhembi.batalha.control.CalculoBatalha;
import br.com.anhembi.batalha.model.Monstros;
import br.com.anhembi.batalha.model.Treinador;

/**
 * @author Michael Carlos Damasceno Lima
 */

public class MenuBatalha {
	private Treinador treinadorX;
	private Treinador treinadorY;
	private int width = 50;
	private int height = 9;
	private boolean turno = true;
	public MenuBatalha() {
	}

	public MenuBatalha(Treinador treinadorX, Treinador treinadorY) {
		this.treinadorX = treinadorX;
		this.treinadorY = treinadorY;
	}

	public void luta() {
		Ataque ataqueEscolhidoX;
		Ataque ataqueEscolhidoY;
		int prioridadeDeAtaque;
		Scanner scan = new Scanner(System.in);
		CalculoBatalha atacar = new CalculoBatalha();
		boolean lutando = true, efetivoX, efetivoY;
		while (lutando) {
			turno = true;
			Monstros monstroTurnoX = treinadorX.getMonstroAtivo();
			Monstros monstroTurnoY = treinadorY.getMonstroAtivo();
			imprimirTela(monstroTurnoX, monstroTurnoY);

			System.out.println("\n\n" + treinadorX.getNomeTreinador() + " deseja \nAtacar(1) \nTrocar de Monstro(2)");
			int escolha = scan.nextInt();
			if (escolha == 1) {
				System.gc();
				System.out.println("\n\n" + treinadorX.getNomeTreinador() +  " escolha seu ataque!");
				int control = scan.nextInt();
				ataqueEscolhidoX = treinadorX.escolherAtaque(control);
			} else {
				treinadorX.trocaMonstro();
				ataqueEscolhidoX = null;
			}
			turno = false;

			imprimirTela(monstroTurnoX, monstroTurnoY);
			System.out.println("\n\n" + treinadorY.getNomeTreinador() + " deseja \nAtacar(1) \nTrocar de Monstro(2)");
			int escolhaAtaque = scan.nextInt();
			if (escolhaAtaque == 1) {
				System.gc();
				System.out.println("\n\n" +  treinadorY.getNomeTreinador() + " escolha seu ataque!");
				int control = scan.nextInt();
				ataqueEscolhidoY = treinadorY.escolherAtaque(control);
			} else {
				treinadorY.trocaMonstro();
				ataqueEscolhidoY = null;
			}

			turno = !turno;
			prioridadeDeAtaque = atacar.getPrioridade(treinadorX.getMonstroAtivo(), ataqueEscolhidoX, treinadorY.getMonstroAtivo(), ataqueEscolhidoY);
			
			efetivoX = atacar.ehSuperEfetivo(treinadorX.getMonstroAtivo(), treinadorY.getMonstroAtivo());
			efetivoY = atacar.ehSuperEfetivo(treinadorY.getMonstroAtivo(), treinadorX.getMonstroAtivo());
            animacao(ataqueEscolhidoX, ataqueEscolhidoY, prioridadeDeAtaque, efetivoX, efetivoY);


			atacar.prioridaDeAtaque(treinadorY.getMonstroAtivo(), ataqueEscolhidoY, treinadorX.getMonstroAtivo(),
					ataqueEscolhidoX);

			if (treinadorX.getMonstroAtivo().getHp() <= 0) {
				if (!treinadorX.temMonstroVivo()) {
					lutando = false;
					anuncioVitoria(treinadorY);
				}
				treinadorX.trocaMonstro();
			}

			if (treinadorY.getMonstroAtivo().getHp() <= 0) {
				if (!treinadorY.temMonstroVivo()) {
					lutando = false;
					anuncioVitoria(treinadorX);
				}
				treinadorY.trocaMonstro();
			}

		}
	}

    public void animacao(Ataque ataqueEscolhidoX, Ataque ataqueEscolhidoY, int prioridadeDeAtaque, boolean ehSuperfetivoX, boolean ehSuperfetivoY) {
		Animacao animacao = new Animacao(this.width, this.height, this.treinadorX, this.treinadorY);
		if(ataqueEscolhidoX == null && ataqueEscolhidoY == null){
			System.out.println("null + null");
			animacao.switchXY();
		}
		if(ataqueEscolhidoX != null && ataqueEscolhidoY == null){
			System.out.println("!null + null");
			animacao.switchY();
			animacao.ataqueX(ehSuperfetivoY);
		}
		if(ataqueEscolhidoX == null && ataqueEscolhidoY != null){
			System.out.println("null + !null");
			animacao.switchX();
			animacao.ataqueY(ehSuperfetivoX);
		}
		if(ataqueEscolhidoX != null && ataqueEscolhidoY != null){
			System.out.println("!null + !null");
			if(prioridadeDeAtaque == 1){
				animacao.ataqueX(ehSuperfetivoY);
				animacao.ataqueY(ehSuperfetivoX);
			} 
			else {
				animacao.ataqueY(ehSuperfetivoX);
				animacao.ataqueX(ehSuperfetivoY);
			}
		}

    }

	public void freezeScreen(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void imprimirTela(Monstros monstroTurnoX, Monstros monstroTurnoY) {
		System.out.print("\033[H\033[2J");
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				System.out.print(" ");
				if (y == 1 && x == 3) {
					System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 1 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 23) {
					System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 2 && x == 4) {
					System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 2 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 24) {
					System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 4 && x == 5) {
					System.out.print("((ง'̀-'́)ง");
				}
				if (y == 4 && x == 25) {
					System.out.print("ᕕ( ᐛ )ᕗ");
				}
				if (turno) {
					if (y == 6 && x == 3) {
						System.out.print("1 -> " + monstroTurnoX.getAtaques1().getNome());
						System.out.print("[" + monstroTurnoX.getAtaques1().getPoder() + "]");
					}

					if (y == 7 && x == 3) {
						System.out.print("2 -> " + monstroTurnoX.getAtaques2().getNome());
						System.out.print("[" + monstroTurnoX.getAtaques2().getPoder() + "]");
					}
				} else {
					if (y == 6 && x == 29) {
						System.out.print(monstroTurnoY.getAtaques1().getNome());
						System.out.print("[" + monstroTurnoY.getAtaques1().getPoder() + "]" + " <- 1");
					}
					if (y == 7 && x == 29) {
						System.out.print(monstroTurnoY.getAtaques2().getNome());
						System.out.print("[" + monstroTurnoY.getAtaques2().getPoder() + "]" + " <- 2");
					}
				}
			}
			System.out.print("\n");
		}
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
	}
	public void anuncioVitoria(Treinador treinador) {
		System.out.println("\n\n\nFIM DE JOGO! O VENCEDOR É \n" + treinador.getNomeTreinador());
	}
}
