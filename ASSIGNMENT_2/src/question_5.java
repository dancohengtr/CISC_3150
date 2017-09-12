import java.util.*;

public class question_5 {

	public static void main(String[] args) {
		
		String str = "Sometimes, I like to fly, but then I fall";
		Scanner sc = new Scanner(str).useDelimiter(",");
		
		System.out.println("The original string is: " + str);
		
		try{
			do{
				
					System.out.printf("\n\n");
					System.out.println(sc.next());			
				
			}while(sc.hasNext());
			
			sc.close();
			
		}catch(Exception e){
			System.out.println("You have exited the program.");
			sc.close();
		}
	}
		
}


