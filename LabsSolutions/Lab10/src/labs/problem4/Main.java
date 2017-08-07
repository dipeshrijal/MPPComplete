package labs.problem4;

public class Main {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();

		for (int i = 1; i <= 15; i++) {
			stack.push(i);
		}

		stack.push(21);

		System.out.println("size " + stack.size());
		System.out.println("popping " + stack.pop());

		System.out.println("popping " + stack.pop());

		stack.push(100);
		System.out.println("peeking " + stack.peek());
		System.out.println("size " + stack.size());

		System.out.println(stack);
		
		
		MyStack<String> str = new MyStack<String>();

		str.push("Dipesh");

		str.push("Rijal");

		System.out.println("size " + str.size());
		//
		System.out.println("popping " + str.pop());
		// System.out.println("popping " + stack.pop());

		System.out.println("popping " + str.pop());

		// System.out.println(stack.size());
		str.push("John");
		System.out.println("peeking " + str.peek());
		System.out.println("size " + str.size());

		System.out.println(str);

	}

}
