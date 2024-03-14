package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int res = calculadora.soma(2,3);
        System.out.println(res);

        int res1=calculadora.soma(3,0);
        System.out.println(res1);

        int res2=calculadora.soma(3,0);
        System.out.println(res2);

        int res3 = calculadora.soma(0,0);
        System.out.println(res3);

        int res4 = calculadora.soma(3,-1);
        System.out.println(res4);
    }
}
