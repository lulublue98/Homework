import java.util.*;
import java.io.*;

public class RandomList {

    public String type;
    public int size;
    public ArrayList<Integer> list = new ArrayList<Integer>(size);
    public int[] array = new int[size];
    Random r = new Random();

    public RandomList(String t, int s) {
	type = t;
	size = s;
	for (int i=0;i<size;i=i+1) {
	    list.add(i);
	}
	for (int i=0;i<size;i=i+1) {
	    array[i] = i;
	}
    }

    public void randomize() {
	if ( type == "list" ) {
	    ArrayList<Integer> list2 = new ArrayList<Integer>(size);
	    for (int x=0;x<size;x=x+1) {
		int y = list.get(r.nextInt(list.size()));
		if ( list2.indexOf(y) == -1) {
		    list2.add(x,y);
		    list.remove((list.indexOf(y)));
		}
	    }
	    list = list2;
	}
	if ( type == "array" ) {
	    int temp;
	    for (int x=0;x<size;x=x+1) {
		int y = r.nextInt(size);
		temp = array[y];
		array[y] = array[x];
		array[x] = temp;
	    }
	}            
    }

}
