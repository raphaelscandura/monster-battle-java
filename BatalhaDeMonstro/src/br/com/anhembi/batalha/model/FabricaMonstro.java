package br.com.anhembi.batalha.model;

import br.com.anhembi.batalha.control.Ataque;

public class FabricaMonstro {

    /**
     * this.Id = 2;
     * this.nomeMonstro = "Goiabao";
     * this.status = "Grama" ;
     * this.ataques1 = "Pinhão" ;
     * this.ataques2 = "Suco de Fruta";
     * this.temvida = 10;
     * this.forca = 17;
     * this.defesa = 14;
     * this.velocidade = 8;
     * @throws ClassNotFoundException
     */
    
    public static Monstros criarMonstro(int tipo) {
        Monstros monstro = instanciarMonstros(tipo);
        return monstro;
    }

    public static Monstros instanciarMonstros(int id) {
        Ataque ataqueX;
        Ataque ataqueY;
        Monstros monstro;
        switch(id) {
            case 0:
                ataqueX = new Ataque(17, "eletrico", "Golpe do Trovão");
                ataqueY = new Ataque(15, "voador", "Mergulho do Alto");
                monstro = new Flair(id, "Flair", "vivo", ataqueX, ataqueY, 7, 20, 8, 20);
                return monstro;
            case 1:
                ataqueX = new Ataque(17, "fogo", "Soco Flamejante");
                ataqueY = new Ataque(7, "grama", "Grama Quente");
                monstro = new Flair(id, "Fogareu", "vivo", ataqueX, ataqueY, 15, 18, 9, 13);
                return monstro;
            case 2:
                ataqueX = new Ataque(12, "grama", "Pinhão");
                ataqueY = new Ataque(16, "agua", "Suco de Fruta");
                monstro = new Flair(id, "Goiabão", "vivo", ataqueX, ataqueY, 10, 17, 14, 8);
                return monstro;
            case 3:
                ataqueX = new Ataque(17, "agua", "Fonte Gelada");
                ataqueY = new Ataque(16, "fogo", "Magma");
                monstro = new Flair(id, "Liquides", "vivo", ataqueX, ataqueY, 14, 15, 15, 13);
                return monstro;
            case 4:
                ataqueX = new Ataque(16, "pedra", "Soco Petrificador");
                ataqueY = new Ataque(19, "eletrico", "Eletrocutar");
                monstro = new Flair(id, "Rocking", "vivo", ataqueX, ataqueY, 12, 19, 17, 10);
                return monstro;
            case 5:
                ataqueX = new Ataque(11, "voador", "Espada de Vento");
                ataqueY = new Ataque(14, "pedra", "Ciclone Bomba");
                monstro = new Flair(id, "Satoshi", "vivo", ataqueX, ataqueY, 11, 14, 10, 18);
                return monstro;
            default:
                ataqueX = new Ataque(10, "????", "Gritar");
                ataqueY = new Ataque(0, "????", "Chorar");
                monstro = new Flair(1000, "Blob", "vivo", ataqueX, ataqueY, 10, 10, 10, 10);
                return monstro;

        }
    } 
}
