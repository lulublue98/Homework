public class Driver {

    public static void main(String[] args) {
	SuperArray A = new SuperArray(1000);
	A.fill();
	A.backup();
	System.out.println(A);
	A.bsort();
	System.out.println(A);
	A.restore();
	A.ssort();
	System.out.println(A);
	A.restore();
	A.isort();
	System.out.println(A);
    }

}
