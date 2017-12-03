
public class Thread2 implements Runnable {
	
	public char [] letters = {'B','D','F','H','J','L','N','P','R','T','V','X','Z'};

	@Override
	public void run() {
		for(int i = 0; i < this.letters.length; i++){
			Alphabet.heck.print2(this.letters[i]);
		}
	}
}
