import java.io.File;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args)  throws Throwable {
		
		Scanner scan = new Scanner(System.in);
		File pluginsDirectory = new File("src/plugin/");
		int pluginCount = 0;
		int choice;
		
		if (!pluginsDirectory.isDirectory()) { //check if folder argument is a valid directory
	        throw new IllegalArgumentException("Not a Directory");
	    }
		
		for (File file : pluginsDirectory.listFiles()) {
			if(file.getName().endsWith(".java")){
				System.out.println(file.getName());
				pluginCount++;
			}
		}
		
		if(pluginCount > 0){
			
			System.out.println(pluginCount + " plugins were found. Type in a number and we'll execute that index of plugin!");
		}else{
			
			System.out.println("No plugins were found...");

		}
		
		try{
			while(true){
				
				choice = scan.nextInt();
				
				
				
				if (choice == 1){
					
					Class <plugin.Plugin1> c = plugin.Plugin1.class;
					plugin.Plugin1 cya = c.newInstance();
					System.out.println(c.getName());
					cya.whoSaysBye();
					cya.whoSaysHello();
					
				}else if (choice == 2){
					
					Class <plugin.Plugin2> c = plugin.Plugin2.class;
					plugin.Plugin2 cya = c.newInstance();
					System.out.println(c.getName());
					cya.whoSaysBye();
					cya.whoSaysHello();
					
				}else{
					System.out.println("Not a valid index!");
				}
				
			}
			
		}catch(Throwable ex){
			System.out.println("You've exited the program");
		}
		
		
			
		
	}

}
