
public class Thread4 implements Runnable {
	
	public char [] letters = {'D','H','L','P','T','X'};



	@Override
	public void run() {
		for(int i = 0; i < this.letters.length; i++){
			//Alphabet.heck.print4(this.letters[i]);
			System.out.println(this.letters[i]);
			try {
	        	 Thread.sleep(1000);
	           } catch (InterruptedException e) {
	           }
	}
  }
}
