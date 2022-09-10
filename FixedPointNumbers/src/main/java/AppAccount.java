public class AppAccount {

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

    private static void print() {
        System.out.format("%.2f%n", money.get());
    }
}
