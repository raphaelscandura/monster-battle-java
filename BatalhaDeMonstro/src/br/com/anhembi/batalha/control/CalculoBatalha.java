package br.com.anhembi.batalha.control;

import br.com.anhembi.batalha.model.*;

/**
 * 
 * Classe respons�vel pelos m�todos de calculo de dano e prioridade durante a
 * batalha
 * 
 * @author Raphael Scandura
 * @version 0.1
 * @see https://github.com/raphaelscandura
 * 
 *
 */
public class CalculoBatalha {

	protected Monstros monstro1;
	protected Monstros monstro2;
	protected int prioridadeMonstro1 = 0;
	protected int prioridadeMonstro2 = 1;
	protected int prioridadeMaxima = 3;

	/**
	 * 
	 * Construtor para inicializar o objeto CalculoBatalha com os dois objetos da
	 * classe Monstro ativos na batalha
	 * 
	 * @param monstro1
	 * @param monstro2
	 * 
	 */

	public CalculoBatalha(Monstros monstro1, Monstros monstro2) {
		this.monstro1 = monstro1;
		this.monstro2 = monstro2;

	}

	public void turno(String acaoJogador1, String acaoJogador2) {
		prioridadeMovimento(acaoJogador1, acaoJogador2);
		recebeDano(monstro1, acaoJogador1, monstro2);
		recebeDano(monstro2, acaoJogador2, monstro1);
	}

	public int prioridadeMovimento(String acaoJogador1, String acaoJogador2) {
		if (acaoJogador1 == "troca" || acaoJogador2 == "troca") {
			return prioridadeMaxima;
		} else {
			prioridaDeAtaque(monstro1, monstro2);
		}
	}

	public int prioridaDeAtaque(Monstros monstro1, Monstros monstro2) {

		if (monstro1.getVelocidade() != monstro2.getVelocidade) {
			if (monstro1.getVelocidade() > monstro2.getVelocidade) {
				return prioridadeMonstro1;
			} else if (monstro1.getVelocidade() < monstro2.getVelocidade) {
				return prioridadeMonstro2;
			}
		} else if (monstro1.getAtaque() != monstro2.getAtaque()) {
			if (monstro1.getAtaque() > monstro2.getAtaque()) {
				return prioridadeMonstro1;
			} else if (monstro1.getAtaque() < monstro2.getAtaque()) {
				return prioridadeMonstro2;
			}
		} else if (monstro1.getDefesa() != monstro2.getDefesa()) {
			if (monstro1.getDefesa() > monstro2.getDefesa()) {
				return prioridadeMonstro1;
			} else if (monstro1.getDefesa() < monstro2.getDefesa()) {
				return prioridadeMonstro2;
			}
		} else {
			System.out.println("Nenhum crit�rio de desempate, a batalha travou!");
			return 5;
		}
	}

	public void recebeDano(Monstro monstro1, Ataque poder, Monstro monstro2) {
		if (monstro1.getTipo() == monstro2.getFraqueza()) {
			monstro2.setVida(monstro1.vida -= ((monstro1.ataque - monstro2.defesa) * 0.375) + (poder.getForca() * 0.1));
		}
		monstro2.setVida(monstro1.vida -= ((monstro1.ataque - monstro2.defesa) * 0.75) + (poder.getForca() * 0.1));
	}
}
