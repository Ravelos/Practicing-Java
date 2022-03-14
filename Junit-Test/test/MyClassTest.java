import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testQuotient() {
        MyClass tester = new MyClass();
        int result = tester.quotient(10, 5);
        assertEquals(2, result);

    }
}