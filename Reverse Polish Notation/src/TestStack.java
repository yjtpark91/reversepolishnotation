
public class TestStack {

	private static int VERYHIGHNUMBER = 1000000;
	private static int number = 0;
	
	public static void main(String[] args) {
		
		//create a new Stack that stores integers
		Stack<Integer> testStack = new Stack<Integer>();
		
		int[] myChars = {0,1,2,3,4,5,6,7,8,9,10,11,12}; //13
		
		//store every char from myChars[] in the array
		for(int i = 0; i < myChars.length; i++)
		{
			Integer c = new Integer(myChars[i]);
			
			try {
				testStack.push(c);
			} catch (StackOverflow e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//TEST-CASES--------------------------------------------------------------
		System.out.print("Stack: ");
		System.out.println(testStack.print());
		System.out.println("=================");
		System.out.println("START TESTCASES: (Size: " + testStack.getSize()+")");
		System.out.println();
		System.out.println("remove the top element...");
		
		try {
			testStack.pop();
		} catch (StackUnderflow e) {
			System.err.println("Stack is empty can not remove things!");
		}
		System.out.print(testStack.print());
		System.out.println(" (Size: " + testStack.getSize()+")");
		System.out.println();
		
		
		System.out.println("empty the whole stack and try to get the top value...");
		testStack.Empty();
		try {
			System.out.println(testStack.top());
		} catch (StackUnderflow e) {
			System.err.println("Stack is empty there is no top item");
		}
		System.out.println();
		
		System.out.println("add 4 new characters to the stack");
		
		try {
			testStack.push(4);
		testStack.push(3);
		testStack.push(2);
		testStack.push(1);
		} catch (StackOverflow e) {
			e.printStackTrace();
		}
		
		System.out.print(testStack.print());
		System.out.println(" (Size: " + testStack.getSize()+")");
		System.out.println("Stack empty?: " + (testStack.isEmpty() ? "Yes" : "No"));
		System.out.println();
		
		System.out.println("Try to add a hugh amount of characters...");
		for(int i = 0; i < VERYHIGHNUMBER; i++){
			number ++;
			try {
				testStack.push(number);
			} catch (StackOverflow e) {
				System.err.println("Too much elements, memory can't handle it!");
			}
		}
		System.out.print(testStack.print());
	}
}
