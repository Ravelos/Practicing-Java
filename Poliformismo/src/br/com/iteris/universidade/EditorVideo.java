package br.com.iteris.universidade;

public class EditorVideo extends Funcionario{

    @Override
    public double getBonificacion() {
        return this.getSalario() + 200;
    }
}
