import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FixedPointAddSubtactTest {

	/**
	 * \author Prof. Dr. Manfred Brill
	 *
	 * \brief Testcases for the add and subtract values
	 */

	private static double delta;
	private static double x, y, z, correctSum, correctDifference;
	private static FixedPointNumber lengths;

	/**
	 * \brief Setup
	 * \param s = 200
	 * \param v = 200
	 *
	 * \param x = 1.0
	 * \param y = 2.0
	 * \param z = 5.0
	 *
	 * \param correctSum = 3.0
	 * \param correctDifference = 4.0
	 *
	 * \param delta = 0.001
	 *
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		int s = 200,
	        v = 200;
		
	    lengths = new FixedPointNumber(s, v);
	    
	    x = 1.0;
	    y = 2.0;
	    z = 5.0;
	    correctSum = 3.0;
	    correctDifference = 4.0;
		delta = 0.001;
	}

	/**
	 * \brief Test the add()-method by setting x and y
	 *
	 * Should return true when value equals to 3.0
	 */
	@Test
	void testAdd() {               
        lengths.set(x);
        lengths.add(y);
		assertEquals(correctSum, lengths.get(), delta);
	}

	/**
	 * \brief Test the subtract()-method by setting z and x
	 *
	 * Should return true when value equals to 4.0
	 */
	@Test
	void testSubtract() {               
        lengths.set(z);
        lengths.subtract(x);
		assertEquals(correctDifference, lengths.get(), delta);
	}
}
