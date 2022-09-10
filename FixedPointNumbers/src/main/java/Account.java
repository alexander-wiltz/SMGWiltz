public class Account extends FixedPointNumber {

    public Account(int s, int v) {
        super(s,v);
    }

    public void multiply(double x) {
        FixedPointNumber factor = new FixedPointNumber(this.scaling, this.displacement, x);
        this.value *= ((double) factor.getValue() / this.scaling);
    }

}
