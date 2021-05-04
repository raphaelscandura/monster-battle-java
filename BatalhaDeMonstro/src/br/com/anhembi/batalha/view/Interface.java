package br.com.anhembi.batalha.view;

import br.com.anhembi.batalha.control.CalculoBatalha;
import br.com.anhembi.batalha.model.*;
import br.com.anhembi.batalha.control.*;
import java.util.Scanner;



public class Interface {
    private Treinador treinadorX;
    private Treinador treinadorY;
    private int width = 50;
    private int height = 9;
    private boolean turn = false;
    private int alinhar = 0;
    private boolean turno = true;
    private Ataque ataqueEscolhidoX;
    private Ataque ataqueEscolhidoY;



    public Interface (Treinador treinadorX, Treinador treinadorY) {
        this.treinadorX = treinadorX;
        this.treinadorY = treinadorY;
    }

    
    public void imprimirTela() {
        Scanner scan  = new Scanner(System.in);
        CalculoBatalha atacar = new CalculoBatalha();
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");            
        }
        for(int y = 0; y < this.height; y++) {
            for(int x = 0; x < this.width; x++) {
                System.out.print(" ");
                if(y == 1 && x == 3){
                    System.out.print("["+treinadorX.getMonstroAtivo().getNomeMonstro()+"]");
                }
                if(y == 1 && x == 22){
                    System.out.print("["+treinadorY.getMonstroAtivo().getNomeMonstro()+"]");
                }
                if(y == 2 && x == 6){
                    System.out.print(treinadorX.getMonstroAtivo().gethp() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstroAtivo().gethp() + "HP");
                }
                if(y == 4 && x == 5){
                    System.out.print("(ง'̀-'́)ง");
                }
                if(y == 4 && x == 25){
                    System.out.print("ᕕ( ᐛ )ᕗ");
                }
                if(turno){
                    if(y == 6 && x == 3) {
                        System.out.print("1 -> " + treinadorX.getMonstroAtivo().getAtaques1().getNome());
                        System.out.print("[" +treinadorX.getMonstroAtivo().getAtaques1().getPoder() + "]") ;
                    }
                } else {
                    if(y == 6 && x == 3) {
                        System.out.print(treinadorX.getMonstroAtivo().getAtaques1().getNome());
                        System.out.print("[" +treinadorX.getMonstroAtivo().getAtaques1().getPoder() + "]") ;
                    }
                }
                alinhar = treinadorX.getMonstroAtivo().getAtaques1().getNome().length() + 4;
                if(!turno){
                    if(y == 6 && (x - alinhar) == 12) {
                        System.out.print(treinadorY.getMonstroAtivo().getAtaques1().getNome());
                        System.out.print("[" +treinadorY.getMonstroAtivo().getAtaques1().getPoder() + "]" + "<- 1");
                    }
                } else {
                    if(y == 6 && (x - alinhar) == 12) {
                        System.out.print(treinadorY.getMonstroAtivo().getAtaques1().getNome());
                        System.out.print("[" +treinadorY.getMonstroAtivo().getAtaques1().getPoder() + "]");
                    }
                }
                if(turno){
                    if(y == 7 && x == 3) {
                        System.out.print("2 -> " + treinadorX.getMonstroAtivo().getAtaques2().getNome());
                        System.out.print("[" +treinadorX.getMonstroAtivo().getAtaques2().getPoder() + "]") ;
                    }
                } else {
                    if(y == 7 && x == 3) {
                        System.out.print(treinadorX.getMonstroAtivo().getAtaques2().getNome());
                        System.out.print("[" +treinadorX.getMonstroAtivo().getAtaques2().getPoder() + "]") ;
                    }
                }
                if(!turno){
                    alinhar = treinadorX.getMonstroAtivo().getAtaques2().getNome().length() + 4;
                    if(y == 7 && (x - alinhar) == 10) {
                        System.out.print(treinadorY.getMonstroAtivo().getAtaques2().getNome());
                        System.out.print("[" + treinadorY.getMonstroAtivo().getAtaques2().getPoder() + "]" + "<- 2") ;
                    }
                } else {
                    if(y == 7 && (x - alinhar) == 10) {
                        System.out.print(treinadorY.getMonstroAtivo().getAtaques2().getNome());
                        System.out.print("[" + treinadorY.getMonstroAtivo().getAtaques2().getPoder() + "]") ;
                    }
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }

        System.out.println("\n\nJogador 1 ecolha seu ataque!");
        String input = scan.nextLine();
        ataqueEscolhidoX = treinadorX.escolherAtaque(Integer.parseInt(input));        
        System.out.println("\n\nJogador 2 ecolha seu ataque!");
        input = scan.nextLine();
        ataqueEscolhidoY = treinadorY.escolherAtaque(Integer.parseInt(input));        

        atacar.prioridaDeAtaque(treinadorY.getMonstroAtivo(), ataqueEscolhidoY, treinadorX.getMonstroAtivo(), ataqueEscolhidoX);
        turno = !turno;
    }


    public void escolhaAtaque() {
        if(!turn){
            Scanner scan = new Scanner(System.in);
            String ataque = scan.nextLine();
            /**
             * Ataque
             */
        }
        

    }
    public Monstros printEscolhas(int numero) {
        FabricaMonstro n = new FabricaMonstro();
        Scanner scan = new Scanner(System.in);
        
        for(int j = 1; j < 50; j++) {
            System.out.print("-");            
        }
        for(int x = 0; x < 50; x++){
            for(int y = 0; y < 9; y++){
                if(y == 1 && x == 3) {
                    System.out.println("[0] Flair");
                }
                if(y == 2 && x == 3) {
                    System.out.println("[1] Fogareu");
                }
                if(y == 3 && x == 3) {
                    System.out.println("[2] Goiaboa");
                }
                if(y == 4 && x == 3) {
                    System.out.println("[3] Liquides");
                }
                if(y == 5 && x == 3) {
                    System.out.println("[4] Rocking");
                }
                if(y == 6 && x == 3) {
                    System.out.println("[5] Satoshi");
                }
            }	
        }
        System.out.println("\nEcolha" + numero + "Monstros");
        String input = scan.nextLine();
        return n.instanciarMonstros(Integer.parseInt(input));
	}

}
