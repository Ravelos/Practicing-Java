package br.com.i.universidade;

public abstract class Conta {
    //saldo protectec so that it could be used in children classes
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        // Adding accounts in order to see the total
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

    }

    public void saca(double valor) throws SaldoInsuficienteExcecao{
        if(this.saldo < valor){
            throw new SaldoInsuficienteExcecao("Saldo: " + saldo + " Valor: " + valor);
        }
        this.saldo -= valor;
    }

    //abstract class in order to use it in children
    public abstract void deposita(double valor);



    public void transfere(double valor, Conta destino) throws SaldoInsuficienteExcecao{
            this.saca(valor);
            destino.deposita(valor);
    }



    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
