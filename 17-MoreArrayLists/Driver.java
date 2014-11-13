import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {

	ArrayList<Integer> list = new ArrayList<Integer>(10);
	for (int i=0;i<10;i=i+1) {
	    list.add(i);
	}
	System.out.println(list);
	Random r = new Random();
        ArrayList<Integer> list2 = new ArrayList<Integer>(10);
	for (int x=0;x<10;x=x+1) {
	    list2.set(x,list.get(r.nextInt(11)));
	    list.remove(list.get(r.nextInt(11)));
	}
	System.out.println(list2);

    }
}
