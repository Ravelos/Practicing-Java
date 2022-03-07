package br.com.iteris.universidade;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        System.out.println("O total de contas é " + Conta.total);
        this.saldo = 100;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;

        System.out.println("Estou criando uma conta " + this.numero);
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

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Não poder ser um número menor ou igual a cero");
        }
    }

    public int getAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode ser um número menor ou igual a cero");
        }
        return this.agencia = agencia;
    }

    public void setTitular(Cliente titular){

        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public int getTotal(){
        return Conta.total;
    }
}