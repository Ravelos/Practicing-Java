package br.com.i.universidade;

public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

     public boolean autentica(int senha){
        if(this.senha == senha ){
            return true;
        }
        return false;
     }
}
