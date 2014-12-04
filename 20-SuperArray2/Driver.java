public class Driver {

    public static void main(String[] args) {
	OrderedSuperArray A = new OrderedSuperArray(5);
	int a = A.size();
	System.out.println(a);
	A.add("ant");
	A.add("elf");
	A.add("cat");
	A.add("pig");
	A.add("dog");
	System.out.println(A);
	
    }

}
