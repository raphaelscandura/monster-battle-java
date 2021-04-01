package br.com.anhembi.batalha.model;
/**
 * @author Michael Carlos
 */
public class Treinador {
  private Monstros alpha;
  private Monstros beta;
  private Monstros omega;

  public Treinador(String alpha, String beta) {
      this.alpha = new Monstros(alpha);
      this.beta = new Monstros(beta);
  }

  public int getMonsterVida(){
    return getMonstroAtivo().getVida();
  }

  public ???? getMonsterAttack(){
    return getMonstroAtivo().getAttack();
  }

  public String getMonstroTipo() {
    return getMonstroAtivo().getTipo();
  }

  public Monstros getMonstroAtivo() {
    if(alpha.getVida() < 0){
      return alpha;
    } else {return beta;}
    return omega;
  }
}
