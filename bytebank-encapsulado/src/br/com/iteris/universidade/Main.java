package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        Cliente alex = new Cliente();
        alex.setNome("Alex Silveira");
        alex.setCpf("986588654");
        alex.setProfissao("Programador");

        Conta contaDoAlex = new Conta(3456,9876);
        contaDoAlex.setTitular(alex);
        contaDoAlex.deposita(200);

        Conta felipe = new Conta(3456, 6789);
        felipe.deposita(200);
        felipe.saca(500);

        boolean sucessoTransferencia = felipe.transfere(100,contaDoAlex);

        if(sucessoTransferencia){
            System.out.println("Transferencia feita com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }

        System.out.println("O saldo do senhor Alex é " + contaDoAlex.getSaldo());
        System.out.println("O saldo do senhor Felipe é " + felipe.getSaldo());
        System.out.println("O titular dessa conta é " + contaDoAlex.getTitular().getNome());





    }
}
