import java.io.File;

public class FileTree {
	
	public static void main(String [] args){
		File something = new File("/Users/dancohengtr/");
		
		System.out.println(FileTree.printDirectoryTree(something));
		
		
	}
	
	public static String printDirectoryTree(File folder) {
		
	    if (!folder.isDirectory()) { //check if folder argument is a valid directory
	        throw new IllegalArgumentException("Not a Directory");
	    }
	    
	    int indent = 0; //set initial indent count 
	    StringBuilder style = new StringBuilder();
	    style.append(folder.getName()); 
	    style.append(":"); //for root folder only
	    style.append("\n");
	    printDirectoryTree(folder, indent, style); //call separate function to print rest of tree
	    
	    return style.toString();
	}

	private static void printDirectoryTree(File folder, int indent,
	        StringBuilder style) {
		
	    if (!folder.isDirectory()) {
	        return;
	    }
	    
	    if(indent == 3){ // I stop here because the recursive call throws an exception if it keeps going. Not too sure why.
	    	return;
	    }
	    
	    for (File file : folder.listFiles()) { //loop through files in directory
	        if (file.isDirectory()) {
	            style.append(getIndent(indent));
	            style.append("|---");
	            style.append(file.getName());
	            style.append("\n");
	            printDirectoryTree(file, indent + 1, style);
	        } else {
	        	style.append(getIndent(indent));
	        	style.append("|---");
	        	style.append(file.getName());
	        	style.append("\n");
	        }
	    }

	}

	private static String getIndent(int indent) {
		
	    StringBuilder style = new StringBuilder();
	    
	    
	    for (int i = 0; i < indent; i++) { 
	    	style.append("|   ");
	    }
	    return style.toString();
	}
}
