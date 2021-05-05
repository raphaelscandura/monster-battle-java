package br.com.anhembi.batalha.view;

import java.util.Scanner;

import br.com.anhembi.batalha.control.Ataque;
import br.com.anhembi.batalha.control.CalculoBatalha;
import br.com.anhembi.batalha.model.Treinador;



public class MenuBatalha {
    private Treinador treinadorX;
    private Treinador treinadorY;
    private int width = 50;
    private int height = 9;
    private int alinhar = 0;
    private boolean turno = true;

    public MenuBatalha (Treinador treinadorX, Treinador treinadorY) {
        this.treinadorX = treinadorX;
        this.treinadorY = treinadorY;
    }

    public void luta () {
        Ataque ataqueEscolhidoX = new Ataque(0, "", "nomeAtaque");
        Ataque ataqueEscolhidoY = new Ataque(0, "", "nomeAtaque");;
        Scanner scan  = new Scanner(System.in);
        CalculoBatalha atacar = new CalculoBatalha();
        String input;
        boolean lutando = true;
        while (lutando){
            for(int i = 0; i < 2; i++) {
                imprimirTela();
                if(turno) {
                    System.out.println("\n\n" + treinadorX.getNomeTreinador() + " escolha seu ataque!");
                    
                    input = scan.nextLine();
                    ataqueEscolhidoX = treinadorX.escolherAtaque(Integer.parseInt(input)); 
                    turno = false;
                } else {
                    System.out.println("\n\n" + treinadorY.getNomeTreinador() + " escolha seu ataque!");

                    input = scan.nextLine();
                    ataqueEscolhidoX = treinadorX.escolherAtaque(Integer.parseInt(input)); 
                    turno = true;
                }
            }
            animacaoAtaqueYS();
            freezeScreen(500);
            animacaoAtaqueY();
            freezeScreen(500);
            animacaoAtaqueYS();
            freezeScreen(500);
            animacaoAtaqueY();
            freezeScreen(1000);

            animacaoAtaqueXS();
            freezeScreen(500);
            animacaoAtaqueX();
            freezeScreen(500);
            animacaoAtaqueXS();
            freezeScreen(500);
            animacaoAtaqueX();
            freezeScreen(1000);

            atacar.prioridaDeAtaque(treinadorY.getMonstroAtivo(), ataqueEscolhidoY, treinadorX.getMonstroAtivo(), ataqueEscolhidoX);

            if(!treinadorX.temMonstroVivo()){
                lutando = false;
            }

            if(!treinadorY.temMonstroVivo()){
                lutando = false;
            }
        }
    }

    public void freezeScreen(int i) {
        try {
            Thread.sleep(i);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    

    
    public void imprimirTela() {
        System.out.print("\033[H\033[2J");  
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
                    System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
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

                    if(y == 7 && x == 3) {
                        System.out.print("2 -> " + treinadorX.getMonstroAtivo().getAtaques2().getNome());
                        System.out.print("[" +treinadorX.getMonstroAtivo().getAtaques2().getPoder() + "]") ;
                    }
                } 
                else {
                    if(y == 6 && x == 29) {
                        System.out.print(treinadorY.getMonstroAtivo().getAtaques1().getNome());
                        System.out.print("[" +treinadorY.getMonstroAtivo().getAtaques1().getPoder() + "]" + " <- 1");
                    }
                    if(y == 7 && x == 29) {
                        System.out.print(treinadorY.getMonstroAtivo().getAtaques2().getNome());
                        System.out.print("[" + treinadorY.getMonstroAtivo().getAtaques2().getPoder() + "]" + " <- 2") ;
                    }
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }
    }

    public void animacaoAtaqueX() {
        System.out.print("\033[H\033[2J");  
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
                    System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 4 && x == 23){
                    System.out.print("(ง'̀-'́)-");
                }
                if(y == 4 && x == 25){
                    System.out.print("*ᕕ( O.O )ᕗ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }
    }

    public void animacaoAtaqueXS() {
        System.out.print("\033[H\033[2J");  
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
                    System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 4 && x == 23){
                    System.out.print("(ง'̀-'́)ง");
                }
                if(y == 4 && x == 25){
                    System.out.print("ᕕ( ᐛ )ᕗ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }
    }

    public void animacaoAtaqueY() {
        System.out.print("\033[H\033[2J");  
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
                    System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 4 && x == 1){
                    System.out.print("(ง'o`)ง*");
                }
                if(y == 4 && x == 3){
                    System.out.print("--( ᐛ )ᕗ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }
    }

    public void animacaoAtaqueYS() {
        System.out.print("\033[H\033[2J");  
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
                    System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                }
                if(y == 4 && x == 1){
                    System.out.print("(ง'̀-'́)ง");
                }
                if(y == 4 && x == 3){
                    System.out.print("ᕕ( ᐛ )ᕗ");
                }
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }
    }
    
}
