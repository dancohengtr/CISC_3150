
public class Driver {

public static void main(String[] args) {
		
		char[] mlem = {'H', 'E', 'L', 'L', 'O'};
		char[] heck = {'h', 'e', 'l', 'l', 'o'};
		
		int x = 7;
		
		myString st1 = new myString(mlem);
		myString st2 = new myString(heck);
		myString st3 = myString.valueOf(x);
		
		
		//test valueOf
		System.out.println("Integer value is: " + x);
		System.out.println("valueOf returns: " + st3.toString() + "\n");
		
		//test upper and lower case and toString
		System.out.println("Let's check upper and lower case");
		System.out.println("st1 before: " + st1.toString());
		System.out.println("st1 after: " + st1.toLowerCase().toString());
		System.out.println("st2 before: " + st2.toString());
		System.out.println("st2 after: " + st2.toUpperCase().toString() + "\n");
		
		//test equals
		System.out.println("Are st1 and st2 equal?");
		if(st1.equals(st2) == true){
			System.out.println("true\n");
		}else if(st1.equals(st2) == false){
			System.out.println("false\n");
		}
		
		
		//test charAt
		System.out.println("Let's find the charAt 2 and 4");
		System.out.println("st1: " + st1.charAt(2));
		System.out.println("st2: " + st2.charAt(4) + "\n");
		
		
		//test substring
		System.out.println("Let's find the substring from 2-4 and 1-3");
		System.out.println("st1: " + st1.substring(2, 4).toString());
		System.out.println("st2: " + st2.substring(1, 3).toString() + "\n");
		
		
		//test getMYString
		myString st4 = st1.getMyString();
		System.out.println("Create a new string st4 with value set to st1");
		System.out.println("st4: " + st4.toString() + "\n");

	}

}
