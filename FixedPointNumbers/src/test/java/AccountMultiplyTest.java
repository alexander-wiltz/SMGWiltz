import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountMultiplyTest {

    /**
     * \author Alexander Wiltz
     * \since 2022-09-08
     *
     * \brief Testcases for the new Account-class with the multiply()-method
     */

    private static double delta;
    private static double x, y, correctValue;
    private static Account money;

    /**
     * \brief Setup
     * \param s = 100
     * \param v = 0
     *
     * \param x = 2.0
     * \param y = 3.0
     *
     * \param correctValue = 6.0
     *
     * \param delta = 0.001
     *
     * @throws Exception
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        int s = 100;
        int v = 0;

        money = new Account(s, v);

        x = 2.0;
        y = 3.0;
        correctValue = 6.0;
        delta = 0.001;
    }

    /**
     * \brief Test the multiply()-method by setting x and y
     *
     * Should return true when value equals to 6.0
     */
    @Test
    void testMultiply() {
        money.set(x);
        money.multiply(y);
        assertEquals(correctValue, money.get(), delta);
    }
}
