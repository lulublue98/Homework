import java.io.*;
import java.util.*;

public class Driver {
    public static void main( String[] args ) {

	ArrayList<Integer> list;
	list = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<20;i=i+1 ) {
	    list.add(r.nextInt(8));
	}
	System.out.println(list);
	int n = 0;
	int size = 20;
	while (n<=size) {
	    if ( list.get(n) == list.get(n-1) ) {
		list.remove(n);
		size = size - 1;
	    } else {
		n = n + 1;
	    }
	}
	System.out.println(list);

    }
}
