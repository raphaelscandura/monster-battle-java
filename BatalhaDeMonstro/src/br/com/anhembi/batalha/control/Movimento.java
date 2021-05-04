package br.com.anhembi.batalha.control;

import br.com.anhembi.batalha.model.*;

/**
 * 
 * Superclass abstrata que une e classifica as classes "Troca" e "Ataque"
 * 
 * @author Raphael Scandura
 * @version 0.1
 * @see https://github.com/raphaelscandura
 * 
 *
 */
public abstract class Movimento {

	private String movimentoJogador1;
	private String movimentoJogador2;
	private Ataque ataqueJogador1;
	private Ataque ataqueJogador2;
	private Monstros monstro1;
	private Monstros monstro2;

	public String getMovimentoJogador1() {
		return movimentoJogador1;
	}

	public void setMovimentoJogador1(String movimentoJogador1) {
		this.movimentoJogador1 = movimentoJogador1;
	}

	public String getMovimentoJogador2() {
		return movimentoJogador2;
	}

	public void setMovimentoJogador2(String movimentoJogador2) {
		this.movimentoJogador2 = movimentoJogador2;
	}

	public void iniciaTurno(Monstros monstro1, String movimentoJogador1, Monstros monstro2, String movimentoJogador2) {
		this.movimentoJogador1 = movimentoJogador1;
		this.movimentoJogador2 = movimentoJogador2;
		this.monstro1 = monstro1;
		this.monstro2 = monstro2;

	}

	public void prioridadeMovimento(Treinador treinador1, Treinador treinador2) {
		if (movimentoJogador1 != "troca" && movimentoJogador2 != "troca") {
			CalculoBatalha calculoTurno = new CalculoBatalha(monstro1, monstro2);
			calculoTurno.prioridaDeAtaque(monstro1, ataqueJogador1, monstro2, ataqueJogador2);
		} else if (movimentoJogador1 == "troca" && movimentoJogador2 != "troca") {
			treinador1.trocaMonstro();
		} else if (movimentoJogador1 != "troca" && movimentoJogador2 == "troca") {
			treinador2.trocaMonstro();
		} else {
			treinador1.trocaMonstro();
			treinador2.trocaMonstro();
		}

	}
}
