public class PuzzleDriver {

    public static void main(String[] args) {
<<<<<<< Updated upstream:18-WordSearchExtra/PuzzleDriver.java
	WordSearch W = new WordSearch(30,50,"FemaleSupers.txt",24);
	W.MakePuzzle();
	System.out.println(W.PrintPuzzle());
=======
	WordSearch W = new WordSearch(30,50,"LameVillains.txt",24);
	W.ReadFile();
	W.wordAdder();
	System.out.println(W);
	//System.out.println(W.PrintPuzzle());
>>>>>>> Stashed changes:18-WordSearch/PuzzleDriver.java~

    }

}
