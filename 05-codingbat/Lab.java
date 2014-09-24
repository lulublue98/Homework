public class Lab {
    public int diff21(int n) {
	int x = 0;
	if ( n > 21 ) {
	    int a = n - 21;
	    x = a + a;
	} else if ( n < 21 ) {
	    x = 21 - n;
	}
	return x;
    }

    //working
public boolean nearHundred(int n) {
  int x = 100 - n;
  if (Math.abs(x) < 11) {
      return true;
  } else if (Math.abs(200-n) < 11) {
      return true;
  } else {
  return false;
  }
}
}
