package com.example.core.java.testjava8.filteredExam;

import java.util.Scanner;

public class TicTacToeNonOO {

	public static final int EMPTY = 0;
	public static final int PLAYER1 = 1;
	public static final int PLAYER2 = 2;
	
	
	public static int PLAYING = 0;
	public static int DRAW =1;
	public static int PLAYER1_WON = 2;
	public static int PLAYER2_WON = 3;
			
	public static int currentRow, currentCol;
	public static int currentState;
	public static int currentPlayer;
	
	public static final int rows = 3, cols = 3;
	public static int board[][] = new int[rows][cols];
			
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Initialize the program 
		initGame();
		printEachRound();
		// Keep looping the program until finish 
		do {
			
			//Start Playing and update the game  
			playGame(currentPlayer);
			//Check the game 
			checkGame(currentPlayer, currentRow, currentCol);
			//print the information 
			printEachRound();
			
			
			if(currentState == PLAYER1_WON) {
				System.out.println("Player 1 Won the Game Good Bye"); 
			} else if(currentState == PLAYER2_WON) {
				System.out.println("Player 2 Won the Game Good Bye ");
			} else if (currentState == DRAW) {
				System.out.println("Game is Draw Good Bye");
			}
			
			currentPlayer = currentPlayer == PLAYER1 ? PLAYER2 : PLAYER1;
			
		} while (currentState == PLAYING);
				
	}
	
	public static void initGame() {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				board[row][col] = EMPTY;
			}
		}
		
		currentState = PLAYING;
		currentPlayer = PLAYER1;
	}
	public static void checkGame(int playerInfo, int row, int col) {
		if(hasWon(playerInfo, row, col)) {
			currentState = playerInfo == PLAYER1 ? PLAYER1_WON : PLAYER2_WON;
		} else if(isDraw()) {
			currentState = DRAW;
		}
	}
	
	public static boolean isDraw() {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols ; col++) {
				if(board[row][col] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean hasWon(int playerInfo, int col, int row) {
		
		return board[row][0] == playerInfo && board[row][1] == playerInfo && board[row][2] == playerInfo 
			|| board[0][col] == playerInfo && board[1][col] == playerInfo && board[2][col] == playerInfo
			|| board[0][0] == playerInfo && board[1][1] == playerInfo && board[2][2] == playerInfo
			|| board[0][2] == playerInfo && board[1][1] == playerInfo && board[2][0] == playerInfo;
	}
	
	public static void playGame(int playerInfo) {
		boolean isValid = false;
		
		if(playerInfo == PLAYER1) {
			System.out.println("PLAYER 1 enter your move from (row [1-3] and col[1-3])");
		} else {
			System.out.println("PLAYER 2 enter your move from (row[1-3]) and col([1-3])");
		}
		do {
			int row = sc.nextInt() - 1;
			
			int col = sc.nextInt() - 1;
			
			if(row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == EMPTY) {
				currentRow = row;
				currentCol = col;
				board[row][col] = playerInfo;
				isValid = true;
			} else {
				System.out.println("The move at "+(row+1)+" And "+(col+1)+" is not valid Try again ");
			}
		} while(!isValid);
	}
	
	
	public static void printEachRound() {
		for(int row = 0; row < rows ; row++) {
			for(int col = 0; col < cols; col++) {
				printCellInfo(board[row][col]);
				if(col != cols-1){
					System.out.print("|");
				}
			}
			 System.out.println();
			if(row != rows-1){
				System.out.println("--------");
			}
		}
	}
	
	
	public static void printCellInfo(int playerInfo ) {
		switch(playerInfo) {
		case EMPTY : System.out.print(" ");break;
		case PLAYER1 : System.out.print("1");break;
		case PLAYER2 : System.out.print("2");break;
		}
	}
}
