package br.com.iteris.universidade;

public class SaldoInsuficienteExcecao extends RuntimeException{
    public SaldoInsuficienteExcecao(String msg){
        super(msg);
    }
}
