package br.com.GetterESettersEstudosSobre;

import com.sun.media.sound.ModelOscillator;

public class Lapis {
    private float ponta;
    private boolean tampada;
    private String cor;
    private boolean apontado;
    private String modelo;

    //Metodo
    public void status(){
        System.out.println("Eu tenho um Lapis");
    }

    public Lapis(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public boolean isApontado() {
        return apontado;
    }

    public void setApontado(boolean a) {
        this.apontado = a;
    }

}
