import java.util.*;
import java.io.*;


public class Calculator{
	private double left, right;
	private String operater;
	
	Calculator(double left, String operator, double right){
		this.left = left;
		this.operater = operator;
		this.right = right;
	}
	
	public static void main(String[] args) {
		
		double x, y;
		String operater;
		
			
			
				
				System.out.println("Type in an operation(s) to perform: ");
				
				
				
				while(true){
					
					try{
						
						Scanner scanner = new Scanner(System.in);
						
						if(!scanner.hasNextDouble()){
							throw new LookAtMrAlgebraOverHereException();
						}
						x =  scanner.nextDouble();
						operater = scanner.next();
						if(!scanner.hasNextDouble()){
							throw new LookAtMrAlgebraOverHereException();
						}else if(!scanner.hasNext()){
							throw new UserIsADumbassException();
						}
						y = scanner.nextDouble();
						
						
						if(x == 0 || y == 0 && operater.charAt(0) == '/'){
							throw new ArithmeticException();
						}
						
						Calculator calc = new Calculator(x, operater, y);
						
				        
				        System.out.println(calc.compute());
			        
					}catch(ArithmeticException e){
						System.out.println("Please don't divide by zero!");
					}catch(IllegalOperationException e){
						System.out.println("That's not an operand!");
					}catch(LookAtMrAlgebraOverHereException e){
						System.out.println("Let's type in a number next time.");
					}catch(UserIsADumbassException e){
						System.out.println("You forgot a number!");
					}
					
				}
				
			
				
			
			
			
        
    }
	
    public double compute() throws IllegalOperationException {
        switch (this.operater.charAt(0)) {
        case '+':
            return this.left + this.right;
        case '-':
            return this.left - this.right;
        case 'x':
            return this.left * this.right;
        case '/':
            return this.left / this.right;
        case '%':
            return this.left % this.right;
        default:
        	throw new IllegalOperationException();
        }
    }
}
