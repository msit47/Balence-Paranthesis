import java.util.Scanner;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean value=false;
		Stack st=new Stack();
		String par="{[()]}";
		String par2="{(([])}";
		st.initializestack(par);
	    boolean value=st.balenceparanthesis(par);
			if (value==true)
				System.out.println("Paranthesis is balenced");
			else
				System.out.println("Paranthesis is unbalenced");
			boolean value2=st.balenceparanthesis(par2);
			if (value2==true)
				System.out.println("Paranthesis is balenced");
			else
				System.out.println("Paranthesis is unbalenced");
		//Input from keyboard
			/*
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String which you would like to balence");
			while(sc.hasNextLine())
			{
				String strkb = sc.nextLine();
				boolean value3=st.balenceparanthesis(strkb);
				if (value3==true) 
					System.out.println("Paranthesis is balenced");
				else
					System.out.println("Paranthesis is unbalenced");
				
				
			}
			*/

	}

}
