package rmuti.lab4;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListStack stack =new ArrayListStack();
		stack.push("macos");
		stack.push("linux");
		stack.push("windows");
		System.out.println(stack);
		
		String data = (String)stack.pop();
		System.out.println(stack);

	}

}
