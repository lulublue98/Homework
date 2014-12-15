public class Searching {

    private Comparable[] Dictionary;
    private int len;

    public Searching(int length) {
	Dictionary = new Comparable[length];
	for (int x=0;x<len;x++) {
	    Dictionary[x] = null;
	}
	len = length;
    }

    public void add(Comparable thing) {
	int index = 0;
	for (int x=0;Dictionary[x]==null;x=x+1) {
	    index = index + 1;
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
	Comparable temp;
	int index = len;
	while (thing!=temp) {
	    temp = Dictionary[len];
	    index = index / 2;
	}
	return temp;
    }
    
}
