public Class loops {

    // 15 min
    public String frontTimes(String str, int n) {
	String x = new String;
	if (str.length() <= 3 ) {
	    x = str;
	} else {
	    x = str.substring(0,2);
	}
	int z = 0;
	String wah = new String;
	while (z < n) {
	    wah = wah + x;
	    z = z + 1;
	}
	return wah;
    }

    // 8 min
    public String stringBits(String str) {
	int x = 2;
	int y = str.length();
	String end = str.substring(0,1);
	while ( x < y ) {
	    end = end + str.substring(x,(x+1));
	    x = x + 2;
	}
	return end;
}

    // 20 min
    public String stringYak(String str) {
	String u = "";
	int x = 0;
	int y = str.length();
	while ( x < y ) {
	    if (str.substring(x,(x + 1)) == "y") and str.substring((x+2),(x+3)) == "k") {
	    u = str.substring(0,(x - 1)) + str.substring(x+3);
	}
	x = x + 1;
    }
    return u;
}

public int stringMatch(String a, String b) {
    int i = 0;
    int x = 0;
    while ( x < a.length() - 2 ) {
      if ( a.substring(x,(x + 2)) == b.substring(x,(x + 2)) ) {
	  i = i + 1;
      }
      x = x + 1;
    }
    return i;
}

}
