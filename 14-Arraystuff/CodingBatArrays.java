public class CodingBatArrays {

    // I worked with Katie Hlynsky

    //sum67
    public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 6) {
		sum += nums[i];
	    }
	    else {
		while (nums[i] != 7) {
		    i= i + 1;
		}
	    }
	}
	return sum;
    }

    //more14
    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		ones= ones + 1;
	    }
	    if (nums[i] == 4) {
		fours= fours + 1;
	    }
	}
	return ones > fours;
    }

    //tenRun
    public int[] tenRun(int[] nums) {
	boolean replace = false;
	int multiple = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 10 == 0) {
		if (!replace) {
		    replace = true;
		    multiple = nums[i];
		} else
		    multiple = nums[i];
	    }
	    if (nums[i] % 10 != 0 && replace) nums[i] = multiple;
	}
	return nums;
    }

    //tripleUp
    public boolean tripleUp(int[] nums) {
	for (int i = 0; i <= nums.length - 3; i++)
	    if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
		return true;
	return false;
    }

    //canBalance
    public boolean canBalance(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
	    int sum = 0;
	    for (int j = 0; j < i; j++) sum += nums[j];
	    for (int j = i; j < nums.length; j++) sum -= nums[j];
	    if (sum == 0) return true;
	}
	return false;
    }

    //seriesUp
    public int[] seriesUp(int n) {
	int[] result = new int[n * (n + 1) / 2];
	int pos = 0;
	int i = 1;
	while (i <= n + 1) {
	    for (int j = 1; j < i; j++) result[pos++] = j;
	    i = i + 1;
	}
	return result;
    }
}
