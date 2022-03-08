package br.com.iteris.universidade;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public void setNome(String nome) {
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

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }
}
