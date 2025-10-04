package MessageBoard;

public class Producer extends Thread {
	private Messageboard board;
	public Producer(Messageboard b) {
		this.board=b;
	}
	@Override
	public void run() {
		String msgs[]= {
			"Exam on Monday",
			"Holiday on Tuesday",
			"Workshop on Wednesday"
		};
		for(String msg: msgs) {
			board.put(msg);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		board.put("Done");
	}
}
