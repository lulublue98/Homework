import java.io.*;
import java.util.*;

public class DriverL {
    public static void main( String[] args ) {

	ArrayList<Integer> ai;
	ai=new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++) {
	    ai.add(r.nextInt(5));
	}
	System.out.println(ai);

    }
}
