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

}
