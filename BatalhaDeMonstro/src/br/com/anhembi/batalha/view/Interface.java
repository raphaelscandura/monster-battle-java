package br.com.anhembi.batalha.view;

import br.com.anhembi.batalha.model.*;
import java.util.Scanner;



public class Interface {
    private Treinador treinadorX;
    private Treinador treinadorY;
    private int width = 50;
    private int height = 9;
    private boolean turn = false;

    public Interface (Treinador treinadorX, Treinador treinadorY) {
        this.treinadorX = treinadorX;
        this.treinadorY = treinadorY;
    }

    public void imprimirTela() {
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");            
        }
        for(int y = 0; y < this.height; y++) {
            for(int x = 0; x < this.width; x++) {
                System.out.print(" ");
                if(y == 1 && x == 3){
                    System.out.print("["+treinadorX.getMonstro(1).getNomeMonstro()+"]");
                }
                if(y == 1 && x == 22){
                    System.out.print("["+treinadorY.getMonstro(1).getNomeMonstro()+"]");
                }
                if(y == 2 && x == 6){
                    System.out.print(treinadorX.getMonstro(1).getHP() + "HP");
                }
                if(y == 2 && x == 30){
                    System.out.print(treinadorY.getMonstro(1).getHP() + "HP");
                }
                if(y == 4 && x == 5){
                    System.out.print("(à¸‡'Ì€-'Ì�)à¸‡");
                }
                if(y == 4 && x == 25){
                    System.out.print("á••( á�› )á•—");
                }
                /**
                 * if(y == 4 && x == 3) {
                 *      System.out.println(treinadorX.getMonsterAttack().ataque1());
                 * }
                 * if(y == 4 && x == 3) {
                 *      System.out.println(treinadorX.getMonsterAttack().ataque2());
                 * }
                 * if(y == 4 && x == 20) {
                 *      System.out.println(treinadorY.getMonsterAttack().ataque1());
                 * }
                 * if(y == 4 && x == 20) {
                 *      System.out.println(treinadorY.getMonsterAttack().ataque2());
                 * }
                 */
            }
            System.out.print("\n");
        }
        for(int i = 1; i < this.width; i++) {
            System.out.print("-");
        }
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
 
}
