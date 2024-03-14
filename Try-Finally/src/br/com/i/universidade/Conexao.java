package br.com.i.universidade;

public class Conexao implements AutoCloseable{

    public Conexao(){
        System.out.println("Abrindo conexão");
    }

    public void leDados(){
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }


    public void fecha(){
        System.out.println("Fechando conexão");
    }

    @Override
    public void close() throws Exception {

    }
}
