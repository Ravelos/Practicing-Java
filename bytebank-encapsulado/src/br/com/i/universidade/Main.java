package br.com.i.universidade;

import java.security.Guard;

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

      //  System.out.println("O imposto total é " + calc.getTotalImposto());

//        Conta conta = new ContaCorrente(231,3212);
//        conta.deposita(200.00);
//
//        try{
//            conta.saca(234);
//        }catch (SaldoInsuficienteExcecao ex){
//            System.out.println("Exception: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//        System.out.println(conta.getSaldo());


        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta contaCorrente1 = new ContaCorrente(22,11);
        guardador.adicionar(contaCorrente1);

        Conta contaCorrente2 = new ContaCorrente(44,33);
        guardador.adicionar(contaCorrente2);

        int tamanho = guardador.getQuantidadeDeElementos();

        Conta ref = guardador.getReferencia(0);


        System.out.println(tamanho);
        System.out.println(ref.getNumero());

        System.out.println(ref.getNumero());

        GuardadorDeReferencias guardador1 = new GuardadorDeReferencias();

        Conta contaCorrente3 = new ContaCorrente(345,99);
        guardador1.adicionar(contaCorrente3);

        Conta contaCorrente4 = new ContaCorrente(541,55);
        guardador1.adicionar(contaCorrente4);

        int tamanho1 =guardador1.getQuantidadeDeElementos();

        System.out.println(tamanho1);

        Conta ref1 = (Conta) guardador.getReferencia(2);

        System.out.println(ref1.getNumero());


    }
}
