package service;

import modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario){

        BigDecimal valor =funcionario.getSalario().multiply(new BigDecimal("o.1"));
        if(valor.compareTo(new BigDecimal("1000"))>0){
            valor = BigDecimal.ZERO;
        }
        return valor.setScale(2, RoundingMode.HALF_UP);

    }
}
