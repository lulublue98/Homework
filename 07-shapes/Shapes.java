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
	    int y = h;
	    while ( y > x) {
		end = end + " ";
		y = y - 1;
	    }
	    int z = 0;
	    while (z < x){
		end = end + "*";
		z = z + 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	}
	return end;
    }

    public String triangle3(int h) {
	int x = 0;
	int y = h;
	String end = "";
	while ( x < h ) {
	    int z = 0;
	    while ( z < y ) {
		end = end + " ";
		z = z + 1;
	    }
	    int n = x * 2 + 1;
	    while ( n > 0 ) {
		end = end + "*";
		n = n - 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	    y = y - 1;
	}
	return end;
    }
    
    public String triangle3for(int h) {
	String end = "";
	int x;
	int y = h;
	for (x=0;x<h;x=x+1) {
	    int z;
	    for (z=0;z<y;z=z+1) {
		end = end + " ";
	    }
	    int n;
	    for (n=x*2+1;n>0;n=n-1) {
		end = end + "*";
	    }
	    end = end + "\n";
	    y = y - 1;
	}
	return end;
    }

    public String diamond(int h) {
        int x = 0;
	int y = ( h + 1 ) / 2;
	String end = "";
	while ( x < ( h + 1 ) / 2 ) {
	    int z = 0;
	    while ( z < y ) {
		end = end + " ";
		z = z + 1;
	    }
	    int n = x * 2 + 1;
	    while ( n > 0 ) {
		end = end + "*";
		n = n - 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	    y = y - 1;
	}
	int a = ( h - 1 ) / 2;
	int b = 0;
	while ( b < ( h - 1 ) / 2 ) {
	    int c = 0;
	    while ( c < b + 2 ) {
		end = end + " ";
		c = c + 1;
	    }
	    int m = a * 2 - 1;
	    while ( m > 0 ) {
		end = end + "*";
		m = m - 1;
	    }
	    end = end + "\n";
	    a = a - 1;
	    b = b + 1;
	}
	return end;
    }
    
    public String triangle4( int h ) {
	int x = 0;
	int y = h;
	String end = "";
	while ( x < h ) {
	    int s = h;
	    while ( s > y ) {
		end = end + " ";
		s = s - 1;
	    }
	    int n = 0;
	    while ( n < y ) {
		end = end + "*";
		n = n + 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	    y = y - 1;
	}
	return end;
    }
}
