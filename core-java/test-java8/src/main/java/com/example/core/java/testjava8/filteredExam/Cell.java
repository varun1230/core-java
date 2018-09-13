package com.example.core.java.testjava8.filteredExam;

public class Cell {
	
	 GamePlayer playerInfo;
	
	 int row;
	
	 int col;
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		clear();
	}
	
	public void clear() {
		playerInfo = GamePlayer.EMPTY;
	}
	
	public void paint() {
		switch(playerInfo) {
		case EMPTY : System.out.print(" ");break;
		case PLAYER1 : System.out.print("1"); break;
		case PLAYER2: System.out.print("2"); break;
	 }
}
	
}
