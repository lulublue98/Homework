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
	    int y = list.get(r.nextInt(list.size()));
	    if ( list2.indexOf(y) == -1) {
		list2.add(x,y);
		list.remove((list.indexOf(y)));
	    }
	}
	System.out.println(list2);

	int[] l = new int[10];
	for (int i=0;i<10;i=i+1) {
	    l[i] = i;
	}
	System.out.println(l);

	int[] ln = new int[10];

	for (int x=0;x<10;x=x+1) {
	    int y = l[r.nextInt(l.length)];
	    if ( Arrays.asList(ln).contains(y) == true ) {
		ln[x] = y;
	        l = ArrayUtils.removeElement(l,y);
	    }
	}
	System.out.println(ln);
	
    }
}
