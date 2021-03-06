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
       for (int i=0;i<Intervals.length-1;i=i+1) {
            int index = i;
            for (int j=i+1;j<Intervals.length;j=j+1)
                if (Intervals[index].compareTo(Intervals[j])>0) {
                    Interval temp = Intervals[index];
		    Intervals[index] = Intervals[j];
		    Intervals[j] = temp;
		}
	}
    }

}
