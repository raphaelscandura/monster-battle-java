public class Status {

    private Integer vida;
    private Integer forca;
    private Integer defesa;
    private Integer velocidade;
    String tipo=new string();

    public Monstros() {
    }

    public Monstros(Integer umVida, Integer umForca, Integer umDefesa, Integer umVelocidade) {

        this.vida = umVida;
        this.forca = umForca;
        this.defesa = umDefesa;
        this.velocidade = umVelocidade;
    }

    public Integer getVida() {
        if(tipo=="fogo"){return 15;}
        if(tipo=="grama"){return 10;}
        if(tipo=="agua"){return 14;}
        if(tipo=="eletrico"){return 7;}
        if(tipo=="pedra"){return 12;}
        if(tipo=="voador"){return 11;}
    }

    public Integer getforca() {
        if(tipo=="fogo"){return 18;}
        if(tipo=="grama"){return 17;}
        if(tipo=="agua"){return 15;}
        if(tipo=="eletrico"){return 20;}
        if(tipo=="pedra"){return 19;}
        if(tipo=="voador"){return 14;}
    }

    public Integer getdefesa() {
        if(tipo=="fogo"){return 9;}
        if(tipo=="grama"){return 14;}
        if(tipo=="agua"){return 15;}
        if(tipo=="eletrico"){return 8;}
        if(tipo=="pedra"){return 17;}
        if(tipo=="voador"){return 10;}
    }

    public Integer getvelocidade() {
        if(tipo=="fogo"){return 13;}
        if(tipo=="grama"){return 8;}
        if(tipo=="agua"){return 13;}
        if(tipo=="eletrico"){return 20;}
        if(tipo=="pedra"){return 10;}
        if(tipo=="voador"){return 18;}
    }

}