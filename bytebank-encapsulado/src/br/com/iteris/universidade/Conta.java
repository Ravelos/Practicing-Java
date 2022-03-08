package br.com.iteris.universidade;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;


    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        Conta.total++;
        System.out.println("Estou criando uma conta " + this.numero);
        System.out.println("O total de contas é " + Conta.total);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

         public boolean saca(double valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero){
        if(this.numero<=0){
            System.out.println("Não pode ser um número menor ou igual a cero");
            return;
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Não pode ser um número igual ou menor que cero");
            return;
        }
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
