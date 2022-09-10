public class AppAccount {

    /***
     *
     * @author Alexander Wiltz
     * @date 2022-09-08
     *
     * \example Two examples to calculate with a scaling of 100 and a displacement of 0
     */

    public static void main(String[] args) {

        System.out.println("Geldbeträge");

        int s = 100;
        int v = 0;
        money = new Account(s,v);

        double x = 2.0;
        money.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());

        double y = 3.0;
        money.multiply(y);

        System.out.println("Das Ergebnis der Multiplikation von " + x + " und " + y);
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());

        System.out.println("*********");

        x = 1.0;
        money.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());

        y = 2.0;
        money.multiply(y);

        System.out.println("Das Ergebnis der Multiplikation von " + x + " und " + y);
        print();
        System.out.println("Die ganze Zahl dazu: " + money.getValue());

    }

    private static Account money;

    /***
     * \brief Print-Method with a format of two digits after the point
     */
    private static void print() {
        System.out.format("%.2f%n", money.get());
    }
}
