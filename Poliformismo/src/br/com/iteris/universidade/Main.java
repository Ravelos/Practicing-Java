package br.com.iteris.universidade;

public class Main {

    public static void main(String[] args) {

        Funcionario jose = new Funcionario();
        jose.setNome("José Daniel");
        jose.setCpf("98765432");
        jose.setSalario(3500.00);

        System.out.println("O salario de José é " + jose.getSalario());
        System.out.println("O nome completo desse cliente é " + jose.getNome());


        Gerente luiz = new Gerente();
        luiz.setNome("Luiz Mastantuano");
        luiz.setSalario(5000.00);
        luiz.setSenha(3456);
        luiz.setCpf("786544111");

        System.out.println(luiz.getNome());
        System.out.println(luiz.getSalario());


        boolean passwordCheck = luiz.autenticaSenha(3421);
        System.out.println(passwordCheck);

    }
}
