import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixedPointNumber {

	private static final Logger logger = LoggerFactory.getLogger(Account.class);

	/***
	 *
	 *  \brief  The FixedPointNumber-class
	 *          Examples are in the App-class.
	 *
	 */

	 public FixedPointNumber() {
		 this.scaling = 0;
		 this.displacement = 0;
		 this.set(1.0);

		 logger.debug("Called standard-constructor: Scale is set to 0 and displacement is set to 0");
	 }

	/***
	 * \brief  Constructor with a dynamic set()-implementation
	 *
	 * @param s scaling
	 * @param v displacement
	 * @param x number to calculate with
	 */
	 public FixedPointNumber(int s, int v, double x) {
		 this.scaling = s;
		 this.displacement = v;
		 this.set(x);

		 logger.debug("Scale is set to " + s + " and displacement is set to " + v);
	 }
	 
	 public FixedPointNumber(int s, int v) {
		 this.scaling = s;
		 this.displacement = v;
		 this.set(1.0);

		 logger.debug("Scale is set to " + s + " and displacement is set to " + v);
	 }

	/***
	 * \brief addition-method
	 *        add two fixed point numbers
	 *
	 */
	public void add(double x) {
		logger.info("Calling 'add-method'", FixedPointNumber.class.getSimpleName());
		FixedPointNumber summand = new FixedPointNumber(this.scaling, this.displacement, x);

		logger.debug("Calculate " + this.value + " + " + (double) summand.getValue() + " + " + this.scaling, FixedPointNumber.class.getSimpleName());
		this.value += summand.getValue() + this.displacement;
		logger.info("Returned value is: " + this.value, FixedPointNumber.class.getSimpleName());
	 }

	/***
	 * \brief subtract-method
	 *        subtract two fixed point numbers
	 *
	 */
	 public void subtract(double x) {
		 logger.info("Calling 'subtract-method'", FixedPointNumber.class.getSimpleName());
		 FixedPointNumber summand = new FixedPointNumber(this.scaling, this.displacement, x);

		 logger.debug("Calculate " + this.value + " - " + (double) summand.getValue() + " + " + this.scaling, FixedPointNumber.class.getSimpleName());
		 this.value -= (summand.getValue() + this.displacement);
		 logger.info("Returned value is: " + this.value, FixedPointNumber.class.getSimpleName());
	 }

	/***
	 * \brief 	sets the value by calculating the value with
	 * 			n = ( s * x ) - v
	 *
	 */
	 public void set(double x) {
		 this.value = (int) ((scaling * x) - displacement);
		 logger.debug(this.value + " = (" + scaling + " * " + x + ") - " + displacement + " and prepare for next function", FixedPointNumber.class.getSimpleName());
	 }
	 
	 public double get() {
		 return (this.value + displacement)/(double)scaling;
	 }

	 public int getValue() {
		 return this.value;
	 }

	 public int getDisplacement() {
		 return this.displacement;
	 }

	 public int getScalingFactor() {
		 return this.scaling;
	 }
	 
     protected int scaling;

	 protected int displacement;
		 
	 protected int value;
}
