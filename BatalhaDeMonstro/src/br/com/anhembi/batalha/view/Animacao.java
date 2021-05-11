package br.com.anhembi.batalha.view;

import br.com.anhembi.batalha.model.Treinador;

public class Animacao {
    private int width;
    private int height;
    private Treinador treinadorX;
    private Treinador treinadorY;
    private boolean superEfetivoX;
    private boolean superEfetivoY;
    private String[] animacoesX = {"((ง'̀-'́)ง","((ง'̀-'́)-", "((ง0-0)ง*"};
    private String[] animacoesY = {"ᕕ( ᐛ )ᕗ","--( ᐛ )ᕗ", "*ᕕ( 0-0 )ᕗ"};

    public Animacao(int width, int height, Treinador treinadorX, Treinador treinadorY) {
        this.width = width;
        this.height = height;
        this.treinadorX = treinadorX;
        this.treinadorY = treinadorY;
    }

    public void freezeScreen(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}



    public void ataqueX(boolean ehSuperEfetivo) {
        int bonecoX = 1;
        int bonecoY = 2;
        for (int l =0; l < 5; l++) {
            System.out.println("X: " + bonecoX + "Y: " + bonecoY);
             System.out.print("\033[H\033[2J");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            for (int y = 0; y < this.height; y++) {
                for (int x = 0; x < this.width; x++) {
                    System.out.print(" ");
                    if (y == 1 && x == 3) {
                        System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 1 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 23) {
                        System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 2 && x == 4) {
                        System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 2 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 24) {
                        System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 4 && x == 23) {
                        System.out.print(animacoesX[bonecoX]); 
                        if(bonecoX == 1){
                            bonecoX = 0;
                        } else{
                            bonecoX = 1;
                        }
                    }
                    if (y == 4 && x == 25) {
                        System.out.print(animacoesY[bonecoY]);
                        if(bonecoY == 2){
                            bonecoY = 0;
                        } else{
                            bonecoY = 2;
                        } 
                    }
                }
                System.out.print("\n");
            }
            if(ehSuperEfetivo)
                System.out.println("\t\t Super Efetivo!!");
            System.out.print("\n");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            freezeScreen(200);
        }
        freezeScreen(500);
	}

	public void ataqueY(boolean ehSuperEfetivo) {
        int bonecoX = 2;
        int bonecoY = 1;
        for (int l =0; l < 5; l++) {
             System.out.print("\033[H\033[2J");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            for (int y = 0; y < this.height; y++) {
                for (int x = 0; x < this.width; x++) {
                    System.out.print(" ");
                    if (y == 1 && x == 3) {
                        System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 1 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 23) {
                        System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 2 && x == 4) {
                        System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 2 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 24) {
                        System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 4 && x == 3) {
                        System.out.print(animacoesX[bonecoX]); 
                        if(bonecoX == 2){
                            bonecoX = 0;
                        } else{
                            bonecoX = 2;
                        }
                    }
                    if (y == 4 && x == 5) {
                        System.out.print(animacoesY[bonecoY]);
                        if(bonecoY == 1){
                            bonecoY = 0;
                        } else{
                            bonecoY = 1;
                        } 
                    }
                }
                System.out.print("\n");
            }
            if(superEfetivoY)
                System.out.println("\tSuper Efetivo!!");
            System.out.print("\n");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            freezeScreen(200);
        }
        freezeScreen(500);
	}

	public static void anuncioVitoria(Treinador treinador) {
		System.out.println("\n\n\nFIM DE JOGO! O VENCEDOR É \n" + treinador.getNomeTreinador());
	}

	public void switchX() {
        String troca = "--------*--------";
        for(int l = 0; l < troca.length() ; l++) {
            troca = troca.substring(1, troca.length()-1);
             System.out.print("\033[H\033[2J");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            for (int y = 0; y < this.height; y++) {
                for (int x = 0; x < this.width; x++) {
                    System.out.print(" ");
                    if (y == 1 && x == 3) {
                        System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 1 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 23) {
                        System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 2 && x == 4) {
                        System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 2 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 24) {
                        System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 4 && x + (troca.length()/2) == 7) {
                        System.out.print(troca);
                    }
                    if (y == 4 && x + troca.length() == 25) {
                        System.out.print("ᕕ( ᐛ )ᕗ");
                    }
                }
                System.out.print("\n");
            }
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            freezeScreen(100);
        }
	}

	public void switchY() {
        String troca = "--------*--------";
        for(int l = 0; l < troca.length() ; l++) {
            troca = troca.substring(1, troca.length()-1);
             System.out.print("\033[H\033[2J");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            for (int y = 0; y < this.height; y++) {
                for (int x = 0; x < this.width; x++) {
                    System.out.print(" ");
                    if (y == 1 && x == 3) {
                        System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 1 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 23) {
                        System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 2 && x == 4) {
                        System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 2 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 24) {
                        System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 4 && x + 3 == 7) {
                        System.out.print("((ง'̀-'́)ง");
                    }
                    if (y == 4 && x + 8 == 25) {
                        System.out.print(troca);
                    }
                }
                System.out.print("\n");
            }
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            freezeScreen(100);
        }
    }
    public void switchXY() {
        String troca = "--------*--------";
        for(int l = 0; l < troca.length() ; l++) {
            troca = troca.substring(1, troca.length()-1);
             System.out.print("\033[H\033[2J");
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            for (int y = 0; y < this.height; y++) {
                for (int x = 0; x < this.width; x++) {
                    System.out.print(" ");
                    if (y == 1 && x == 3) {
                        System.out.print("[" + treinadorX.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 1 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 23) {
                        System.out.print("[" + treinadorY.getMonstroAtivo().getNomeMonstro() + "]");
                    }
                    if (y == 2 && x == 4) {
                        System.out.print(treinadorX.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 2 && x + treinadorX.getMonstroAtivo().getNomeMonstro().length() == 24) {
                        System.out.print(treinadorY.getMonstroAtivo().getHp() + "HP");
                    }
                    if (y == 4 && x + (troca.length()/2) == 7) {
                        System.out.print(troca);
                    }
                    if (y == 4 && x + troca.length() == 25) {
                        System.out.print(troca);
                    }
                }
                System.out.print("\n");
            }
            for (int i = 1; i < this.width; i++) {
                System.out.print("-");
            }
            freezeScreen(100);
        }
    }
}
