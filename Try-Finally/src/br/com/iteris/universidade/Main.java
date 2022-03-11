package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        Conexao conexao = null;

        try(Conexao conexao1 = new Conexao()){

            conexao1.leDados();

        }catch (Exception ex){
            System.out.println("Deu erro na conexão");
        }

//        try{
//            //1 Conexao conexao = new Conexao();
//            conexao =  new Conexao();
//
//            conexao.leDados();
//            conexao.fecha();
//        }catch(IllegalStateException ex){
//            System.out.println("Deu erro");
//
//            //  1 Não fecho o processo. Precisamos do bloco finally invocando o metodo fecha
//
//        }finally{
//            conexao.fecha();
//
//            // Permite fechar o processo.
//        }
    }
}
