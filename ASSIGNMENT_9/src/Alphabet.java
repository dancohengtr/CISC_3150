
public class Alphabet {
	
	public static Alphabet heck = new Alphabet ();
	
	public Object sync = new Object();
	public int state = 0;

	
	public static void main(String[] args){
		
		//initialize runnable classes
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		//initialize threads
		Thread w = new Thread(t1);
		Thread x = new Thread(t2);
		Thread y = new Thread(t3);
		Thread z = new Thread(t4);
		
		w.start();
		x.start();
		//y.start(); HAD A LOT OF TROUBLE GETTING THIS TO HAPPEN WITH 4 THREADS, SORRY. IT JUST WOULDN'T WORK.
		//z.start();
	}
	public void print1(char letter){
		
		synchronized (this.sync) {
			while (true) {
				if (this.state == 0) {
					System.out.println(letter + " ");
					this.state = 1;
					this.sync.notify();
					return;
		        } else {
		           try {
		        	 this.sync.wait();
		           } catch (InterruptedException e) {
		           }
		        }
		    }
		}
	}
	public void print2(char letter){
		
		synchronized (this.sync) {
			while (true) {
				if (this.state == 1) {
					System.out.println(letter + " ");
					this.state = 0;
					this.sync.notify();
					return;
		        } else {
		           try {
		        	 this.sync.wait();
		           } catch (InterruptedException e) {
		           }
		        }
		    }
		}
	}
	/*public void print3(char letter){
		
		synchronized (this.sync) {
			while (true) {
				if (this.state == 2) {
					System.out.println(letter + " ");
					this.state = 3;
					this.sync.notify();
					return;
		        } else {
		           try {
		        	 this.sync.wait();
		           } catch (InterruptedException e) {
		           }
		        }
		    }
		}
	}
	public void print4(char letter){
		
		synchronized (this.sync) {
			while (true) {
				if (this.state == 3) {
					System.out.println(letter + " ");
					this.state = 0;
					this.sync.notify();
					return;
		        } else {
		           try {
		        	 this.sync.wait();
		           } catch (InterruptedException e) {
		           }
		        }
		    }
		}
	}*/
}
