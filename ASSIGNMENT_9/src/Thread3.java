
public class Thread3 implements Runnable {
	
	public char [] letters = {'C','G','K','O','S','W'};


	@Override
	public void run() {
		for(int i = 0; i < this.letters.length; i++){
			//Alphabet.heck.print3(this.letters[i]);
			System.out.println(this.letters[i]);
			try {
	        	 Thread.sleep(2000);
	           } catch (InterruptedException e) {
	           }
		}
	}
}
