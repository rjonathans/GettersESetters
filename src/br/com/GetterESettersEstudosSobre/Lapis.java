package br.com.GetterESettersEstudosSobre;

import com.sun.media.sound.ModelOscillator;

public class Lapis {
    public String modelo;
    private float ponta;
    boolean tampada;
    public String cor;
    public boolean apontado;
    
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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isApontado() {
        return apontado;
    }

    public void setApontado(boolean apontado) {
        this.apontado = apontado;
    }

}
