
public class Thread1 implements Runnable {
	
	public char [] letters = {'A','C','E','G','I','K','M','O','Q','S','U','W','Y'};
	
	@Override
	public void run() {
		
		for(int i = 0; i < this.letters.length; i++){
			Alphabet.heck.print1(this.letters[i]);
		}
	}
}
