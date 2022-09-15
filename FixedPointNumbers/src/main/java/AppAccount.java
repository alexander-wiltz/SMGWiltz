import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppAccount {

    /***
     *
     * @author Alexander Wiltz
     * @date 2022-09-08
     *
     * \example Two examples to calculate with a scaling of 100 and a displacement of 0
     */

    private static final Logger logger = LoggerFactory.getLogger(AppAccount.class);

    public static void main(String[] args) {

        System.out.println("Geldbeträge");
        logger.info("Started 'Geldbeträge'", AppAccount.class.getSimpleName());

        int s = 100;
        int v = 0;
        money = new Account(s,v);

        double x = 2.0;
        money.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());
        logger.info("Value as number: " + money.getValue(), AppAccount.class.getSimpleName());

        double y = 3.0;
        money.multiply(y);

        System.out.println("Das Ergebnis der Multiplikation von " + x + " und " + y);
        logger.info("Multiply " + x + " and " + y, AppAccount.class.getSimpleName());
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());
        logger.info("Value as number: " + money.getValue(), AppAccount.class.getSimpleName());

        System.out.println("*********");

        x = 1.0;
        money.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());
        logger.info("Value as number: " + money.getValue(), AppAccount.class.getSimpleName());

        y = 2.0;
        money.multiply(y);

        System.out.println("Das Ergebnis der Multiplikation von " + x + " und " + y);
        logger.info("Multiply " + x + " und " + y, AppAccount.class.getSimpleName());
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());
        logger.info("Value as number: " + money.getValue(), AppAccount.class.getSimpleName());

    }

    private static Account money;

    /***
     * \brief   Print-Method with a format of two digits after the point
     *          Added logging option for the used number, level: DEBUG
     */
    private static void print() {
        System.out.format("%.2f%n", money.get());
        logger.debug(String.format("Value is " + money.get(), "%.2f%n"));
        logger.debug("Get the value by calculating " + money.getValue() + " + " + money.getDisplacement() + " / " + money.getScalingFactor(), FixedPointNumber.class.getSimpleName());
    }
}
