public class Sarray {

    private int[] data;
    private int nextBlank;

    public Sarray() {
	data = int[100];
	nextBlack = 0;
    }

    public void add( int i ) {
	data[nextBlank] = i;
	nextBlank = nextBlank + 1;
    }

    public void add( int index, int i ) {
	
    }

    public int get( int index ) {
	return data[index];
    }

    public int size() {
	return data.length + 1;
    }

    public void set( int index, int 

}
