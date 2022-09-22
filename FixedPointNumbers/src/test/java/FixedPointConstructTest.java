import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FixedPointConstructTest {
	/**
	 * \author Prof. Dr. Manfred Brill
	 *
	 * \brief Testcases for the constructors
	 */

	private static int s, v, correctInt;
	private static double delta;
	private static double x, correctValue, correctDefault;


	/**
	 * \brief Setup
	 * \param s = 200
	 * \param v = 200
	 *
	 * \param x = 1.0
	 * \param correctValue = 1.0
	 * \param correctDefault = 1.0
	 * \param correctInt = 0
	 *
	 * \param delta = 0.001
	 *
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		s = 200;
	    v = 200;

        x = 1.0;
	    correctValue = 1.0;
	    correctDefault = 1.0;
	    correctInt = 0;

		delta = 0.001;
	}

	/**
	 * \brief Test the constructor with all possible values
	 *
	 * Should return true when value equals to 1.0
	 */
	@Test
	void testConstructorAll() { 
		
		FixedPointNumber lengths = new FixedPointNumber(s, v, x);
		assertEquals(correctValue, lengths.get(), delta);
	}

	/**
	 * \brief Test the constructor with just s and v as possible values
	 *
	 * Should return true when value equals to 1.0
	 */
	@Test
	void testConstructorsv() { 
		
		FixedPointNumber lengths = new FixedPointNumber(s, v);
		assertEquals(correctDefault, lengths.get(), delta);
	}

	/**
	 * \brief Test the constructor to get the value
	 *
	 * Should return true when value equals to 0
	 */
	@Test
	void testConstructorsvInt() { 
		
		FixedPointNumber lengths = new FixedPointNumber(s, v);
		assertEquals(correctInt, lengths.getValue());
	}
	
}
