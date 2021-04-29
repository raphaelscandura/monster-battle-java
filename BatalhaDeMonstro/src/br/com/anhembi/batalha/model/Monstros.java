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

        public String getstatus() {
            return status;
        }

        public String getAtaques1() {
            return ataques1;
        }

        public String getAtaques2() {
            return ataques2;
        }

        public int gettemVida() {
            return temvida;
        }

        public int getForca() {
            return forca;
        }

        public int getDefesa() {
            return defesa;
        }

        public int getVelocidade() {
            return velocidade;
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
