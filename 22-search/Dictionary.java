public class Dictionary {

    private Comparable[] Dictionary;
    private int len;

    public Dictionary(int length) {
	Dictionary = new Comparable[length];
	len = length - 1;
    }

    public void add(object thing) {
	int index = 0;
	for (int x=0;Dictionary[x]==null;x=x+1) {
	    index = index + 1;
	}
	Dictionary[index] = thing;
    }

    public Comparable search() {

    }

}
