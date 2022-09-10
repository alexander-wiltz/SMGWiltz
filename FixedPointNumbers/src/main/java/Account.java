public class Account extends FixedPointNumber {

    /***
     *
     * @author Alexander Wiltz
     * @date 2022-09-08
     *
     * @param s Scaling
     * @param v Displacement
     *
     *          Description:
     *          Based on the FixedPointNumber-class has this class implemented a multiply-method to
     *          calculate money based on fixed point numbers.
     *          Examples are in the App-Account class.
     *
     *          Variables value, scaling and displacement extends on the FixedPointNUmber-class.
     */

    public Account(int s, int v) {
        super(s,v);
    }

    /***
     *
     *  \brief  Multiply-method
     *
     *  The FixedPointNumber object creates a value with an integrated set()-method ( n = ( s * x ) - v)
     *  The calculated value will be multiplied with the division of the value and the scaling: ( n = n * n / s )
     *
     *  \param x Number to calculate with
     */

    public void multiply(double x) {
        FixedPointNumber factor = new FixedPointNumber(this.scaling, this.displacement, x);
        this.value *= ((double) factor.getValue() / this.scaling);
    }

}
