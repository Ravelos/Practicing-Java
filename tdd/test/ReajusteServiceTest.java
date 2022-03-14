import modelo.Desempenho;
import modelo.Funcionario;
import org.junit.Test;
import service.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Lucy", LocalDate.now(),new BigDecimal("1000"));
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
}
