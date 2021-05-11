package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.*;

/**
 * 
 * @author Sabrina Fernandes
 */
public class Monstros {
    private String tipo;
    private String nomeMonstro;
    private Ataque ataquesX;
    private Ataque ataquesY;
    private double hp;
    private int vida;
    private int forca;
    private int defesa;
    private int velocidade;
    private String fraqueza;
    
    	public Monstros(String nome, String tipo, Ataque ataqueX, Ataque ataqueY, int vida, int forca, int defesa, int velocidade, String fraqueza) {
    		this.tipo = tipo;
    		this.nomeMonstro = nome;
    		this.ataquesX = ataqueX;
    		this.ataquesY = ataqueY;
    		this.vida = vida;
    		this.hp = vida * 5;
    		this.forca = forca;
    		this.defesa = defesa;
    		this.velocidade = velocidade;
    		this.fraqueza = fraqueza;
    	}
    
        public String getNomeMonstro() {
            return this.nomeMonstro;
        }

        public Ataque getAtaques1() {
            return this.ataquesX;
        }

        public Ataque getAtaques2() {
            return this.ataquesY;
        }
        
        public double getHp() {
            return this.hp;
        }
        
        public int getForca() {
            return this.forca;
        }

        public int getDefesa() {
            return this.defesa;
        }

        public int getVelocidade() {
            return this.velocidade;
        }

        public int getVida(){
            return this.vida;
        }

	    public String getTipo(){
	        return this.tipo;
	    }
	    
	    public String getFraqueza() {
	    	return this.fraqueza;
	    }
	    
	    public void setHp(double hp) {
	    	this.hp = hp;
	    }
}


