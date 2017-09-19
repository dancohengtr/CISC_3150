
public class myString {
	
	private char[] value;
	
	public myString(){};
	
	public myString(char[] chars){this.value = chars;}
	
	public char charAt(int index){
		
		char value = this.value[index];
		
		return value;
		
	}
	
	public int length(){
		
		int length = this.value.length;
		
		return length;
		
	}
	
	public myString substring(int begin, int end){
		
		
		char [] substr = new char[this.value.length];
		
		int j = -1;
				
		for(int i = begin; i < end + 1; i++){
			
			substr[++j] = this.value[i];
			
		}
		
		myString newstr = new myString(substr);
		
		return newstr;
		
		
	}
	
	public myString toLowerCase(){
		
		char[] str = new char[this.value.length];
		
		System.arraycopy(this.value, 0, str, 0, this.value.length);
	
		for(int i = 0; i < str.length; i++){
			
			if(str[i] == 'A'){
				str[i] = 'a';
			}else if(str[i] == 'B'){
				str[i] = 'b';
			}else if(str[i] == 'C'){
				str[i] = 'c';
			}else if(str[i] == 'D'){
				str[i] = 'd';
			}else if(str[i] == 'E'){
				str[i] = 'e';
			}else if(str[i] == 'F'){
				str[i] = 'f';
			}else if(str[i] == 'G'){
				str[i] = 'g';
			}else if(str[i] == 'H'){
				str[i] = 'h';
			}else if(str[i] == 'I'){
				str[i] = 'i';
			}else if(str[i] == 'J'){
				str[i] = 'j';
			}else if(str[i] == 'K'){
				str[i] = 'k';
			}else if(str[i] == 'L'){
				str[i] = 'l';
			}else if(str[i] == 'M'){
				str[i] = 'm';
			}else if(str[i] == 'N'){
				str[i] = 'n';
			}else if(str[i] == 'O'){
				str[i] = 'o';
			}else if(str[i] == 'P'){
				str[i] = 'p';
			}else if(str[i] == 'Q'){
				str[i] = 'q';
			}else if(str[i] == 'R'){
				str[i] = 'r';
			}else if(str[i] == 'S'){
				str[i] = 's';
			}else if(str[i] == 'T'){
				str[i] = 't';
			}else if(str[i] == 'U'){
				str[i] = 'u';
			}else if(str[i] == 'V'){
				str[i] = 'v';
			}else if(str[i] == 'W'){
				str[i] = 'w';
			}else if(str[i] == 'X'){
				str[i] = 'x';
			}else if(str[i] == 'Y'){
				str[i] = 'y';
			}else if(str[i] == 'Z'){
				str[i] = 'z';
			}
			
		}
		
		myString lower = new myString(str);
		
		return lower;
		
	}
	
	public myString toUpperCase(){
		
		char[] str = new char[this.value.length];
		
		System.arraycopy(this.value, 0, str, 0, this.value.length);
		
		for(int i = 0; i < str.length; i++){
			
			if(str[i] == 'a'){
				str[i] = 'A';
			}else if(str[i] == 'b'){
				str[i] = 'B';
			}else if(str[i] == 'c'){
				str[i] = 'C';
			}else if(str[i] == 'd'){
				str[i] = 'D';
			}else if(str[i] == 'e'){
				str[i] = 'E';
			}else if(str[i] == 'f'){
				str[i] = 'F';
			}else if(str[i] == 'g'){
				str[i] = 'G';
			}else if(str[i] == 'h'){
				str[i] = 'H';
			}else if(str[i] == 'i'){
				str[i] = 'I';
			}else if(str[i] == 'j'){
				str[i] = 'J';
			}else if(str[i] == 'k'){
				str[i] = 'K';
			}else if(str[i] == 'l'){
				str[i] = 'L';
			}else if(str[i] == 'm'){
				str[i] = 'M';
			}else if(str[i] == 'n'){
				str[i] = 'N';
			}else if(str[i] == 'o'){
				str[i] = 'O';
			}else if(str[i] == 'p'){
				str[i] = 'P';
			}else if(str[i] == 'q'){
				str[i] = 'Q';
			}else if(str[i] == 'r'){
				str[i] = 'R';
			}else if(str[i] == 's'){
				str[i] = 'S';
			}else if(str[i] == 't'){
				str[i] = 'T';
			}else if(str[i] == 'u'){
				str[i] = 'U';
			}else if(str[i] == 'v'){
				str[i] = 'V';
			}else if(str[i] == 'w'){
				str[i] = 'W';
			}else if(str[i] == 'x'){
				str[i] = 'X';
			}else if(str[i] == 'y'){
				str[i] = 'Y';
			}else if(str[i] == 'z'){
				str[i] = 'Z';
			}
			
		}
		
		myString upper = new myString(str);
		
		return upper;
		
	}
	
	
	public boolean equals(myString s){
		
		if(this.value.length == s.value.length){
			
			for(int i = 0; i < this.value.length; i++){
				
				if(this.charAt(i) != s.charAt(i)){
					return false;
				}
				
			}
				
			
		}else{
			
			return false;
	
		}
		
		return true;
	}
	
	
	public myString getMyString(){
		
		char[] c = new char[this.value.length];
		
		System.arraycopy(this.value, 0, c, 0, this.value.length);
		
		myString str = new myString(c);
		
		return str;
		
		
	}
	
	public String toString(){
		
		char[] c = new char[this.value.length];
		
		System.arraycopy(this.value, 0, c, 0, this.value.length);
		
		String str = new String(c);
		
		return str;
		
	}
	
	//couldn't think of a way to do this one properly without making some long, expensive operation.
	public static myString valueOf(int i){
		
	
		//can cast but it returns the ASCII value...
		
		//this will return the ASCII value so it'll only return corresponding number if integer values are 0-9
		char c = Character.forDigit(i, 10);;
		
		char[] str = new char[1];
		
		str[0] = c;
		
		myString valueOf = new myString(str);
		
		//just returns the ASCII value for now
		return valueOf;
		
	}


}
