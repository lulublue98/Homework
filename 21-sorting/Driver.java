public class Driver {
    
    public static void main(String[] args) {
	Interval x = new Interval(4,5);
	Interval y = new Interval(6,9);
	System.out.println(x.compareTo(y));
	InterArray Intervals = new InterArray(10);
	System.out.println(Intervals);
	Intervals.sort();
	System.out.println(Intervals);
	
    }

}
