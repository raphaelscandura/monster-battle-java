package br.com.anhembi.batalha.model;

import java.util.Scanner;

import br.com.anhembi.batalha.control.Ataque;

/**
 * @author Michael Carlos Damasceno Lima
 */
public class Treinador {
	private Monstros monstro[] = new Monstros[3];
	private int posMonstroAtivo = 0;
	private int numeroDeMonstros = 0;
	private int monstrosVivos = 0;
	private String nomeTreinador;

	public Treinador(String nome) {
		this.nomeTreinador = nome;
	}

	public Treinador() {
	}

	public void addMonstro(Monstros monstrosEscolhido) {
		monstro[numeroDeMonstros] = monstrosEscolhido;
		numeroDeMonstros++;
		monstrosVivos++;
	}

	public String getNomeTreinador() {
		return this.nomeTreinador;
	}

	public boolean setMonstroAtivo(int ativaMonstro) {
		if (monstro[ativaMonstro].getHp() > 0) {
			this.posMonstroAtivo = ativaMonstro;
			return true;
		} else {
			return false;
		}
	}

	public boolean temMonstroVivo() {
		int monstrosVivos = this.monstrosVivos;
		for (int i = 0; i < 3; i++) {
			if (monstro[i].getHp() <= 0) {
				monstro[i] = null;
				monstrosVivos--;
			}
		}
		if (monstrosVivos == 0) {
			return false;
		}
		return true;
	}

	public Monstros getMonstroAtivo() {
		return monstro[posMonstroAtivo];
	}

	public int getMonstrosVivos() {
		return this.monstrosVivos;
	}

	public void getAllMonstros() {
		for (int i = 0; i < 3; i++) {
			Monstros monstroX = monstro[i];
			if (monstroX != null) {
				String vida = String.format("%.2f", monstroX.getHp());
				System.out.println("ID: " + i);
				System.out.println("Nome: " + monstroX.getNomeMonstro());
				System.out.println("Tipo: " + monstroX.getTipo());
				System.out.println("HP: " + vida);
				System.out.println("Ataque: " + monstroX.getForca());
				System.out.println("Defesa: " + monstroX.getDefesa());
				System.out.println("Velocidade: " + monstroX.getVelocidade() + "\n");
			}
		}
	}

	public Ataque escolherAtaque(int i) {
		if (i == 1) {
			return this.getMonstroAtivo().getAtaques1();
		} else {
			return this.getMonstroAtivo().getAtaques2();
		}
	}

	public void trocaMonstro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual monstro você gostaria de colocar agora?");
		this.getAllMonstros();
		int input = scan.nextInt();
		this.setMonstroAtivo(input);
	}
}
