package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.*;
import java.util.*;

/**
 * @author Michael Carlos DamascenoLima
 */
public class FabricaMonstro {
	
	ArrayList<Monstros> listaMonstros = new ArrayList<Monstros>();
    private Ataque ataqueX = new Ataque();
    private Ataque ataqueY = new Ataque();
    Monstros monstro;
    
    public void instanciarMonstros() {
        ataqueX.setAtaque(17, "eletrico", "Golpe do Trov�o");
        ataqueY.setAtaque(15, "voador", "Mergulho do Alto");
        monstro = new Monstros("Flair", "eletrico", ataqueX, ataqueY, 7, 20, 8, 20, "pedra");
        listaMonstros.add(monstro);        
        
        ataqueX.setAtaque(17, "fogo", "Soco Flamejante");
        ataqueY.setAtaque(7, "grama", "Grama Quente");
        monstro = new Monstros("Fogareu", "fogo", ataqueX, ataqueY, 15, 18, 9, 13, "agua"); 
        listaMonstros.add(monstro);
    
        ataqueX.setAtaque(12, "grama", "Pinhão");
        ataqueY.setAtaque(16, "agua", "Suco de Fruta");
        monstro = new Monstros("Goiab�o", "grama", ataqueX, ataqueY, 10, 17, 14, 8, "fogo");
        listaMonstros.add(monstro);
    
        ataqueX.setAtaque(17, "agua", "Fonte Gelada");
        ataqueY.setAtaque(16, "fogo", "Magma");
        monstro = new Monstros("Liquides", "agua", ataqueX, ataqueY, 14, 15, 15, 13, "grama");
        listaMonstros.add(monstro);
    
        ataqueX.setAtaque(16, "pedra", "Soco Petrificador");
        ataqueY.setAtaque(19, "eletrico", "Eletrocutar");
        monstro = new Monstros("Rocking", "pedra", ataqueX, ataqueY, 12, 19, 17, 10, "voador");
        listaMonstros.add(monstro);
    
        ataqueX.setAtaque(11, "voador", "Espada de Vento");
        ataqueY.setAtaque(14, "pedra", "Ciclone Bomba");
        monstro = new Monstros("Satoshi", "voador", ataqueX, ataqueY, 11, 14, 10, 18, "eletrico");
        listaMonstros.add(monstro);
    } 
    
    public void imprimirMonstros() {
    	for(int i = 0; i < listaMonstros.size();i++) {
    		Monstros monstro = listaMonstros.get(i);
    		System.out.println("ID: " + i);
    		System.out.println("Nome: " + monstro.getNomeMonstro());
    		System.out.println("Tipo: " + monstro.getTipo());
    		System.out.println("HP: " + monstro.getHp());
    		System.out.println("Ataque: " + monstro.getForca());
    		System.out.println("Defesa: " + monstro.getDefesa());
    		System.out.println("Velocidade: " + monstro.getVelocidade() + "\n");
    	}
    }
    
    public ArrayList<Monstros> getMonstros(){
    	return listaMonstros;
    }
}
