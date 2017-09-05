import java.util.*;

public class question_5 {
	
	private int x = 1, y = 1;
	
	public question_5(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public question_5(){
		System.out.println("Point is created.");
	}
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sideA, sideB, sideC;
		
		try{
			do{
				System.out.println("Type in an X and a Y: ");
				question_5 PointA = new question_5(sc.nextInt(), sc.nextInt());
				
				System.out.println("Type in another: ");
				question_5 PointB = new question_5(sc.nextInt(), sc.nextInt());
				
				System.out.println("and another: ");
				question_5 PointC = new question_5(sc.nextInt(), sc.nextInt());
				
				sideA = Math.sqrt(Math.pow(PointB.getX() - PointA.getX(), 2) + Math.pow(PointB.getY() - PointA.getY(), 2));
				System.out.println("side A = " + sideA);
				sideB = Math.sqrt(Math.pow(PointC.getX() - PointB.getX(), 2) + Math.pow(PointC.getY() - PointB.getY(), 2));
				System.out.println("side B = " + sideB);
				sideC = Math.sqrt(Math.pow(PointA.getX() - PointC.getX(), 2) + Math.pow(PointA.getY() - PointC.getY(), 2));
				System.out.println("side C = " + sideC);
				if(sideA + sideB > sideC){
					
					System.out.println("the triangle is real!");
					
				}else if(sideA + sideC > sideB){
					
					System.out.println("the triangle is real!");
					
				}else if(sideB + sideC > sideA){
					
					System.out.println("the triangle is real!");
					
				}else{
					
					System.out.println("Not a real triangle...");
				
				}
				
			}while(true);
			
		}catch(Exception e){
		
			System.out.println("You have exited the program.");
			sc.close();
		}

	}

}

