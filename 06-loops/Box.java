public class Box {
    public String box( int r, int c) {
	int x = 0;
	String f = new String();
	while ( x < c ) {
	    f = f + "*";
	    x = x + 1;
	}
	int y = 0;
	String g = new String();
	while ( y < r ) {
	    g = g + f + "\n";
	    y = y + 1;
	}
	return g;
    }

}
