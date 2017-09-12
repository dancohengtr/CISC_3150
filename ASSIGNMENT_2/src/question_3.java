import java.util.*;

public class question_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		try{
			do{
				
				System.out.println("Type in a string to check if it's a palindrome: ");
				
				str = sc.next();
				
				if(str.equals(new StringBuilder(str).reverse().toString())){
					System.out.println("it's a palindrome.");
				}else{
					System.out.println("not a palindrome.");
				}
				
				
			}while(true);
			
		}catch(Exception e){
			System.out.println("You have exited the program.");
			sc.close();
		}
	}
}
