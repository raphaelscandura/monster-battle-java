package br.com.anhembi.batalha.view;
import br.com.anhembi.batalha.model.*;
import br.com.anhembi.batalha.control.Ataque;
    
public class MenuBatalha {
    public static void main(String[] args) {
        Treinador Bob = new Treinador();
        Treinador Gob = new Treinador();
        Interface inter = new Interface(Bob,Gob);

        for(int i = 0; i < 3; i++){
            Bob.addMonstro(inter.printEscolhas(i));
            System.out.println("i:  " + i);
            System.out.println("Nome Monstro:      " + Bob.getMonstro(i).getNomeMonstro());
            System.out.println("Ataque 1:          " + Bob.getMonstro(i).getAtaques1().getNome() +"[" + Bob.getMonstro(i).getAtaques1().getPoder() + "] --" + Bob.getMonstro(i).getAtaques1().getTipo());
            System.out.println("Ataque 1:          " + Bob.getMonstro(i).getAtaques2().getNome() +"[" + Bob.getMonstro(i).getAtaques2().getPoder() + "] --" + Bob.getMonstro(i).getAtaques2().getTipo());
        }
    }
}

