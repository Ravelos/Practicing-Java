import modelo.Desempenho;
import modelo.Funcionario;
import org.junit.Test;
import service.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {


    @Test
    public void reajusteDeveSerDeTresPorcentoQuandoDesempenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Lucy", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveSerDeQuinzePorcentoQuandoDesempenhoForBom(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Lucy", LocalDate.now(),new BigDecimal("1000"));
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveSerDeVintePorcentoQuandoDesempenhoForBom(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Lucy", LocalDate.now(),new BigDecimal("1000"));
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
