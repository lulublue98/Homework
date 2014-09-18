public class Driver2 {
    public static void main(String[] args) {
	Greeter2 g1 = new Greeter2();
	Greeter2 g2 = new Greeter2();
	g1.greet();
	g2.greet();

	// "get" and "set are accessor methods
	// because instance variables should be private, we need to do this:
	g1.setGreeting( new String("Sup!"));

	g1.greet();
	g2.greet();
	
	g2.setGreeting("Hello!");
	
	g1.greet();
	g2.greet();

	String s = g1.getGreeting();
	System.out.println("g1's greeting is:"+s);

    }

}
