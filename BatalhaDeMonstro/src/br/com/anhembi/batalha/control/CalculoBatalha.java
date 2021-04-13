package br.com.anhembi.batalha.control;

import br.com.anhembi.batalha.model.*;

/**
 * 
 * Classe responsável pelos métodos de calculo de dano e prioridade durante a
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

	public void prioridaDeAtaque(Monstros monstro1, Ataque ataqueJogador1, Monstros monstro2, Ataque ataqueJogador2) {

		if (monstro1.getVelocidade() != monstro2.getVelocidade()) {
			if (monstro1.getVelocidade() > monstro2.getVelocidade()) {
				recebeDano(monstro1, ataqueJogador1, monstro2);
			} else if (monstro1.getVelocidade() < monstro2.getVelocidade()) {
				recebeDano(monstro2, ataqueJogador2, monstro1);
			}
		} else if (monstro1.getForca() != monstro2.getForca()) {
			if (monstro1.getForca() > monstro2.getForca()) {
				recebeDano(monstro1, ataqueJogador1, monstro2);
			} else if (monstro1.getForca() < monstro2.getForca()) {
				recebeDano(monstro2, ataqueJogador2, monstro1);
			}
		} else if (monstro1.getDefesa() != monstro2.getDefesa()) {
			if (monstro1.getDefesa() > monstro2.getDefesa()) {
				recebeDano(monstro1, ataqueJogador1, monstro2);
			} else if (monstro1.getDefesa() < monstro2.getDefesa()) {
				recebeDano(monstro2, ataqueJogador2, monstro1);
			}
		} else {
			System.out.println("Nenhum critério de desempate, a batalha travou!");
		}
	}

	public void recebeDano(Monstros monstroA, Ataque ataque, Monstros monstroB) {
		int vidaMonstro = monstroA.getVida();
		int ataqueMonstro = monstroA.getForca();
		int defesaMonstro = monstroB.getDefesa();
		int poderAtaque = ataque.getPoder();
		
		if (monstroA.getTipo() == monstroB.getFraqueza()) {
			monstroB.settemVida(vidaMonstro -= ((ataqueMonstro - defesaMonstro) * 0.375) + (poderAtaque * 0.1));
		}
		monstroB.settemVida(vidaMonstro -= ((ataqueMonstro - defesaMonstro) * 0.75) + (poderAtaque * 0.1));
	}
}
