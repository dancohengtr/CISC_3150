import java.util.*;

public class Generate_Stuff {
	
	private double x, y;
	
	Generate_Stuff(){};
	
	Generate_Stuff(double x, double y){
		
		this.x = x;
		this.y = y;
		
	}
	
	

	public static void main(String[] args) {
		
		
		double x, y;
		final int NUM_DOTS = 400000000;
		int insideCircle = 0, outsideCircle = 0;
		
		for(int i = 0; i < NUM_DOTS; i++){
			
			x = Math.random();
			y = Math.random();
		
			
			if(x > Math.PI / 4 || y > Math.PI / 4){
				
				outsideCircle++; 
				
			}else{
				
				insideCircle++;
			}
			
			
		}
		System.out.println("inside / number of dots: ");
		System.out.println(((double)insideCircle)/((double)NUM_DOTS));
		System.out.println();
		
		
		System.out.println("first ratio: ");
		System.out.println(Math.abs((1-Math.PI/4.0) - Math.PI/4.0));
		System.out.println();
		
		
		
	}

}
