public class Driver2 {
    public static void main(String[] args) {
	Greeter2 g1 = new Greeter2();
	Greeter2 g2 = new Greeter2();

	// "get" and "set are accessor methods
	// because instance variables should be private, we need to do this:
        
    Greeter2 n1 = new Greeter2();
    String n = n1.greetPerson("Lulu");
    System.out.println(n);
    String m = n1.loudGreet();
    System.out.println(m);
    Greeter2 n2 = new Greeter2("Hello there");
    String s = n2.greetPerson("Lulu");
    System.out.println(s);
    String f = n2.loudGreet();
    System.out.println(f);

    }

}
