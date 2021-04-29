package br.com.anhembi.batalha.view;
import br.com.anhembi.batalha.model.*;
    /**
     * (ง'̀-'́)ง 
     * 
     * ᕕ( ᐛ )ᕗ
     * 
     */
public class MenuEscolhas {

	public static void main(String[] args) {
			Treinador Bob = new Treinador();
			Treinador Gob = new Treinador();
			Interface inter = new Interface(Bob,Gob);

			Monstros alpha = new Liquides();
			Monstros beta = new Rockin();
			Monstros omega = new Flair();
			
			Bob.addMonstro(alpha);
			Bob.addMonstro(alpha) ; 
			Bob.addMonstro(alpha);

			Gob.addMonstro(omega);
			Gob.addMonstro(omega) ;
			Gob.addMonstro(omega);

			inter.imprimirTela();

			// String nome = Bob.getMonstro(0).getNomeMonstro();
			// int defesa = Bob.getMonstro(0).getDefesa();
			// int ataque = Bob.getMonstro(0).getForça();
			// System.out.println(nome);
			// System.out.println("Defesa: " + defesa);
			// System.out.println("Ataque: " + ataque + "\n\n");
			
			// nome = Bob.getMonstro(1).getNomeMonstro();
			// defesa = Bob.getMonstro(1).getDefesa();
			// ataque = Bob.getMonstro(1).getForça();
			// System.out.println(nome);
			// System.out.println("Defesa: " + defesa);
			// System.out.println("Ataque: " + ataque + "\n\n");
			
			// nome = Bob.getMonstro(2).getNomeMonstro();
			// defesa = Bob.getMonstro(2).getDefesa();
			// ataque = Bob.getMonstro(2).getForça();
			// System.out.println(nome);
			// System.out.println("Defesa: " + defesa);
			// System.out.println("Ataque: " + ataque + "\n\n");
			
			// nome = Bob.getMonstroAtivo().getNomeMonstro();
			// System.out.println(nome);
		}

}

