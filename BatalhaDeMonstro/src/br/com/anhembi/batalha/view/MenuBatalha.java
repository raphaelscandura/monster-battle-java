package br.com.anhembi.batalha.view;
import br.com.anhembi.batalha.model.*;
import br.com.anhembi.batalha.control.Ataque;
    
public class MenuBatalha {
    public static void main(String[] args) {
        FabricaMonstro fabricaMonstro = new FabricaMonstro();
        Treinador Bob = new Treinador();
        Treinador Gob = new Treinador();
        Interface inter = new Interface(Bob,Gob);

        inter.imprimirTela();
        inter.imprimirTela();
        inter.imprimirTela();

    }
}

