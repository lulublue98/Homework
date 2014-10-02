public class Shapes {
    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    public String triangle1( int h ) {
	int x = 1;
	String end = "";
	while ( x <= h ) {
	    int y = 0;
	    while ( y < x ) {
		end = end + "*";
		y = y + 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	}
	return end;
    }
    
    public String triangle2(int h) {
	int x = 0;
	String end = "";
	while ( x <= h ) {
	    int y = 0;
	    while ( y < h-1) {
		end = end + " ";
		y = y + 1;
	    }
	    int y = 0;
	    while (y < x){
		end = end + "*";
		y = y + 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	}
	return end;
    }
}
