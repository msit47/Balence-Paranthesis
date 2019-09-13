
public class Stack {
 private char data[];
 private int top;
 /*initializing the stack with the string length*/
 public void initializestack(String str)
 {
	 int length=str.length();
	 data=new char[length];
 }
 /*pushing the elements in the array*/
 public void push(char c)
 {
	 if(top==data.length-1)
		 throw new RuntimeException("Stack is Full");
	 data[++top]=c;
 }
 public char pop()
 {
	 if(top<0)
		 throw new RuntimeException("Stack is Empty");
	 char d = data[top--];
	 return d;
 }
 public boolean balenceparanthesis(String str2)
 {
	 boolean expr=false;
	 //odd length string is unbalenced
	 if(str2.length()%2!=0)
	 {
		 return false;
	 }
	 /*empty string is always balenced*/
	 if(str2.length()==0)
		 return true;
	 /*iterating through the string*/
	 for(int i=0;i<str2.length();i++)
	 {
		// push(str2.charAt(i));
		 char p=str2.charAt(i);
		 if(p=='{'||p=='['||p=='(')
		 {
			 push(p);
		 }
		 else if(p=='}'||p==']'||p==')')
		 {
			 char popele=pop();
			 if(p==')'&& popele=='(')//(popele==']'||popele=='}'))
               expr=true;
			 else if(p=='}'&&popele=='{')  //||popele==']'))
				expr=true;
			 else if(p==']'&&popele=='[')//||popele==')'))
				 expr=true;
			 else
				 return false;
          
               
			 
				 
				 
		 }
		
		 
	 }
	  return expr;
 }
}
