public class PuzzleDriver {

    public static void main(String[] args) {
	WordSearch W = new WordSearch(30,50,"LameVillains.txt",24);
	W.MakePuzzle();
	System.out.println(W.PrintPuzzle());

    }

}
