package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta(2345,78900);
        primeiraConta.deposita(200);
        System.out.println("A primeira conta começou com " + primeiraConta.getSaldo());

        primeiraConta.deposita(500);
        System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo());


        Conta segundaConta = new Conta(3452,98767);
        segundaConta.deposita(150);
        System.out.println("O saldo da segunda conta é " + segundaConta.getSaldo());



        Cliente fernando = new Cliente();
        fernando.setNome("Fernando Villalona");
        fernando.setCpf("09876543");
        fernando.setProfissao("Mestre de obras");

        Conta contaDoFernando = new Conta(2345,9387);
        contaDoFernando.deposita(3000);
        contaDoFernando.transferir(200, primeiraConta);

        System.out.println(" A conta do Fernando Villalona tem " + contaDoFernando.getSaldo());
        System.out.println(" A primeira conta tem " + primeiraConta.getSaldo());

        Conta contaDoBruno = new Conta(2345,9879);
        System.out.println(contaDoBruno.getSaldo());

        contaDoBruno.setTitular(new Cliente());
        System.out.println(contaDoBruno.getTitular());
        // pega o espaço da memoria aonde é guardado esse dado

        contaDoBruno.getTitular().setNome("Bruno");
        System.out.println(contaDoBruno.getTitular().getNome());
        // Pega o dado per se
    }
}
