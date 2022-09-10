public class FixedPointNumber {

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
	 }
	 
	 public FixedPointNumber(int s, int v) {
		 this.scaling = s;
		 this.displacement = v;
		 this.set(1.0);
	 }

	/***
	 * \brief addition-method
	 *        add two fixed point numbers
	 *
	 */
	public void add(double x) {
		 FixedPointNumber summand = new FixedPointNumber(this.scaling,
				 this.displacement,
				 x);
		 this.value += summand.getValue() + this.displacement;
	 }

	/***
	 * \brief subtract-method
	 *        subtract two fixed point numbers
	 *
	 */
	 public void subtract(double x) {
		 FixedPointNumber summand = new FixedPointNumber(this.scaling,
				 this.displacement,
				 x);
		 this.value -= (summand.getValue() + this.displacement);
	 }

	/***
	 * \brief 	sets the value by calculating the value with
	 * 			n = ( s * x ) - v
	 *
	 */
	 public void set(double x) {
		 this.value = (int) ((scaling * x) - displacement);
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
