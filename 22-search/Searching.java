import java.util.*;
import java.io.*;

public class Searching {

    private Comparable[] Dictionary;
    private static int len;

    public Searching(int length) {
	Dictionary = new Comparable[length];
	len = length;
    }

    public Searching() {
	Dictionary = new Comparable[10];
	len = 10;
    }

    public String toString(){
	String end = "";
	for (int i=0;i<len;i++) {
	    end = end + Dictionary[i] + " , ";
	}
	return end;
    }

    public void add(Comparable thing) {
	int index = 0;
	int x = 0;
	while (Dictionary[x]!=null) {
	    index = index + 1;
	    x++;
	}
	Dictionary[index] = thing;
    }

    public void sort() {
	Arrays.sort(Dictionary);
    }
    
    public Comparable lsearch(Comparable thing) {
	for (int x=0;x<len;x++) {
	    if (Dictionary[x]==thing) {
		return Dictionary[x];
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable thing) {
	int index = len / 2;
	Comparable temp = Dictionary[index];
	while (thing.compareTo(temp)!=0) {
	    if (thing.compareTo(temp)==1) {
		index = index + (index/2);
	    } else if (thing.compareTo(temp)==-1) {
		index = index - (index/2);
	    }
	    temp = Dictionary[index];
	}
	return temp;
    }
}
