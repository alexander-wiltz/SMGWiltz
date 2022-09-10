public class App {

	public static void main(String[] args) {

        /***
         *
         * \example Examples to calculate with a scaling of 200 and a displacement of 200
         */

        System.out.println("Messwerte");
        
		int s = 200;
        int v = 200;
        lengths = new FixedPointNumber(s, v);
        
        double x = 1.0;
        lengths.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
        
        double y = 1.5;
        lengths.add(y);
        
        System.out.println("Das Ergebnis der Addition von " + x + " und " + y);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
             
        System.out.println("Das Ergebnis der Subtaktion von " + y);
        lengths.subtract(y);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());
        
        x = 2.25;
        lengths.set(x);
        print();
        System.out.println("Die ganze Zahl dazu: " + lengths.getValue());          
	}

    /***
     * \brief Print-Method with a format of three digits after the point
     */
	 private static void print() {
		 System.out.format("%.3f%n", lengths.get());
	 }
	 
	 private static FixedPointNumber lengths;
}
