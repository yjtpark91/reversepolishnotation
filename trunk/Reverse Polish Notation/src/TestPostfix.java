
public class TestPostfix {
	public static <T> void main(String[] args) throws StackUnderflow, StackOverflow {
		
		Postfix<T> testPostfix2 = new Postfix<T>();
		
		System.out.println("This is it: " + testPostfix2.infixToPostfix("1*2+3") + " Expected: 12*3+");
		System.out.println();
		System.out.println("This is it: " + testPostfix2.infixToPostfix("1+2*3") + " Expected: 123*+");
		System.out.println();
		System.out.println("This is it: " + testPostfix2.infixToPostfix("1 + 2 - 3 ^ 4") + " Expected: 12+34^-");
		System.out.println();
		System.out.println("This is it: " + testPostfix2.infixToPostfix("1 ^ 2 - 3 * 4") + " Expected: 12^34*-");
		System.out.println();
		System.out.println("This is it: " + testPostfix2.infixToPostfix("1 + 2 * 3 - 4 ^ 5 + 6") + " Expected: 123*+45^-6+");
		System.out.println();
		System.out.println("This is it: " + testPostfix2.infixToPostfix("9 - 1 - 2 - 3 * 2 - 1") + " Expected: 91-2-32*-1-");
		System.out.println();
		System.err.println("This is it: " + testPostfix2.infixToPostfix("1 + 2 + 3 / 4 + 5 + 6 * ( 7 + 8 )") + " Expected: 12+34/+5+678+*+");
		System.out.println();
		
		
		//do the test with all of the expressions from the pre-lab
		String testStringA = "12*3+";
		String testStringB = "123*+";
		String testStringC = "12+34^-";
		String testStringD = "12^34*-";
		String testStringE = "123*+45^-6+";
		String testStringF = "12+3*456-^+";
		String testStringG = "12+34/+5+678+*+";
		String testStringH = "91-2-32*-1-";
		
		Postfix<T> testPostfix = new Postfix<T>();
		System.out.println("Result a): " + testPostfix.evaluate(testStringA));
		System.out.println("Result b): " + testPostfix.evaluate(testStringB));
		System.out.println("Result c): " + testPostfix.evaluate(testStringC));
		System.out.println("Result d): " + testPostfix.evaluate(testStringD));
		System.out.println("Result e): " + testPostfix.evaluate(testStringE));
		System.out.println("Result f): " + testPostfix.evaluate(testStringF));
		System.out.println("Result g): " + testPostfix.evaluate(testStringG));
		System.out.println("Result h): " + testPostfix.evaluate(testStringH));
	}
}
