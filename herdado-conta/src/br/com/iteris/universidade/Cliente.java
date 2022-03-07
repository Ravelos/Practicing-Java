package br.com.iteris.universidade;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;


    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String setCpf(String cpf) {
        this.cpf = cpf;
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}