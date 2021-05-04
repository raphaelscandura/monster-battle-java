package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.Ataque;

/**
 * @author Michael Carlos Damasceno Lima
 */
public class Treinador {
  private Monstros monstro[] = new Monstros[3];
  private int numeroDeMonstros = 0;
  
  public Treinador() {

  }
  
  public void addMonstro(Monstros monstrosEscolhido) {
	  monstro[numeroDeMonstros] = monstrosEscolhido;
	  numeroDeMonstros++;
  }

  public int getMonsterVida(){
    return getMonstroAtivo().getVida();
  }

  public String getMonstroTipo() {
    return getMonstroAtivo().getTipo();
  }
  
  public Monstros getMonstro(int i) {
	  return this.monstro[i];
  }

  public Monstros getMonstroAtivo() {
    if(monstro[0].getVida() < 0){
      return monstro[0];
    } else if(monstro[1].getVida() < 0){
    	return monstro[1];
    } else {
    	return monstro[2];
    }
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
