package br.com.anhembi.batalha.control;


/**
 * @author Raphael Scandura
 */

public class Ataque {
	private int poderAtaque;
	private String tipoAtaque;
	private String nomeAtaque;

	public Ataque(int poderAtaque, String tipoAtaque, String nomeAtaque) {
		this.poderAtaque = poderAtaque;
		this.tipoAtaque = tipoAtaque;
		this.nomeAtaque = nomeAtaque;
	}
		
	public int getPoder() {
		return this.poderAtaque;
	}
	
	public String getTipo() {
		return this.tipoAtaque;
	}
	
	public String getNome() {
		return this.nomeAtaque;
	}

}
