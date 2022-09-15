import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

        /**
         *
         * Examples to calculate with a scaling of 200 and a displacement of 200
         */

        System.out.println("Messwerte");
        logger.info("Started 'Messwerte'", App.class.getSimpleName());
        
		int s = 200;
        int v = 200;
        lengths = new FixedPointNumber(s, v);
        
        double x = 1.0;
        lengths.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
        logger.info("Value as number: " + lengths.getValue(), App.class.getSimpleName());
        
        double y = 1.5;
        lengths.add(y);
        
        System.out.println("Das Ergebnis der Addition von " + x + " und " + y);
        logger.info("Addition of " + x + " and " + y, AppAccount.class.getSimpleName());
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
        logger.info("Value as number: " + lengths.getValue(), App.class.getSimpleName());
             
        System.out.println("Das Ergebnis der Subtaktion von " + y);
        logger.info("Subtract " + x + " and " + y, AppAccount.class.getSimpleName());
        lengths.subtract(y);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
        logger.info("Value as number: " + lengths.getValue(), App.class.getSimpleName());
        
        x = 2.25;
        lengths.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
        logger.info("Value as number: " + lengths.getValue(), App.class.getSimpleName());
	}

    /**
     * \brief Print-Method with a format of three digits after the point
     */
	 private static void print() {
		 System.out.format("%.3f%n", lengths.get());
         logger.debug(String.format("Value is " + lengths.get(), "%.3f%n"));
         logger.debug("Get the value by calculating " + lengths.getValue() + " + " + lengths.getDisplacement() + " / " + lengths.getScalingFactor(), FixedPointNumber.class.getSimpleName());

     }
	 
	 private static FixedPointNumber lengths;
}
