package br.com.anhembi.batalha.view;

import br.com.anhembi.batalha.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuEscolhas {

	public void escolhas(Treinador treinador1, Treinador treinador2) {

        int escolhaJogador = 0;

        Scanner respostaEscolha = new Scanner(System.in);

        System.out.println("BEM VINDO AO MENU DE ESCOLHAS \n");
        
        for(int i = 1; i <= 2; i++){
        	
        	FabricaMonstro monstro = new FabricaMonstro();
        	System.out.println("Jogador " + i + " Escolha 3 monstros de acordo com o ID (numero 1 � 6) \n");
        	monstro.instanciarMonstros();        	
        	ArrayList<Monstros> listaDeMonstros = monstro.getMonstros();
        	int cont = 1;
                do{
                	monstro.imprimirMonstros();
                    System.out.println("Escolha seu " + cont +"� Monstro: \n");
                    escolhaJogador = respostaEscolha.nextInt();
                    Monstros monstroEscolhido = listaDeMonstros.get(escolhaJogador);
                    if(i == 1) {
                    	treinador1.addMonstro(monstroEscolhido);
                    	listaDeMonstros.remove(monstroEscolhido);
                    }else if(i == 2) {
                    	treinador2.addMonstro(monstroEscolhido);
                    	listaDeMonstros.remove(monstroEscolhido);
                    }
                    
                    cont++;
                }while(cont <= 3);
        }
        
        System.out.println("\nMonstros do treinador 1");
        treinador1.getAllMonstros();
        System.out.println("-------------------------------------------------------");
        System.out.println("\nMonstros do treinador 2");
        treinador2.getAllMonstros();    
        
	}
}
