public class Driver {
    public String nonStart(String a, String b) {
	String a2 = new String();
	a2 = a.substring(1);
	String b2 = new String();
	b2 = b.substring(1);
	String c = new String();
	c = a2 + b2;
	return c;
    }
    public String makeAbba(String a, String b) {
	String s = new String();
	s = a + b + b + a;
	return s;
    }
    public int diff21(int n) {
	int x = 0;
	if ( n > 21 ) {
	    int a = n - 21;
	    x = a + a;
	} else if ( n < 21 ) {
	    x = 21 - n;
	}
	return x;
    }
}
