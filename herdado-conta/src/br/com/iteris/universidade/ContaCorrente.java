package br.com.iteris.universidade;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia,int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }
}
