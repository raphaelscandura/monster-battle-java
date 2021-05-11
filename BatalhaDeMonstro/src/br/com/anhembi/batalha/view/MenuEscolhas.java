package br.com.anhembi.batalha.view;

import br.com.anhembi.batalha.model.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rafael Scandura
 */
public class MenuEscolhas {

        

        public void escolherMonstros(Treinador treinadorX, Treinador treinadorY) {
        DadosMonstros dadosMonstros = new DadosMonstros();
        ArrayList<Monstros> listaDeMonstros = dadosMonstros.getDataMonstros();

        int escolhaJogador = 0;

        Scanner respostaEscolha = new Scanner(System.in);

        System.out.println("BEM VINDO AO MENU DE ESCOLHAS \n");
        
        for(int i = 1; i <= 2; i++){
        	
<<<<<<< HEAD
        	System.out.println("Jogador " + i + " Escolha 3 monstros de acordo com o ID (numero 1 � 6) \n");
        	dadosMonstros.instanciarMonstros();        	
        	listaDeMonstros = dadosMonstros.getMonstros();
        	int cont = 1;
                do {
                        dadosMonstros.imprimirMonstros();
                    System.out.println("Escolha seu " + cont +"� Monstro: \n");
=======
        	FabricaMonstro monstro = new FabricaMonstro();
        	System.out.println("Jogador " + i + " Escolha 3 monstros de acordo com o ID (numero 0 ao 5) \n");
        	monstro.instanciarMonstros();        	
        	ArrayList<Monstros> listaDeMonstros = monstro.getMonstros();
        	int cont = 1;
                do {
                	monstro.imprimirMonstros();
                    System.out.println("Escolha seu " + cont +" Monstro: \n");
>>>>>>> 62a68df25afa6179f0e4d9e6b798cf118dc0ae88
                    escolhaJogador = respostaEscolha.nextInt();
                    Monstros monstroEscolhido = listaDeMonstros.get(escolhaJogador);
                    if(i == 1) {
                        treinadorX.addMonstro(monstroEscolhido);
                    	listaDeMonstros.remove(monstroEscolhido);
                    }else if(i == 2) {
                        treinadorY.addMonstro(monstroEscolhido);
                    	listaDeMonstros.remove(monstroEscolhido);
                    }
                    cont++;
                } while(cont <= 3);
        }
        
        System.out.println("\nMonstros do" + treinadorX.getNomeTreinador());
        treinadorX.getAllMonstros();
        System.out.println("-------------------------------------------------------");
        System.out.println("\nMonstros do " + treinadorY.getNomeTreinador());
        treinadorY.getAllMonstros();    
        
	}

        public void nomearJogadores(Treinador treinadorX, Treinador treinadorY) {
                System.out.println("Jogador 1\nQual é o seu nome?");
                Scanner scan = new Scanner(System.in);
                
                String nome = scan.nextLine();
                treinadorX.setNomeTreinador(nome);
                
                System.out.println("Jogador 2\nQual é o seu nome?");
                nome = scan.nextLine();
                treinadorY.setNomeTreinador(nome);
        }
}
