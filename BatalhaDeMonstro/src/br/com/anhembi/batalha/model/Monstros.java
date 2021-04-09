package br.com.anhembi.batalha.model;
/**
 * 
 * @author Sabrina Fernandes
 *
 */
public class Monstros {
    protected int Id;
    protected String nomeMonstro;
    protected String status;
    protected String ataques1;
    protected String ataques2;
    protected int temvida;
    protected int forca;
    protected int defesa;
    protected int velocidade;
    String fraqueza;
    
        public String getNomeMonstro() {
            return nomeMonstro;
        }
    
        public void setNomeMonstro(String nomeMonstro) {
            this.nomeMonstro = nomeMonstro;
        }
    
        public String getstatus() {
            return status;
        }
    
        public void setstatus(String status) {
            this.status = status;
        }
    
        public String getAtaques1() {
            return ataques1;
        }
    
        public void setAtaques1(String ataques1) {
            this.ataques1 = ataques1;
        }
    
        public String getAtaques2() {
            return ataques2;
        }
    
        public void setAtaques2(String ataques2) {
            this.ataques2 = ataques2;
        }
    
        public int gettemVida() {
            return temvida;
        }
    
        public void settemVida(int vida) {
            this.temvida = vida;
        }
    
        public int getForca() {
            return forca;
        }
    
        public void setForça(int forca) {
            this.forca = forca;
        }
    
        public int getDefesa() {
            return defesa;
        }
    
        public void setDefesa(int defesa) {
            this.defesa = defesa;
        }
    
        public int getVelocidade() {
            return velocidade;
        }
    
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }
        
    }

    public int getVida(){
        return ???;
    }

    public int getAtaques(){
        return ???;
    }

    public String getTipo(){
        return ???;
    }

}
