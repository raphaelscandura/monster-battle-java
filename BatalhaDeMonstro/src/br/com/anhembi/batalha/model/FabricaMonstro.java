package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.*;
import java.util.*;

public class FabricaMonstro {

    /**
     * this.Id = 2;
     * this.nomeMonstro = "Goiabao";
     * this.status = "Grama" ;
     * this.ataques1 = "Pinhão" ;
     * this.ataques2 = "Suco de Fruta";
     * this.temvida = 10;
     * this.forca = 17;
     * this.defesa = 14;
     * this.velocidade = 8;
     * @throws ClassNotFoundException
     */
	
	ArrayList<Monstros> listaMonstros = new ArrayList<Monstros>();
    
    public void instanciarMonstros() {
        Ataque ataque = new Ataque(17, "eletrico", "Golpe do Trov�o");
        Ataque ataque0 = new Ataque(15, "voador", "Mergulho do Alto");
        Monstros monstro = new Monstros(1, "Flair", "eletrico", ataque, ataque0, 7, 20, 8, 20, "pedra");
        listaMonstros.add(monstro);        
        
        Ataque ataque1 = new Ataque(17, "fogo", "Soco Flamejante");
        Ataque ataque2 = new Ataque(7, "grama", "Grama Quente");
        Monstros monstro1 = new Monstros(2, "Fogareu", "fogo", ataque1, ataque2, 15, 18, 9, 13, "agua"); 
        listaMonstros.add(monstro1);
    
        Ataque ataque3 = new Ataque(12, "grama", "Pinhão");
        Ataque ataque4 = new Ataque(16, "agua", "Suco de Fruta");
        Monstros monstro2 = new Monstros(3, "Goiab�o", "grama", ataque3, ataque4, 10, 17, 14, 8, "fogo");
        listaMonstros.add(monstro2);
    
        Ataque ataque5 = new Ataque(17, "agua", "Fonte Gelada");
        Ataque ataque6 = new Ataque(16, "fogo", "Magma");
        Monstros monstro3 = new Monstros(4, "Liquides", "agua", ataque5, ataque6, 14, 15, 15, 13, "grama");
        listaMonstros.add(monstro3);
    
        Ataque ataque7 = new Ataque(16, "pedra", "Soco Petrificador");
        Ataque ataque8 = new Ataque(19, "eletrico", "Eletrocutar");
        Monstros monstro4 = new Monstros(5, "Rocking", "pedra", ataque7, ataque8, 12, 19, 17, 10, "voador");
        listaMonstros.add(monstro4);
    
        Ataque ataque9 = new Ataque(11, "voador", "Espada de Vento");
        Ataque ataque10 = new Ataque(14, "pedra", "Ciclone Bomba");
        Monstros monstro5 = new Monstros(6, "Satoshi", "voador", ataque9, ataque10, 11, 14, 10, 18, "eletrico");
        listaMonstros.add(monstro5);
    } 
    
    public void imprimirMonstros() {
    	for(int i = 0; i < listaMonstros.size();i++) {
    		Monstros monstro = listaMonstros.get(i);
    		System.out.println("ID: " + monstro.getID());
    		System.out.println("Nome: " + monstro.getNomeMonstro());
    		System.out.println("Tipo: " + monstro.getTipo());
    		System.out.println("HP: " + monstro.getHP());
    		System.out.println("Ataque: " + monstro.getForca());
    		System.out.println("Defesa: " + monstro.getDefesa());
    		System.out.println("Velocidade: " + monstro.getVelocidade() + "\n");
    	}
    }
    
    public ArrayList<Monstros> getMonstros(){
    	return listaMonstros;
    }
}
