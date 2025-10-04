package MessageBoard;

public class ProducerConsumerDemo {
	 public static void main(String[] args) throws InterruptedException {
	        Messageboard board = new Messageboard();
	        Producer p = new Producer(board);
	        Consumer c = new Consumer(board);

	        p.start();
	        c.start();

	        p.join();
	        c.join();
	    }
	}
