public class Driver {
    
    public static void main(String[] args) {
	Interval x = new Interval();
	Interval y = new Interval();
	System.out.println(x);
	System.out.println(y);
	System.out.println(x.compareTo(y));
	InterArray Intervals = new InterArray(10);
	System.out.println(Intervals);
	Intervals.sort();
	System.out.println(Intervals);
	
    }

}
