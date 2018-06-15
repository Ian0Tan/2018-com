package ian_Tic_Tac_Toe;

import hsa_new.Console;

public class Tic_Tac_Toe {

	static Console i = new Console( 20,25,30,"input");
	static Console d = new Console( 12,25,40,"display");
	static char win = 'N';
	public static void main(String[] args) {
		char[][] gameBoard = new char [3][3];
		int xValue = 0;
		int yValue = 0;
		Boolean valid = false;
		int restart = 1;

		d.print("TIC TAC TOE \n by Ian Tan\n");
		d.print("To start, \ntype start below\n");
		String start = d.readString();
		if(start.equalsIgnoreCase("start")){
			while (restart == 1){
				reset(gameBoard);
				sUpdate(gameBoard);
				restart = 0;
				while(win == 'N') {
					do {
						valid = false;
						i.print("Player 1 go\n");
						i.print("input column\n");
						xValue = i.readInt() - 1;
						i.print("input row\n");
						yValue = i.readInt() - 1;
						if(gameBoard[xValue][yValue] == ' ') {
							gameBoard[xValue][yValue] = 'X';
							d.print(gameBoard + "\n");
							valid = true;
							sUpdate(gameBoard);
							winCheck(gameBoard);
						}
						else {
							i.print("NA\n");
						}
					}while(valid == false);
					do{	
						valid = false;
						i.print("Player 2 go\n");
						i.print("input column\n");
						xValue = i.readInt() - 1;
						i.print("input row\n");
						yValue = i.readInt() - 1;
						if(gameBoard[xValue][yValue] == ' ') {
							gameBoard[xValue][yValue] = 'O';
							d.print(gameBoard + "\n");
							valid = true;
							sUpdate(gameBoard);
							winCheck(gameBoard);
							i.clear();
						}
						else {
							i.print("NA\n");
						}
					}while(valid == false);
				}
				restart = 0;
				i.print("Would you like to \nplay again?\n(Yes or No)\n ");
				String endInput = i.readString();
				if(endInput.equalsIgnoreCase("yes")) {
					restart = 1;
					win = 'N';
					i.clear();
					d.clear();
				}
				else if (endInput.equalsIgnoreCase("no")) {
					i.clear();
					i.print("Thank you for playing!");
				}
			}
		}
	}
	public static void reset(char[][]gameBoard) {
		for(int row = 0; row <= 2;row++){
			for(int col = 0; col <= 2; col++) {
				gameBoard[row][col] = ' ';
			}
		}
		return;
	}
	public static void sUpdate(char[][]gameBoard){
		d.clear();
		d.println("\n	|  	|	");
		d.println("    "+(gameBoard[0][0])+"	|   "+(gameBoard[0][1])+"   |   " + (gameBoard[0][2]));
		d.println("	|	|	");
		d.println("-------------------------");
		d.println("	|	|	");
		d.println("    "+(gameBoard[1][0])+"	|   "+(gameBoard[1][1])+"   |   " + (gameBoard[1][2]));
		d.println("	|	|	");
		d.println("-------------------------");
		d.println("	|	|	");
		d.println("    "+(gameBoard[2][0])+"	|   "+(gameBoard[2][1])+"   |   " + (gameBoard[2][2]));
		d.println("	|	|	");
	}
	public static void winCheck(char[][]gameBoard){
		if (gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2])  {
			win = gameBoard[0][0];
			endPrint(win);
		}
		else if(gameBoard[1][0] != ' ' && gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2]){
			win = gameBoard[1][0];
			endPrint(win);
		}
		else if(gameBoard[2][0] != ' ' && gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][1] == gameBoard[2][2]){
			win = gameBoard[2][0];
			endPrint(win);
		}
		else if(gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][1] == gameBoard[0][2]){
			win = gameBoard[0][0];
			endPrint(win);
		}
		else if(gameBoard[0][1] != ' ' && gameBoard[0][1] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][1]){
			win = gameBoard[0][1];
			endPrint(win);
		}
		else if(gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[1][2] && gameBoard[1][2] == gameBoard[2][2]){
			win = gameBoard[0][2];
			endPrint(win);
		}
		else if(gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]){
			win = gameBoard[0][0];
			endPrint(win);
		}
		else if(gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]){
			win = gameBoard[0][2];
			endPrint(win);
		}
		else if(gameBoard[0][0] != ' ' && gameBoard[1][0] != ' ' && gameBoard[2][0] != ' ' && gameBoard[0][1] != ' ' && gameBoard[1][1] != ' ' && gameBoard[2][1] != ' ' &&gameBoard[0][2] != ' ' &&gameBoard[1][2] != ' ' && gameBoard[2][2] != ' '){
			win = 'T';
		}
	}


	public static void endPrint(int win) {
		d.clear();
		i.clear();
		if(win != 'T'){
			char playerWin = 'N';
			if(win == 'X'){
				playerWin = '1';
			}
			else if(win == 'O'){
				playerWin = '2';
			}
			i.print("player " + playerWin + " won the game\n");

		}
		else {
			i.print("It is a tie/n");
		}
		i.print("To continue,\n type anything\n");
		String s = i.readString();
	}
}
