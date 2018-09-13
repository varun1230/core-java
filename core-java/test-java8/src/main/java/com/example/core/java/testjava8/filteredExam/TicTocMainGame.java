package com.example.core.java.testjava8.filteredExam;

import java.util.Scanner;

public class TicTocMainGame {

	private Board board;
	private GameState currentState;
	private GamePlayer currentPlayer;
	
	private static Scanner sc = new Scanner(System.in);
	
	public TicTocMainGame() {
		board = new Board();
		
		initGame();
		
		do {
			
		startGame(currentPlayer);
	
		board.paint();
		
		checkGame(currentPlayer);
	
		if(currentState == GameState.PLAYER1) {
			System.out.println(" Game Player 1 WON Good Bye");
		} else if(currentState == GameState.PLAYER2) {
			System.out.println(" Game Player 2 WON Good Bye");
		} else if (currentState == GameState.DRAW) {
			System.out.println(" Game Draw Good Bye");
		}
		
		currentPlayer = (currentPlayer == GamePlayer.PLAYER1) ? GamePlayer.PLAYER2 : GamePlayer.PLAYER1;

		} while(currentState == GameState.PLAYING);	
		}
		

		
	
	public void initGame() {
		currentState = GameState.PLAYING;
		currentPlayer = GamePlayer.PLAYER1;
	}
	
	
	public void startGame(GamePlayer player) {
		
		boolean validInput = false;
		
		do {
			
			if(player == GamePlayer.PLAYER1) {
				System.out.println("Game Player 1 enter your move from (Row [1-3] and (cell[1-3])");
			} else {
				System.out.println("Game Player 2 enter your move from (Row [1-3] and (cell[1-3])");
			}
			
			int row = sc.nextInt() - 1;
			
			int col = sc.nextInt() - 1;
			
			if(row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS && board.cells[row][col].playerInfo == GamePlayer.EMPTY) {
				
				board.cells[row][col].playerInfo = player;
				board.currentRow = row;
				board.currentCol = col;
				
				validInput = true;
			} else {
				System.out.println("Selection made of row "+(row+1)+" and column "+(col+1)+" is Invalid");
			}
			
		} while(!validInput);
		
	}
	
	public void checkGame(GamePlayer player) {
		
		if(board.hasWon(player)) {
			currentState = (player == GamePlayer.PLAYER1) ? GameState.PLAYER1 : GameState.PLAYER2;
		} else if (board.isDraw()) {
			currentState = GameState.DRAW;
		}
	}
	
	
	public static void main(String[] args) {
		new TicTocMainGame();
	}
}
