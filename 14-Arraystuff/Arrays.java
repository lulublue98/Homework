import java.util.*;

public class Arrays {

    private int[] a;
    private Random rnd;
    private int maximum;
    public final int final_example = 123;

    public Arrays(int n, int x, int y){
	maximum = y;
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = x+rnd.nextInt(y);
	}
    }

    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n) {
	for (int x=0;x<a.length;x=x+1) {
	    if (n == a[x]) {
		return x;
	    }
	}
	return -1;
    }

    public int findit(int[] f, int n) {
	for (int x=0;x<f.length;x=x+1) {
	    if (n == f[x]) {
		return x;
	    }
	}
	return -1;
    }

    public int maxVal() {
	int y = 0;
	for (int x=0;x<a.length;x=x+1) {
	    if ( y < a[x] ) {
		y = a[x];
	    }
	}
	return y;
    }

    public int max(int[] g) {
	int y = 0;
	for (int x=0;x<g.length;x=x+1) {
	    if ( y < g[x] ) {
		y = g[x];
	    }
	}
	return y;
    }

    public int minVal() {
	int y = maxVal();
	for (int x=0;x<a.length;x=x+1) {
	    if ( y > a[x] ) {
		y = a[x];
	    }
	}
	return y;
    }

    public int freq( int i ) {
	int count = 0;
	for (int x = 0;x<a.length;x=x+1) {
	    if ( a[x] == a[i] ) {
		count = count + 1;
	    }
	}
	return count;
    }

    public String freqString( int i ) {
	int count = 0;
	for (int x = 0;x<a.length;x=x+1) {
	    if ( a[x] == a[i] ) {
		count = count + 1;
	    }
	}
	String string = a[i] + " occurs " + count + " times";
	return string;
    }

    public int mode() {
	int most = 0;
	int num = 0;
	for (int i=0;i<a.length;i=i+1) {
	    if (freq(a[i])>num) {
		most = a[i];
		num = freq(a[i]);
	    }
	}
	return most;
    }

    private int[] tot;

    public int mode2() {
	tot = new int[maximum+1];
	for (int i=0;i<a.length;i=i+1) {
	    int b = a[i];
	    tot[b] = tot[b] + 1;
	}
	int c = (max(tot));
	int end = findit(tot, c);
	return end;
    }

}
