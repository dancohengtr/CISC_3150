import java.util.Scanner;

public class N_Queens {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to N-Queens. Your one stop shop for finding all solutions in an N-row N-column checkerboard!\n");
		
		try{
			
			do{
				int dimension, horzKill = 0, vertKill = 0, numQueens = 0, numSolutions = 0;
				
				System.out.println("How big is the board?\n");
				dimension = sc.nextInt();
				
				if(dimension < 0){
					
					System.out.println("Not much of a checkerboard don't you think?\n");
					
				}else{
					
					char[][] board = new char[dimension][dimension];
					
					
					//outer:
					
						for(int i = 0; i < board.length; i++){
						
							for(int j = 0; j < board[i].length; j++){
								
								numQueens = 0;
								
								
								
								for(int l = 0; l < board.length; l++){
									
									for(int m = 0; m < board[l].length; m++){
										
										board[l][m] = 'O';
								
									}
						
								}
								
								horzKill = i;
								vertKill = j;
							
								board[i][j] = 'Q';
								
								numQueens++;
							
								for(int x = 0; x < board.length; x++){
									
									for(int y = 0; y < board[x].length; y++){
									
										if(x == horzKill && board[x][y] != 'Q' ){
											
											board[x][y] = 'X';
											
										}else if(y == vertKill && board[x][y] != 'Q'){
											
											board[x][y] = 'X';
											
										}else if(Math.abs(horzKill - x) == Math.abs(vertKill - y) && board[x][y] != 'Q'){
										
											board[x][y] = 'X';
											
										}
									}
								}
								
								
								for(int l = 0; l < board.length; l++){
									
									for(int m = 0; m < board[l].length; m++){
										
										
										if(board[l][m] == 'Q' || board[l][m] == 'X'){
											
											continue;
										
											
										}else if(board[l][m] == 'O'){ 
										
											horzKill = l;
											vertKill = m;
										
											board[l][m] = 'Q';
											
											numQueens++;
										
											for(int x = 0; x < board.length; x++){
												
												for(int y = 0; y < board[x].length; y++){
												
													if(x == horzKill && board[x][y] != 'Q' ){
														
														board[x][y] = 'X';
														
													}else if(y == vertKill && board[x][y] != 'Q'){
														
														board[x][y] = 'X';
														
													}else if(Math.abs(horzKill - x) == Math.abs(vertKill - y) && board[x][y] != 'Q'){
													
														board[x][y] = 'X';
														
													}
												}
											}
										}
									}
								}
								
								
								if(numQueens == dimension){
									
									numSolutions++;
									
									for(int x = 0; x < board.length; x++){
										
										for(int y = 0; y < board[x].length; y++){
											
											System.out.print(board[x][y]+"  "); 
											
										}
										
										System.out.println();
										
									}
									
									System.out.println();
								
								}
							}
						}
						
						
						System.out.println("There are " + numSolutions + " solutions.");
				
				}
				
				
				
				
				
			}while(true);
			
		}catch(Exception e){
			System.out.println("You have exited the program\n");
			sc.close();
		}
		
	}

}
