package br.com.GetterESettersEstudosSobre;

public class Principal {
    public static void main(String[] args) {
        /*Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.status();

        c1.modelo="BIC";
        c1.setPonta(0.5f);
        //ci.ponta = 0.5f;

        System.out.print("Tenho uma caneta "+ c1.getModelo());

         */

        Caneta c1 = new Caneta("BIC","Preto",0.5f,true);
        c1.status();
        Caneta c2 = new Caneta("kkk","Amarela",);

    }
}
