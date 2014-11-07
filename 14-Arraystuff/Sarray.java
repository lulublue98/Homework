public class Sarray {

    private int[] data;
    private int nextBlank;

    public Sarray( int i ) {
	data = int[i];
	nextBlack = 0;
    }

    public void add( int i ) {
	while (data[nextBlank] != 0) {
	    nextBlank = nextBlank + 1;
	}
	data[nextBlank] = i;
	nextBlank = nextBlank + 1;
    }

    public void add( int index, int i ) {
	for (int x=data.length-1;x>index;x=x-1) {
	    data[x] = data[x-1];
	}
	data[index] = i;
    }

    public int get( int index ) {
	return data[index];
    }

    public int size() {
	return data.length + 1;
    }

    public void set( int index, int i ) {
	data[index] = i;
    }

}
