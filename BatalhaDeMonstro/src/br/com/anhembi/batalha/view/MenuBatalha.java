package br.com.anhembi.batalha.view;

import java.util.Scanner;
import java.io.IOException;

import br.com.anhembi.batalha.control.Ataque;
import br.com.anhembi.batalha.control.CalculoBatalha;
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

	public MenuBatalha(Treinador treinadorX, Treinador treinadorY) {
		this.treinadorX = treinadorX;
		this.treinadorY = treinadorY;
	}

	public void luta() {
		Ataque ataqueEscolhidoX;
		Ataque ataqueEscolhidoY;
		;
		Scanner scan = new Scanner(System.in);
		CalculoBatalha atacar = new CalculoBatalha();
		boolean lutando = true;
		while (lutando) {
			turno = true;
			imprimirTela();

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
			imprimirTela();

			System.out.println("\n\n" + treinadorY.getNomeTreinador() + "deseja \nAtacar(1) \nTrocar de Monstro(2)");
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

            animacao();


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

    public void animacao() {
        animacaoAtaqueYS();
        freezeScreen(100);
        animacaoAtaqueY();
        freezeScreen(100);
        animacaoAtaqueYS();
        freezeScreen(100);
        animacaoAtaqueY();
        freezeScreen(500);

        animacaoAtaqueXS();
        freezeScreen(100);
        animacaoAtaqueX();
        freezeScreen(100);
        animacaoAtaqueXS();
        freezeScreen(100);
        animacaoAtaqueX();
        freezeScreen(500);
    }

	public void freezeScreen(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void imprimirTela() {
		System.out.print("\u000C");

		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				System.out.print(" ");
				if (y == 1 && x == 3) {
					System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 1 && x == 22) {
					System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 2 && x == 6) {
					System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 2 && x == 30) {
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
						System.out.print("1 -> " + treinadorX.getMonstroAtivo().getAtaques1().getNome());
						System.out.print("[" + treinadorX.getMonstroAtivo().getAtaques1().getPoder() + "]");
					}

					if (y == 7 && x == 3) {
						System.out.print("2 -> " + treinadorX.getMonstroAtivo().getAtaques2().getNome());
						System.out.print("[" + treinadorX.getMonstroAtivo().getAtaques2().getPoder() + "]");
					}
				} else {
					if (y == 6 && x == 29) {
						System.out.print(treinadorY.getMonstroAtivo().getAtaques1().getNome());
						System.out.print("[" + treinadorY.getMonstroAtivo().getAtaques1().getPoder() + "]" + " <- 1");
					}
					if (y == 7 && x == 29) {
						System.out.print(treinadorY.getMonstroAtivo().getAtaques2().getNome());
						System.out.print("[" + treinadorY.getMonstroAtivo().getAtaques2().getPoder() + "]" + " <- 2");
					}
				}
			}
			System.out.print("\n");
		}
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
	}

	public void animacaoAtaqueX() {
		System.out.print("\u000C");

		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				System.out.print(" ");
				if (y == 1 && x == 3) {
					System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 1 && x == 22) {
					System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 2 && x == 6) {
					System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 2 && x == 30) {
					System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 4 && x == 23) {
					System.out.print("((ง'̀-'́)-");
				}
				if (y == 4 && x == 25) {
					System.out.print("*ᕕ( 0-0 )ᕗ");
				}
			}
			System.out.print("\n");
		}
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
	}

	public void animacaoAtaqueXS() {
		System.out.print("\u000C");

		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				System.out.print(" ");
				if (y == 1 && x == 3) {
					System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 1 && x == 22) {
					System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 2 && x == 6) {
					System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 2 && x == 30) {
					System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 4 && x == 23) {
					System.out.print("((ง'̀-'́)ง");
				}
				if (y == 4 && x == 25) {
					System.out.print("ᕕ( ᐛ )ᕗ");
				}
			}
			System.out.print("\n");
		}
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
	}

	public void animacaoAtaqueY() {
		System.out.println("\u000C");

		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				System.out.print(" ");
				if (y == 1 && x == 3) {
					System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 1 && x == 22) {
					System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 2 && x == 6) {
					System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 2 && x == 30) {
					System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 4 && x == 1) {
					System.out.print("((ง0-0 )ง*");
				}
				if (y == 4 && x == 3) {
					System.out.print("--( ᐛ )ᕗ");
				}
			}
			System.out.print("\n");
		}
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
	}

	public void animacaoAtaqueYS() {
		System.out.print("\u000C");
		for (int i = 1; i < this.width; i++) {
			System.out.print("-");
		}
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				System.out.print(" ");
				if (y == 1 && x == 3) {
					System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 1 && x == 22) {
					System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
				}
				if (y == 2 && x == 6) {
					System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 2 && x == 30) {
					System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
				}
				if (y == 4 && x == 1) {
					System.out.print("((ง'̀-'́)ง");
				}
				if (y == 4 && x == 3) {
					System.out.print("ᕕ( ᐛ )ᕗ");
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
