public class SuperArray {

    private String[] data;
    private int nextBlank;
    private int endpt;

    public SuperArray( int i ) {
	data = new String[i];
	nextBlank = 0;
	endpt = i;
    }

    public String toString() {
	String s="";
	for (int i=0;i<data.length;i++){
	    s=s+data[i]+", ";
	}
	return s;
    }

    public String get( int index ) {
	return data[index];
    }

 
    public void add( String i ) {
	grow();
	set( nextBlank, i );
	if ( nextBlank == endpt ) {
	    endpt = endpt + 1;
	}
	nextBlank = nextBlank + 1;
    }

    public int size() {
	return data.length;
    }

    public void set( int index, String i ) {
       	data[index] = i;
    }

    public void grow() {
	if ( endpt > data.length ) {
	    String[] end = new String[data.length + (data.length/2)];
	    for (int i=0;i<data.length;i=i+1) {
		end[i] = data[i];
	    }
	    data = end;
	}
    }

    public boolean check(String a, String b) {
	int x = 0;
	while (x<a.length()) {
	    char a1 = a.charAt(x);
	    char b1 = b.charAt(x);
	    if (a1>b1) {
		return true;
	    } else if (b1>a1) {
		return false;
	    } else if (a1==b1) {
		if (x==a.length()-1) {
		    return false;
		}
		x=x+1;
	    }
	}
	return false;
    }

    public void shift(int index) {
	
    }

    /*
    public void isort() {
	for (int x=0;x<data.length;x=x+1) {
	    String newvalue = data[x];
	    int i;
	    int last = data.length -1;
	    for (i=last;i>0 && check(newvalue,data[i-1])==false;i=i-1) {
		data[i] = data[i-1];    
	    }
	}
    }
    */

    public void isort() {
	for (int x=0;x<data.length;x=x+1) {
	    int index = 0; 
	    String temp = data[x];
	    int y = 0;
	    while (check(temp,data[y])==true) {
		index = index + 1;
		y = y + 1;
	    }
	    shift(index);
	    data[index] = temp;
	}
    }

}
