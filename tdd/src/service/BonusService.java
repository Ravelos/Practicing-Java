package service;

import modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario){

        BigDecimal valor =funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if(valor.compareTo(new BigDecimal("1000"))>0){
            throw new IllegalArgumentException("Funcionario com salario > 10000.00 não pode receber bonus");
        }
        return valor.setScale(2, RoundingMode.HALF_UP);

    }


}
