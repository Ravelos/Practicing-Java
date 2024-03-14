package br.com.i.universidade;

public class SaldoInsuficienteExcecao extends RuntimeException{
    public SaldoInsuficienteExcecao(String msg){
        super(msg);
    }
}
