public class Driver {
    public static void main(String[] args) {

	RandomList list = new RandomList("list", 10);
	System.out.println(list);
	list.randomize();
	System.out.println(list);
	RandomList array = new RandomList("array", 10);
	System.out.println(array);
	array.randomize();
	System.out.println(array);
	
    }
}
