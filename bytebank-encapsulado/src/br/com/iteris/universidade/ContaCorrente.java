package br.com.iteris.universidade;

public class ContaCorrente extends Conta implements Tributavel{


    public ContaCorrente(int agencia,int numero){
        super(agencia,numero);
    }


    public void saca(double valor) throws SaldoInsuficienteExcecao{
        double valorASacar = valor +0.2;
        super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

    @Override
    public double getValorImposto(){
        return super.saldo += 0.01;
    }


}
