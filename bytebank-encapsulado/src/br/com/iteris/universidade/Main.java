package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        //Testando contas

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        // Testando tributavel


        SeguroDeVida seguro = new SeguroDeVida();


        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println("O imposto total é " + calc.getTotalImposto());







    }
}
