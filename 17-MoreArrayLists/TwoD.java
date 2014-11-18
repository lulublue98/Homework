import java.io.*;
import java.util.*;

public class TwoD {

    public static void main(String[] args) {
	int[][] a;
	a = new int[5][3];
	System.out.println(a[2].length);
	System.out.println(a[2][1]);

	Random r = new Random();

	for (int i=0;i<a.length;i=i+1) {
	    System.out.println("row "+i+" has length "+a[i].length);
	    for (int j=0;j<a[i].length;j=j+1) {
		a[i][j] = r.nextInt(20);
		System.out.print(a[i][j]+",");
	    }
	    System.out.println();
	}

    }

}
