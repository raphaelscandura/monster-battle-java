package br.com.anhembi.batalha.model;


import br.com.anhembi.batalha.control.*;

import java.util.*;

/**
 * @author Michael Carlos DamascenoLima
 */
public class DadosMonstros {
	
	private ArrayList<Monstros> listaMonstros = new ArrayList<Monstros>();
    Monstros monstro;
    
    public ArrayList<Monstros> getDataMonstros() {
        return listaMonstros;
    }
    
    public void instanciarMonstros() {
        Ataque ataqueX = new Ataque(17, "eletrico", "Golpe do Trovão");
        Ataque ataqueY = new Ataque(15, "voador", "Mergulho do Alto");
        monstro = new Monstros("Flair", "eletrico", ataqueX, ataqueY, 7, 20, 8, 20, "pedra");
        listaMonstros.add(monstro);        
        
        Ataque ataqueO = new Ataque(17, "fogo", "Soco Flamejante");
        Ataque ataqueP = new Ataque(7, "grama", "Grama Quente");
        monstro = new Monstros("Fogareu", "fogo", ataqueO, ataqueP, 15, 18, 9, 13, "agua"); 
        listaMonstros.add(monstro);
    
        Ataque ataqueA = new Ataque(12, "grama", "Pinhão");
        Ataque ataqueB = new Ataque(16, "agua", "Suco de Fruta");
        monstro = new Monstros("Goiabao", "grama", ataqueA, ataqueB, 10, 17, 14, 8, "fogo");
        listaMonstros.add(monstro);
    
        Ataque ataqueC = new Ataque(17, "agua", "Fonte Gelada");
        Ataque ataqueD = new Ataque(16, "fogo", "Magma");
        monstro = new Monstros("Liquides", "agua", ataqueC, ataqueD, 14, 15, 15, 13, "grama");
        listaMonstros.add(monstro);
    
        Ataque ataqueE = new Ataque(16, "pedra", "Soco Petrificador");
        Ataque ataqueF = new Ataque(19, "eletrico", "Eletrocutar");
        monstro = new Monstros("Rocking", "pedra", ataqueE, ataqueF, 12, 19, 17, 10, "voador");
        listaMonstros.add(monstro);
    
        Ataque ataqueG = new Ataque(11, "voador", "Espada de Vento");
        Ataque ataqueH = new Ataque(14, "pedra", "Ciclone Bomba");
        monstro = new Monstros("Satoshi", "voador", ataqueG, ataqueH, 11, 14, 10, 18, "eletrico");
        listaMonstros.add(monstro);
    } 
    
    public void imprimirMonstros() {
    	for(int i = 0; i < listaMonstros.size();i++) {
    		Monstros monstro = listaMonstros.get(i);
            System.out.println("---------------------------------------------------");
    		System.out.println("ID: " + i);
    		System.out.println("Nome: " + monstro.getNomeMonstro());
    		System.out.println("Tipo: " + monstro.getTipo());
            System.out.println("Fraqueza: " + monstro.getFraqueza());
    		System.out.println("HP: " + monstro.getHp());
    		System.out.println("Ataque: " + monstro.getForca());
    		System.out.println("Defesa: " + monstro.getDefesa());
    		System.out.println("Velocidade: " + monstro.getVelocidade() + "\n");
            System.out.println("Ataque 1: " + monstro.getAtaques1().getNome());
            System.out.println("Ataque 2: " + monstro.getAtaques2().getNome());
    	}
    }
    
    public ArrayList<Monstros> getMonstros(){
    	return listaMonstros;
    }
}
