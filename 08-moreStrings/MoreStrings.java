public class MoreStrings {

    public String stringSplosion(String str) {
	int x;
	int y = str.length();
	String end = "";
	for (x=0;x<=y;x=x+1) {
	    end = end + str.substring(0,x);
	}
	return end;
    }

    public String stringX(String str) {
	int x = 1;
	int y = str.length();
	String end = "";
	if ( str.length() > 0 ) {
	    end = end + str.substring(0,1);
	}
	while ( x < y-1 ) {
	    int z = x;
	    String a = str.substring(z,z+1);
	    if ( a != "x" ) {
		end = end + " * ";
	    }
	    x = x + 1;
	}
	if ( str.length() > 1 ) {
	    end = end + str.substring(y-1,y);
	}
	return end;
    }

}
