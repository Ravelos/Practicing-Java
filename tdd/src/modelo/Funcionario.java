package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataDeAdmissao;
    private BigDecimal salario;

    public Funcionario( String nome,LocalDate dataDeAdmissao,BigDecimal salario){
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void reajustarSalario(BigDecimal reajuste) {
        this.salario = this.salario.add(reajuste);
    }
}
