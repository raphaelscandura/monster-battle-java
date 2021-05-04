package br.com.anhembi.batalha.model;
/**
 * @author Michael Carlos Damasceno Lima
 */
<<<<<<< HEAD
public class Treinador {
  private Monstros monstro[] = new Monstros[3];
  private int numeroDeMonstros = 0;
=======
public class Treinador{
  private Monstros alpha;
  private Monstros beta;
  private Monstros omega;
>>>>>>> d56d462379f69ff325cbc0df9d3da1bd19f77aab

  public Treinador(Monstros alpha, Monstros beta, Monstros omega) {
      this.monstro[0] = alpha;
      this.monstro[1] = beta;
      this.monstro[2] = omega;
  }
  
  public Treinador() {

  }
  
  public void addMonstro(Monstros monstrosEscolhido) {
	  monstro[numeroDeMonstros] = monstrosEscolhido;
	  numeroDeMonstros++;
  }

  public int getMonsterVida(){
    return getMonstroAtivo().getVida();
  }

//  public ???? getMonsterAttack(){
//    return getMonstroAtivo().getAttack();
//  }

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

	public void trocaMonstro() {
		
	}
}
