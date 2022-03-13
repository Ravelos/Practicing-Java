import org.junit.Test;
import service.BonusService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus("Raul", LocalDate.now(),new BigDecimal("25000"));
                assertEquals(new BigDecimal("0.00"),bonus);
    }
}
