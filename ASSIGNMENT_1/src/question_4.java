import java.util.*;
import java.io.*;

public class question_4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("question_4_textfile");
		
        Scanner sc = new Scanner(file);
        
        sc.useDelimiter("\\Z");
        
        System.out.println(sc.next());
        
        sc.close();
	}
}