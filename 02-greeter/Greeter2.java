import java.io.*;
import java.util.*;

public class Greeter2 {
    private String greeting = new String("Hello World!");
    public void setGreeting(String s ) {
	greeting = s;
    }

    // constructors

    /* -the name is the same as the class name
       -there is no return type
       -its ALWAYS public
    */

    public Greeter(String g) {
	greeting = g;
    }

    public Greeter() {
	greeting = "Hello";

    }

    public String getGreeting() {
	return greeting;
    }

    public void greet() {
	//String greeting = new String("Sup!");
	System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println("I'm out");
    }

}
