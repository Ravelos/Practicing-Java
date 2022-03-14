package modelo;

import java.math.BigDecimal;

public enum Desempenho {

    A_DESEJAR{
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.03");
        }
    },

    BOM{
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.15");
        }
    },

    OTIMO{
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.20");
        }
    }
}
