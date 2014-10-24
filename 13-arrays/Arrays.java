public class Arrays {
    public int[] frontPiece(int[] nums) {
  int[] x = new int[2];
  if ( nums.length < 2 ) {
  x = nums;
  } else {
  x[0] = nums[0];
  x[1] = nums[1];
  }
  return x;
}
    public int sum13(int[] nums) {
	if ( nums.length == 0 ) {
	    return 0;
	} else {
	    int y;
	    int x;
	    for (y=0;y<nums.length;y=y+1) {
		if ( nums[y] == 13 ) {
		} else if ( nums[y-1] == 13 ) {
		} else {
		    x = x = nums[y];
		}
	    }
	    return x;
	}
    }
}
