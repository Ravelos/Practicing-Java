package br.com.iteris.universidade;

public class Designer extends Funcionario{

    @Override
    public double getBonificacion() {
        return super.getSalario() + 150;
    }
}
