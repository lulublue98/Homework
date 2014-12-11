import java.util.Random;

public class Interval {

    private int low;
    private int high;
    private Random rand = new Random();

    public Interval(int a, int b) {
	low = Math.min(a,b);
	high = Math.max(a,b);
    }

    public Interval() {
	int temp1 = rand.nextInt(100);
	int temp2 = rand.nextInt(100);
	while (temp1==temp2) {
	    temp2 = rand.nextInt(100);
	}
	low = Math.min(temp1,temp2);
	high = Math.max(temp1,temp2);
    }

    public String toString() {
	String end = "[" + low + "," + high + "]";
	return end;
    }
    
    public int getLow() {
	return low;
    }

    public int getHigh() {
	return high;
    }

    public int compareTo(Interval other) {
	int thisint = getHigh() - getLow();
	int otherint = other.getHigh() - other.getLow();
        return thisint - otherint;
    }

}
