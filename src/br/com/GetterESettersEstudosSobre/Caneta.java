package br.com.GetterESettersEstudosSobre;

public class Caneta {
    public String modelo;
    private float ponta;
    boolean tampada;
    public String cor;
    public boolean destampada;

    /*public Caneta(){  // Este é o metodo construtor
        this.tampar();
        this.cor="Azul";
        this.ponta=0.5f;
    }
    */
     Caneta(String m,String c,float p,boolean t){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampada = t;

    }

    //metodo
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("A caneta é cor: "+this.cor);
        System.out.println("a Ponta é: "+this.ponta);
        System.out.println("Ela esta tampada"+this.tampada);
    }
}
