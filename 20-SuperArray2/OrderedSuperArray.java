public class OrderedSuperArray extends SuperArray {

    private String[] data;
    private String[] last;
    private int nextBlank;
    private int endpt;

    public OrderedSuperArray( int i ) {
	super(i);
    }    
    
    public String toString() {
	String s="";
	for (int i=0;i<last.length;i++){
	    s=s+last[i]+", ";
	}
	return s;
    }
    
    public void add( String i ) {
	grow();
	set( nextBlank, i );
	if ( nextBlank == endpt ) {
	    endpt = endpt + 1;
	}
	nextBlank = nextBlank + 1;
    }
    
    public boolean check(String a, String b) {
	int x = 0;
	while (x<a.length) {
	    char a1 = a.charAt(x);
	    char b1 = b.charAt(x);
	    if (a1>b1) {
		return true;
	    } else if (b1>a1) {
		return false;
	    } else if (a1==b1) {
		if (x==a.length-1) {
		    return false;
		}
		x=x+1;
	    }
	}
    }

    public void shift(int index) {
	grow();
	for (int x=last.length;x>=index;x=x-1) {
	    String temp = last[x];
	    last[x+1] = last[x];
	}
    }

    public void order() {
	for (int x=0;x<data.length;x=x+1) {
	    index
	    String temp = data[x];
	    while (check(temp,data[x+1])==true) {
		
	    }
	}
    }
    
}
