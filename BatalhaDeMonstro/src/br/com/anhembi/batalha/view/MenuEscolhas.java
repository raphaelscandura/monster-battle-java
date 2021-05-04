package br.com.anhembi.batalha.view;
<<<<<<< HEAD
import br.com.anhembi.batalha.model.*;
    /**
     * (ง'̀-'́)ง 
     * 
     * ᕕ( ᐛ )ᕗ
     * 
     */
public class MenuEscolhas {

	public static void main(String[] args) {
			Treinador Bob = new Treinador();
			Treinador Gob = new Treinador();
			Interface inter = new Interface(Bob,Gob);

			Monstros alpha = new Liquides();
			Monstros beta = new Rockin();
			Monstros omega = new Flair();
			
			Bob.addMonstro(alpha);
			Bob.addMonstro(alpha) ; 
			Bob.addMonstro(alpha);

			Gob.addMonstro(omega);
			Gob.addMonstro(omega) ;
			Gob.addMonstro(omega);

			inter.imprimirTela();

			// String nome = Bob.getMonstro(0).getNomeMonstro();
			// int defesa = Bob.getMonstro(0).getDefesa();
			// int ataque = Bob.getMonstro(0).getForça();
			// System.out.println(nome);
			// System.out.println("Defesa: " + defesa);
			// System.out.println("Ataque: " + ataque + "\n\n");
			
			// nome = Bob.getMonstro(1).getNomeMonstro();
			// defesa = Bob.getMonstro(1).getDefesa();
			// ataque = Bob.getMonstro(1).getForça();
			// System.out.println(nome);
			// System.out.println("Defesa: " + defesa);
			// System.out.println("Ataque: " + ataque + "\n\n");
			
			// nome = Bob.getMonstro(2).getNomeMonstro();
			// defesa = Bob.getMonstro(2).getDefesa();
			// ataque = Bob.getMonstro(2).getForça();
			// System.out.println(nome);
			// System.out.println("Defesa: " + defesa);
			// System.out.println("Ataque: " + ataque + "\n\n");
			
			// nome = Bob.getMonstroAtivo().getNomeMonstro();
			// System.out.println(nome);
		}

}

=======

import br.com.anhembi.batalha.model.Monstros;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuEscolhas {

        int escolhaJogador_um = 0;
        int escolhaJogador_dois = 0;
        int avaliadorJogador_um;
        int avaliadorJogador_dois;
        String respescolhaJogador_um = "";
        String respescolhaJogador_dois = "";

        ArrayList<Integer> monstrosJogador1 = new ArrayList<Integer> ();
        ArrayList<Integer> monstrosJogador2 = new ArrayList<Integer> ();

        Scanner respostaEscolha = new Scanner(System.in);

        System.out.println("BEM VINDO AO MENU DE ESCOLHAS \n");
        System.out.println("Jogador 1. Chegou a sua vez de escolher os seus monstros \n");

        for(avaliadorJogador_um = 0; avaliadorJogador_um < 3; avaliadorJogador_um++){

                do{

                        System.out.println("Escolha seu" + (avaliadorJogador_um + 1) +"º Monstro: \n");
                        System.out.println("Monstro escolhido: ");
    
                        escolhaJogador_um = respostaEscolha.nextInt();
                        
                        if (escolhaJogador_um == 1){                       
                        respescolhaJogador_um = "Fogareu";
                        monstrosJogador1.add("Fogareu");
                        System.out.println(monstrosJogador1);
                        
                        }else if (escolhaJogador_um == 2){
                        respescolhaJogador_um = "Goiabao";
                        monstrosJogador1.add("Goiabao");
                        System.out.println(monstrosJogador1);
                                
                        }else if (escolhaJogador_um == 3){
                        respescolhaJogador_um = "Liquides";
                        monstrosJogador1.add("Liquides");
                        System.out.println(monstrosJogador1);
                        
                        }else if (escolhaJogador_um == 4){
                        respescolhaJogador_um = "Flair";
                        monstrosJogador1.add("Flair");
                        System.out.println(monstrosJogador1);
                                
                        }else if (escolhaJogador_um == 5){
                        respescolhaJogador_um = "Rochin";
                        monstrosJogador1.add("Rochin");
                        System.out.println(monstrosJogador1);
  
                        }else if (escolhaJogador_um == 6){
                        respescolhaJogador_um = "Satoshi";
                        monstrosJogador1.add("Satoshi");
                        System.out.println(monstrosJogador1);
                                
                        }else{
                                System.out.println("Escolha invalida \n");
                                System.out.println("Escolha outro monstro\n");
                                
                        }
                }while();
                
        }
        
        System.out.println("BEM VINDO AO MENU DE ESCOLHAS \n");
        System.out.println("Jogador 2. Chegou a sua vez de escolher os seus monstros \n");
        //System.out.println("Suas opções são:\n1 - Fogareu\n2 - Goiabao\n3 - Liquides\n4 - Flair\n5 - Rochin\n6 - Satoshi");
        //void listarMonstros();


        for(avaliadorJogador_dois = 0; avaliadorJogador_dois < 3; avaliadorJogador_dois++){

                do{

                        System.out.println("Escolha seu" + (avaliadorJogador_um + 1) +"º Monstro: \n");
                        System.out.println("Monstro escolhido: ");
    
                        escolhaJogador_dois = respostaEscolha.nextInt();
                        
                        if (escolhaJogador_um == 1){                       
                                respescolhaJogador_dois = "Fogareu";
                                monstrosJogador2.add("Fogareu");
                                System.out.println(monstrosJogador2);
                                
                                }else if (escolhaJogador_dois == 2){
                                respescolhaJogador_dois = "Goiabao";
                                monstrosJogador2.add("Goiabao");
                                System.out.println(monstrosJogador2);
                                        
                                }else if (escolhaJogador_dois == 3){
                                respescolhaJogador_dois = "Liquides";
                                monstrosJogador2.add("Liquides");
                                System.out.println(monstrosJogador2);
                                
                                }else if (escolhaJogador_dois == 4){
                                respescolhaJogador_dois = "Flair";
                                monstrosJogador2.add("Flair");
                                System.out.println(monstrosJogador2);
                                        
                                }else if (escolhaJogador_dois == 5){
                                respescolhaJogador_dois = "Rochin";
                                monstrosJogador2.add("Rochin");
                                System.out.println(monstrosJogador2);
          
                                }else if (escolhaJogador_dois == 6){
                                respescolhaJogador_dois = "Satoshi";
                                monstrosJogador2.add("Satoshi");
                                System.out.println(monstrosJogador2);
                                        
                                }else{
                                        System.out.println("Escolha invalida \n");
                                        System.out.println("Escolha outro monstro\n");
                                        
                                }
                }while();
        }
    



	}
>>>>>>> d56d462379f69ff325cbc0df9d3da1bd19f77aab
