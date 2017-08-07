package apr2017.problem2;

public abstract class Department {
	private StringQueue queue = new StringQueue();

	public StringQueue getQueue() {
		return queue;
	}
	// implement

	public void addMessage(String msg) {
		queue.enqueue(msg);
	}

	public String nextMessage() {
		String message = null;
		try {
			message = queue.peek();
			queue.dequeue();
			return message;

		} catch (EmptyQueueException e) {
		}

		return message;

	}

	public abstract String getName();

	@Override
	public String toString() {
		return getName();
	}
}
