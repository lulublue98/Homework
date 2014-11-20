public class PuzzleDriver {

    public static void main(String[] args) {
	WordSearch W = new WordSearch();
	W.addWordVdw("OPAL",8,12);
	W.addWordHlf("HELLO",8,8);
	W.addWordHrt("GREAT",7,7);
	W.addWordVdw("THERE",10,9);
	W.addWordVup("HAT",6,19);
	W.addWordSE("BOO",1,1);
	W.addWordNE("CAT",13,14);
	W.addWordSW("DOG",11,4);
	W.addWordNW("BUG",19,10);
	System.out.println(W);

    }

}
