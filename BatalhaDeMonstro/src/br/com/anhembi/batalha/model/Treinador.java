package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.Ataque;

/**
 * @author Michael Carlos Damasceno Lima
 */
public class Treinador {
  private Monstros monstro[] = new Monstros[3];
  private int numeroDeMonstros = 0;
  private int monstrosVivos = 0;
  private String nomeTreinador;


  public Treinador(String nome) {
    this.nomeTreinador = nome;
  }

  public void addMonstro(Monstros monstrosEscolhido) {
	  monstro[numeroDeMonstros] = monstrosEscolhido;
	  numeroDeMonstros++;
    monstrosVivos++;
  }

  public String getNomeTreinador() {
    return this.nomeTreinador;
  }

  public Monstros getMonstroAtivo() {
    if(this.monstro[0].getHp() > 0){
      monstrosVivos--;
      return monstro[0];
    } else if(monstro[1].getHp() > 0){
      monstrosVivos--;
    	return monstro[1];
    } else {
      monstrosVivos--;
    	return monstro[2];
    }
  }

  public int getMonstrosVivos() {
    return monstrosVivos;
  }

  public void getAllMonstros() {
    for(int i = 0; i < 3; i++) {
        Monstros monstroX = monstro[i];
          System.out.println("ID: " + monstroX.getID());
          System.out.println("Nome: " + monstroX.getNomeMonstro());
          System.out.println("Tipo: " + monstroX.getTipo());
          System.out.println("HP: " + monstroX.getHp());
          System.out.println("Ataque: " + monstroX.getForca());
          System.out.println("Defesa: " + monstroX.getDefesa());
          System.out.println("Velocidade: " + monstroX.getVelocidade() + "\n");
    }
  }

  public Ataque escolherAtaque(int i) {
    if(i == 0) {
      return this.getMonstroAtivo().getAtaques1();
    } else {
      return this.getMonstroAtivo().getAtaques2();
    }
  }
}
