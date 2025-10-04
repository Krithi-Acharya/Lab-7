package MessageBoard;

public class Consumer extends Thread {
	private Messageboard board;

    public Consumer(Messageboard b) {
        this.board = b;
    }

    @Override
    public void run() {
        String msg;
        while (!(msg = board.get()).equals("DONE")) {
            System.out.println("Consumed: " + msg);
        }
    }
}
