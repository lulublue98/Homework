import java.util.*;

public class Test {

    public static void main(String[] args) {
	
	Warrior[] Warriors = new Warrior[10];
	for (int x=0;x<Warriors.length;x++) {
	    String name = ""+x;
	    int y = x*10;
	    Warriors[x] = new Warrior(name, y);
	}
	Arrays.sort(Warriors);
	System.out.println(Warriors);

    }

}
