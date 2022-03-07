package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca contapoupanca = new ContaPoupanca(1345, 234765);
        contapoupanca.deposita(200.00);

        ContaCorrente contaCorrente =new ContaCorrente(1232,435673);
        contaCorrente.deposita(100);
        contaCorrente.saca(50);


        System.out.println(contaCorrente.getSaldo());
        System.out.println(contapoupanca.getSaldo());
    }
}
