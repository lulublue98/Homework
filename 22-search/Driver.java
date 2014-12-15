public class Driver {

    public static void main(String[] args) {
	Searching A = new Searching(10);
	System.out.println(A);
	for (int x=0;x<10;x++) {
	  A.add(""+x);
	}
	System.out.println(A); 
    }

}
