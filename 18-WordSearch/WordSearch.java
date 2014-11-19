// creates a word search puzzle

public class WordSearch {

    private char[][] board;

    public WordSearch(int r, int c) {
	board = new char[r][c];
	for (int i=0;i<board.length;i=i+1) {
	    for (int j=0;j<board[i].length;j=j+1) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	WordSearch(30,20);
    }

    public String toString() {
	String s = "";
	for (int i=0;i<board.length;i=i+1) {
	    for (int j=0;j<board[i].length;j=j+1) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

}
