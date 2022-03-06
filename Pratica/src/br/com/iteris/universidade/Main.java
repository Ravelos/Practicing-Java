package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta(2345,78900);
        primeiraConta.deposita(200);
        System.out.println("A primeira conta começou com " + primeiraConta.getSaldo());

        primeiraConta.deposita(500);
        System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo());


        Conta segundaConta = new Conta(3452,98767);
        segundaConta.deposita(150);
        System.out.println("O saldo da segunda conta é " + segundaConta.getSaldo());
    }
}
