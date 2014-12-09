public class InterArray {
    
    private Interval[] Intervals;

    public InterArray(int len) {
	Intervals = new Interval[len];
	for (int i=0;i<len;i++) {
	    Intervals[i] = new Interval();
	}
    }

    public String toString() {
	String end = "";
	for (int i=0;i<Intervals.length;i++) {
	    end = end + Intervals[i] + "  ";
	}
	return end;
    }

    public void sort() {
	
    }

}
