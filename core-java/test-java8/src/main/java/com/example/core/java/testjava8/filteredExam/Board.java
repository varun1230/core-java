package com.example.core.java.testjava8.filteredExam;

public class Board {

	Cell[][] cells ;
	public static final int ROWS = 3;
	public final static int COLS = 3;
	
	int currentRow, currentCol;
	
	public Board() {
		cells = new Cell[ROWS][COLS];
		for(int row =0 ; row < ROWS; row++) {
			for(int col = 0; col < COLS; col++) {
				cells[row][col] = new Cell(row, col);
			}
		}
	}
	
	public boolean isDraw() {
		for(int row = 0; row < ROWS; row++ ){
			for(int col = 0; col < COLS; col++) {
				if(cells[row][col].playerInfo == GamePlayer.EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public boolean hasWon(GamePlayer player) {
		return (cells[currentRow][0].playerInfo == player && cells[currentRow][1].playerInfo == player && cells[currentRow][2].playerInfo == player 
			|| cells[0][currentCol].playerInfo == player && cells[1][currentCol].playerInfo == player && cells[2][currentCol].playerInfo == player 
			|| cells[0][0].playerInfo == player && cells[1][1].playerInfo == player && cells[2][2].playerInfo == player
			|| cells[0][2].playerInfo == player && cells[1][1].playerInfo == player && cells[2][0].playerInfo == player);
	}

	public void paint() {
		for(int row =0; row < ROWS; row++) {
			for (int col = 0 ; col<COLS; col++) {
				cells[row][col].paint(); 
				if(col < COLS -1) System.out.print("|");
			}
			System.out.println("");
			if(row < ROWS -1 ) System.out.println("--------");
		}
		
	}
	
}
