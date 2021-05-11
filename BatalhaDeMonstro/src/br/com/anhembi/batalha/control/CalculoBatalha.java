package br.com.anhembi.batalha.control;

import br.com.anhembi.batalha.model.Monstros;

/**
 * @author Raphael Scandura
 */

public class CalculoBatalha {

	public void prioridaDeAtaque(Monstros monstroX, Ataque ataqueJogadorX, Monstros monstroY, Ataque ataqueJogadorY) {
		int prio = getPrioridade(monstroX, ataqueJogadorX, monstroY, ataqueJogadorY);
		switch(prio) {
			case 1:
				recebeDano(monstroX, ataqueJogadorX, monstroY);
				recebeDano(monstroY, ataqueJogadorY, monstroX);
				break;
			case 2:
				recebeDano(monstroX, ataqueJogadorX, monstroY);
				recebeDano(monstroY, ataqueJogadorY, monstroX);
				break;
			default: 
				break;
		} 
	}
	public int getPrioridade(Monstros monstroX, Ataque ataqueJogadorX, Monstros monstroY, Ataque ataqueJogadorY) {
		if (ataqueJogadorX != null && ataqueJogadorY != null) {
			if (monstroX.getVelocidade() != monstroY.getVelocidade()) {
				if (monstroX.getVelocidade() > monstroY.getVelocidade()) {
					return 1;
				} else if (monstroX.getVelocidade() < monstroY.getVelocidade()) {
					return 2;
				}
			} else if (monstroX.getForca() != monstroY.getForca()) {
				if (monstroX.getForca() > monstroY.getForca()) {
					return 1;
				} else if (monstroX.getForca() < monstroY.getForca()) {
					return 2;
				}
			} else if (monstroX.getDefesa() != monstroY.getDefesa()) {
				if (monstroX.getDefesa() > monstroY.getDefesa()) {
					return 1;
				} else if (monstroX.getDefesa() < monstroY.getDefesa()) {
					return 2;
				}
			} else {
				return 1;
			}
		} else if (ataqueJogadorX == null) {
			return 2;
		} else if (ataqueJogadorY == null) {
			return 1;
		}
		return 0;
	}

	public void recebeDano(Monstros monstroX, Ataque ataque, Monstros monstroY) {
		if (ataque != null) {
			double vidaMonstroAtacante = monstroX.getHp();
			double vidaMonstro = monstroY.getHp();
			int ataqueMonstro = monstroX.getForca();
			int defesaMonstro = monstroY.getDefesa();
			int poderAtaque = ataque.getPoder();
			if (vidaMonstroAtacante > 0) {
				if ((ehSuperEfetivo(monstroX, monstroY))) {
					monstroY.setHp(vidaMonstro -= ((ataqueMonstro - defesaMonstro)) + (poderAtaque * 0.5));
				}else {
					monstroY.setHp(vidaMonstro -= ((ataqueMonstro - defesaMonstro) * 2) + (poderAtaque * 0.5));
				}
			}
		}
	}
	public boolean ehSuperEfetivo(Monstros monstroX, Monstros monstroY) {
			if(monstroX.getTipo() != monstroY.getFraqueza()) {
				return false;
			} 
		return true;
	}
}
