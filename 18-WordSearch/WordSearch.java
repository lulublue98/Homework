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
	this(20,30);
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

    public void addWordH(String w, int row, int col) {
	int r = row;
	int c = col;	
	for(int i=0;i<w.length();i=i+1) {
	    board[r][c] = w.charAt(i);
	    c = c + 1;
	}
    }
    public void addWordV(String w, int row, int col) {
	int r = row;
	int c = col;	
	for(int i=0;i<w.length();i=i+1) {
	    board[r][c] = w.charAt(i);
	    r = r + 1;
	}
    }
    public void addWordSE(String w, int row, int col) {
	int r = row;
	int c = col;
	for(int i=0;i<w.length();i=i+1) {
	    board[r][c] = w.charAt(i);
	    c = c + 1;
	    r = r + 1;
	}
    }
    public void addWordNW(String w, int row, int col) {
	int r = row;
	int c = col;
	for(int i=0;i<w.length();i=i+1) {
	    board[r][c] = w.charAt(i);
	    c = c - 1;
	    r = r - 1;
	}
    }
    public void addWordNE(String w, int row, int col) {
	int r = row;
	int c = col;
	for(int i=0;i<w.length();i=i+1) {
	    board[r][c] = w.charAt(i);
	    c = c + 1;
	    r = r - 1;
	}
    }
    public void addWordSW(String w, int row, int col) {
	int r = row;
	int c = col;
	for(int i=0;i<w.length();i=i+1) {
	    board[r][c] = w.charAt(i);
	    c = c - 1;
	    r = r + 1;
	}
    }

    public static void main(String[] args) {
	WordSearch W = new WordSearch();
	W.addWordH("hello",8,8);
	W.addWordV("there",10,9);
	W.addWordSE("boo",1,1);
	W.addWordNE("cat",13,14);
	W.addWordSW("dog",11,4);
	W.addWordNW("bug",19,10);
	System.out.println(W);
    }

}
