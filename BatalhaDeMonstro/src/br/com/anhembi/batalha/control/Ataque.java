package br.com.anhembi.batalha.control;

import java.util.ArrayList;

/**
 * 
 * Classe que contém todos os atributos e métodos dos ataques dos Monstros, além de instanciar os ataques
 * 
 * @author Raphael Scandura
 * @version 0.1
 * @see https://github.com/raphaelscandura
 * 
 *
 */

public class Ataque extends Movimento {
	
	private int poderAtaque;
	private String tipoAtaque;
	private String nomeAtaque;
	
	/**
	 * 
	 * Construtor para instanciar o objeto Ataque, recebendo o valor inteiro do poder do Ataque em questão, 
	 * o tipo do ataque e o nome do ataque
	 * 
	 * @param poderAtaque
	 * @param tipoAtaque
	 * @param nomeAtaque
	 */
	
	public Ataque(int poderAtaque, String tipoAtaque, String nomeAtaque){
		this.poderAtaque = poderAtaque;
		this.tipoAtaque = tipoAtaque;
		this.nomeAtaque = nomeAtaque;
		
	}
	
	ArrayList<Ataque> listaAtaques = new ArrayList<Ataque>();
	
	public void instanciarAtaques() {
		Ataque SocoFlamejante = new Ataque(17,"Fogo", "Soco Flamejante");
		listaAtaques.add(SocoFlamejante);
		Ataque Pinhao = new Ataque(12, "Grama", "Pinhão");
		listaAtaques.add(Pinhao);
		Ataque FonteGelada = new Ataque(17, "Água", "Fonte Gelada");
		listaAtaques.add(FonteGelada);
		Ataque GolpeDoTrovao = new Ataque(17, "Elétrico", "Golpe do Trovão");
		listaAtaques.add(GolpeDoTrovao);
		Ataque SocoPetrificador = new Ataque(16, "Pedra", "Soco Petrificador");
		listaAtaques.add(SocoPetrificador);
		Ataque EspadaDeVento = new Ataque(11,"Voador", "Espada de Vento");
		listaAtaques.add(EspadaDeVento);
		Ataque GramaQuente = new Ataque(7, "Grama", "Grama Quente");
		listaAtaques.add(GramaQuente);
		Ataque SucoDeFruta = new Ataque(16, "Água", "Suco de Fruta");
		listaAtaques.add(SucoDeFruta);
		Ataque Magma = new Ataque(19,"Fogo", "Magma");
		listaAtaques.add(Magma);
		Ataque MergulhoDoAlto = new Ataque(15, "Voador", "Mergulho do Alto");
		listaAtaques.add(MergulhoDoAlto);
		Ataque Eletrocutar = new Ataque(19, "Elétrico", "Eletrocutar");
		listaAtaques.add(Eletrocutar);
		Ataque CicloneBomba = new Ataque(14, "Pedra", "Ciclone Bomba");
		listaAtaques.add(CicloneBomba);
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
