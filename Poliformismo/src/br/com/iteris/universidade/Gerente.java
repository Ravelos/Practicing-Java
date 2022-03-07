package br.com.iteris.universidade;

public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autenticaSenha(int senha){
        if (this.senha == senha){
            return true;
        }
        return false;
    }

    public double getBonificacao(){
        return super.getBonificacion() + super.getSalario();
    }
}
