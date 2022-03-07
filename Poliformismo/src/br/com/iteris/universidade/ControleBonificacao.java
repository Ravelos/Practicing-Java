package br.com.iteris.universidade;

public class ControleBonificacao {

    private double soma;

    public double getSoma() {
        return soma;
    }

    public void registra(Funcionario funcionario){

        double bonificacion = funcionario.getBonificacion();
        this.soma = this.soma + bonificacion;
    }

    
}
