package br.com.anhembi.batalha.view;

import java.util.Scanner;

import br.com.anhembi.batalha.control.*;
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
		Animacao animacao = new Animacao(width, height, treinadorX, treinadorY);
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
			System.out.println("Nome: " + treinadorX.getMonstroAtivo().getNomeMonstro());
			System.out.println("Nome: " + treinadorY.getMonstroAtivo().getNomeMonstro());
			System.out.println("NomeX: " + monstroTurnoX.getNomeMonstro());
			System.out.println("NomeY: " + monstroTurnoY.getNomeMonstro());
			
			animacao.imprimirTela(monstroTurnoX, monstroTurnoY, turno);

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

			animacao.imprimirTela(monstroTurnoX, monstroTurnoY, turno);

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
			animacao.ataqueX(ehSuperfetivoX);
		}
		if(ataqueEscolhidoX == null && ataqueEscolhidoY != null){
			System.out.println("null + !null");
			animacao.switchX();
			animacao.ataqueY(ehSuperfetivoY);
		}
		if(ataqueEscolhidoX != null && ataqueEscolhidoY != null){
			System.out.println("!null + !null");
			if(prioridadeDeAtaque == 1){
				animacao.ataqueX(ehSuperfetivoX);
				animacao.ataqueY(ehSuperfetivoY);
			} 
			else {
				animacao.ataqueY(ehSuperfetivoY);
				animacao.ataqueX(ehSuperfetivoX);
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
	public void anuncioVitoria(Treinador treinador) {
		System.out.println("\n\n\nFIM DE JOGO! O VENCEDOR É \n" + treinador.getNomeTreinador());
	}
}
