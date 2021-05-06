package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.*;

/**
 * 
 * @author Sabrina Fernandes
 *
 */
public class Monstros {
    private String tipo;
    private String nomeMonstro;
    private Ataque ataques1;
    private Ataque ataques2;
    private double hp;
    private int vida;
    private int forca;
    private int defesa;
    private int velocidade;
    private String fraqueza;
    
    	public Monstros(String nome, String tipo, Ataque ataque1, Ataque ataque2, int vida, int forca, int defesa, int velocidade, String fraqueza) {
    		this.tipo = tipo;
    		this.nomeMonstro = nome;
    		this.ataques1 = ataque1;
    		this.ataques2 = ataque2;
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
            return this.ataques1;
        }

        public Ataque getAtaques2() {
            return this.ataques2;
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


