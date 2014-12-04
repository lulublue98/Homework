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
	if ( endpt >= data.length ) {
	    String[] end = new String[data.length + (data.length/2)];
	    for (int i=0;i<data.length;i=i+1) {
		end[i] = data[i];
	    }
	    data = end;
	}
    }

    public void isort() {
	for (int x=0;x<data.length;x=x+1) {
	    int i;
	    for (i=last;i>0 && newvalue<a[i-1];i=i-1) {
		a[i] = a[i-1];    
	    }
	    a[i]=newvalue;
	}
    }

}
