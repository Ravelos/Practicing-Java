package br.com.i.universidade;

public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
