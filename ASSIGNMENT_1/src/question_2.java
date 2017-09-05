import java.util.*;

public class question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius, area;
		
		try{
			do{
				
				System.out.println("Type in a circle radius to see the area or press control+d to exit the program. \n ");
				System.out.println("area: ");
				radius = sc.nextInt();
				
				area = Math.PI * Math.pow(radius, 2);
				System.out.println("The area is: " + area);
				
			}while(true);
			
		}catch(Exception e){
			
			System.out.println("You have exited the program.");
			sc.close();
		}
	}
}
