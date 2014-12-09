public class SuperArray {

    private String[] data;
    private String[] copy;
    private int nextBlank;
    private int endpt;

    public SuperArray( int i ) {
	data = new String[i];
	copy = new String[i];
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

    public void backup() {
	for (int x=0;x<data.length;x=x+1) {
	    copy[x] = data[x];
	}
    }

    public void restore() {
	for (int x=0;x<copy.length;x=x+1) {
	    data[x] = copy[x];
	}
    }

    public void fill() {
	int num = 1;
	int y = 0;
	String add = "";
	for(int x=0;x<data.length;x=x+1) {
	    if (y>25) {
		y = 0;
		num = num + 1;
	    }
	    int g = 97 + y;
	    int h = 97 + y + 1;
	    char a = (char)g;
	    char b = (char)h;
	    for (int z=0;z<num;z=z+1) {
		add = add + a;
	    }
	    add = add + b;
	}
    }

    public String get( int index ) {
	return data[index];
    }

    public int size() {
	return data.length;
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

    public void isort() {
	int i,j;
	for (i=1;i<data.length;i=i+1) {
	    String temp=data[i];
	    for (j=i-1;j>=0&&check(data[j],temp)==true;j=j-1) {
		data[j+1]=data[j];
	    }
	    data[j+1]=temp;
	}
    }

    public void ssort() {
        for (int i=0;i<data.length;i=i+1) {
            int index = i;
            for (int j=i+1;j<data.length;j=j+1)
                if (check(data[index],data[j])==true) {
                    index = j;
		}
            String n = data[index];  
            data[index] = data[i];
            data[i] = n;
        }
    }

    public void bsort() {
	for (int i=0;i<data.length-1;i=i+1) {
            int index = i;
            for (int j=i+1;j<data.length;j=j+1)
                if (check(data[index],data[j])==true) {
                    String temp = data[index];
		    data[index] = data[j];
		    data[j] = temp;
		}
	}
    }

}
