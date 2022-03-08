package br.com.iteris.universidade;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public abstract double getBonificacion();


}
