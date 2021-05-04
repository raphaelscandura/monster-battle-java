package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.view.MenuBatalha;
import br.com.anhembi.batalha.view.*;


public class Jogo {
    public static void main(String[] args){
        Treinador x = new Treinador();
        Treinador y = new Treinador();
        MenuEscolhas menuEscolhas = new MenuEscolhas();
        MenuBatalha menuBatalha = new MenuBatalha(x,y);

        menuEscolhas.escolhas(x,y);
        menuBatalha.imprimirTela();
        menuBatalha.imprimirTela();
        menuBatalha.imprimirTela();
        menuBatalha.imprimirTela();
    }
}
