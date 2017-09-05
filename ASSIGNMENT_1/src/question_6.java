import java.util.*;

public class question_6 {
	
	private int coordinateX = 0, coordinateY = 0, radius = 5;
	
	public question_6(int coordinateX, int coordinateY, int radius){
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.radius = radius;
	}
	public question_6(){
		System.out.println("circle created!");
	}
	public int getX(){
		return this.coordinateX;
	}
	public int getY(){
		return this.coordinateY;
	}
	public int getRadius(){
		return this.radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public void setCenterX(int coordinateX){
		this.coordinateX = coordinateX;
	}
	public void setCenterY(int coordinateY){
		this.coordinateY = coordinateY;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		question_6 CircleA = new question_6();
		question_6 CircleB = new question_6();
		
		try{
			
			do{
				
				System.out.println("Enter a center coordinate and radius for circle A.\n");
				System.out.println("X: ");
				CircleA.setCenterX(sc.nextInt());
				System.out.println("Y: ");
				CircleA.setCenterY(sc.nextInt());
				System.out.println("Radius: ");
				CircleA.setRadius(sc.nextInt());
				
				
				System.out.println("Enter a center coordinate and radius for circle B.\n");
				System.out.println("X: ");
				CircleB.setCenterX(sc.nextInt());
				System.out.println("Y: ");
				CircleB.setCenterY(sc.nextInt());
				System.out.println("Radius: ");
				CircleB.setRadius(sc.nextInt());
				
				
				
				if(CircleA.getX() == CircleB.getX() && CircleA.getY() == CircleB.getY()){
					
					System.out.println("The circles are completely within each other. \n");
					
				}else if (CircleA.getX() < CircleB.getX() + CircleB.getRadius() && CircleA.getX() + CircleA.getRadius() > CircleB.getX() && CircleA.getY() < CircleB.getY() + CircleB.getRadius() && CircleA.getRadius() + CircleA.getY() > CircleB.getY()){
					
					System.out.println("The circles are touching. \n");
					
				}else{
					
					System.out.println("The circles are not touching. \n");
					
				}
				
				
				
			}while(true);
			
			
		}catch(Exception e){
		
			System.out.println("You have exited the program.");
			sc.close();
		}

	}

}
