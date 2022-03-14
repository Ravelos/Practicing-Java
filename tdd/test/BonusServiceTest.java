import modelo.Funcionario;
import org.junit.Test;
import service.BonusService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class BonusServiceTest {

    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService service = new BonusService();
       // assertThrows(IllegalArgumentException.class,() -> service.calcularBonus(new Funcionario("Rafael",LocalDate.now(),new BigDecimal("25000"))));
        try{
            service.calcularBonus(new Funcionario("Rafael",LocalDate.now(),new BigDecimal("25000")));
            fail("Exception failed");
        }catch (Exception e){
            assertEquals("Funcionario com salario > 10000.00 não pode receber bonus",e.getMessage());

        }

    }

    @Test
    public void bonusDeveriaSerDezPorcentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rafael",LocalDate.now(),new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"),bonus);
    }

    @Test
    public void bonusDeveriaSerIgualADezPorcentoParaSalarioDeDezMil(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rafael",LocalDate.now(),new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"),bonus);
    }
}
