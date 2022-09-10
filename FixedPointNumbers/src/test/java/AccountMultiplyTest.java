import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountMultiplyTest {

    private static double delta;
    private static double x, y, correctValue;
    private static Account money;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        int s = 100,
                v = 0;

        money = new Account(s, v);

        x = 2.0;
        y = 3.0;
        correctValue = 6.0;
        delta = 0.001;
    }

    @Test
    void testMultiply() {
        money.set(x);
        money.multiply(y);
        assertEquals(correctValue, money.get(), delta);
    }
}
