
public class Postfix<T> {
	
	//fields
	private int MAX_OPERATORS = 5;
	Integer result;
	//operators stored by precedence
	char[] operators = {'^', '*', '/', '+', '-'};
	
	public int evaluate (String pfx) throws StackUnderflow, StackOverflow {
		//make a new stack that stores integers
		Stack<Integer> myStack = new Stack<Integer>();
		
		//parse the string from end to beginning
		for(int i = 0; i <= pfx.length()-1; i++) 
		{
			Character c = new Character(pfx.charAt(i));
			
			//if c is an operand just push it into the stack
			if (isOperand(c)) 
			{ 
				System.out.println(c + " is an Operand push it to the stack.");
			    myStack.push(c - '0');
			    System.out.println("My Stack: " + myStack.print());
			    
			}
			
			//if c is an operator store the top two values and do some calculation
			if (isOperator(c)) 
			{
			    //store the top value of the stack
			    Integer b = myStack.top(); 
			    //pop the top of the stack
			    myStack.pop();
			    
			    //store the top value of the value stack
			    Integer a = myStack.top(); 
			    //pop the top of the stack
			    myStack.pop();
			    System.out.println(c + " is an Operator - calculate " + a + c + b);
			    
			    //do the calculation with a and b according to the kind of operator 
			    switch(c) 
			    { 
			    case '^': 
			    	result = (int)Math.pow(a,b); 
			    	break; 
			    case '*': 
			    	result = a * b; 
			    	break; 
			    case '/': 
			    	result = a / b; 
			    	break; 
			    case '+': 
			    	result = a + b; 
			    	break; 
			    case '-': 
			    	result = a - b; 
			    	break; 
			    } 
			    //push the result into the stack 
			    myStack.push(result);
			    System.out.println("My Stack: " + myStack.print());
			}
		}
		//return the top of the stack what should be the result of the expression
		return myStack.top(); 
	}
	
	
	public String infixToPostfix (String ifx)
	{
		char cBuffer = 0;
		Stack<Character> myStack = new Stack<Character>();
		Stack<Character> buffer = new Stack<Character>();
		for(int i = ifx.length()-1; i >= 0; i--){
			Character c = new Character(ifx.charAt(i));
			if (isOperand (c)){
				try {
					myStack.push(c);
				} catch (StackOverflow e) {
					e.printStackTrace();
				}
			}
			
			if (isOperator (c)){
				while (buffer.isEmpty()){
					
					try {
						buffer.push(c);
					} catch (StackOverflow e) {
						e.printStackTrace();
					}
					
				}
				
				while (!buffer.isEmpty()){
					
					try {
						cBuffer = buffer.top();
					} catch (StackUnderflow e) {
						e.printStackTrace();
					}
					
					if ((getPrecedence(cBuffer) >= getPrecedence(c))) {
						
						try {
							myStack.push(cBuffer);
						} catch (StackOverflow e) {
							e.printStackTrace();
						}
						
						try {
							buffer.pop();
						} catch (StackUnderflow e) {
							e.printStackTrace();
						}
						
						try {
							buffer.push(c);
						} catch (StackOverflow e) {
							e.printStackTrace();
						}
						
					}else {
						
						try {
							buffer.push(c);
						} catch (StackOverflow e) {
							e.printStackTrace();
						}
						
					}
				}
			}
		}
		return myStack.print();
	}
	
	/**
	 * returns if the character is a operator
	 * @return is an operand
	 */
	public boolean isOperand(Character ch) 
	{ 
		//check if ch represents a digit
		if(Character.isDigit(ch.charValue())) 
			return true; 

		//If not return false; 
		return false; 
	} 


	/** 
	 * checks whether string is an operator ('^', '*', '/', '+', '-') 
	 * @param ch - the character to check 
	 * @return is an operand
	 */ 
	public boolean isOperator(Character ch) 
	{ 
		//parse through the operators[] array 
		for(int i = 0; i < MAX_OPERATORS; i++) 
			//compare ch to the current char at index i 
			if(ch.charValue() == operators[i]) 
				return true; 

		//if they don't match return false
		return false; 
	}
	
	/** 
	   * calculates the precedence of an operator 
	   * @param ch - the operator to check 
	   * @return precedence of ch 
	  */ 
	  public int getPrecedence(Character ch) 
	 { 
		  for(int i = 0; i < MAX_OPERATORS; i++)
			  //if ch matches the current char in operators[i] 
			  if(ch.charValue() == operators[i]) 
				  //return its precedence. 
				  return MAX_OPERATORS-i; 

		  //if no match was found return -1. 
		  return -1; 
	 } 
}