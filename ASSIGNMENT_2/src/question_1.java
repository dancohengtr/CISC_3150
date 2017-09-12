import java.util.*;

public class question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int levels;
		
		try{
			do{
				
				System.out.println("How tall of a pyramid would you like to see?");
				levels = sc.nextInt();
				
				for(int i = 0; i < levels; i++){
					
					for(int j=0; j<levels - (i+1); j++)
				    {
				        System.out.print("  ");
				    }
					
					for(int j=0;j<=i;j++){
						System.out.printf("%2d", j + 1);
				    }
					
					for(int j=0;j<i;j++){
						
						System.out.printf("%2d", i - j);
				    }
					
					System.out.printf("\n");
				}
				
				
			
			}while(true);
			
		}catch(Exception e){
			System.out.println("You have exited the program.");
			sc.close();
		}
		
		
		
		
		
		

	}

}
