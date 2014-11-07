public class Driver {
    public static void main(String[] args) {
	Arrays A1 = new Arrays(100, 1, 20);
	System.out.println(A1);
	int x = A1.find(15);
	System.out.println("15 is at index " + x);
	int max = A1.maxVal();
	System.out.println("the maximum value is " + max);
	int min = A1.minVal();
	System.out.println("the minimum value is " + min);
	String z = A1.freqString(3);
	System.out.println(z);
	int m = A1.mode2();
	System.out.println("the mode is " + m);
    }
}
