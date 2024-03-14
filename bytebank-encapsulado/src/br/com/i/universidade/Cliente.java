package br.com.i.universidade;

public class Cliente implements Atenticavel{
    private String nome;
    private String cpf;
    private String profissao;

    private AutenticacaoUtil autenticador;

    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public void setSenha(int senha){

        this.autenticador.setSenha(senha);

    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

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
