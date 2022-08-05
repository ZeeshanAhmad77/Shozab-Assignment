package qwer;

class Operation{
	protected String reverseAlphbet="";
	protected String FinalString="";
	protected String inputString;
	protected int counter=0;
	
	public String rev () 
	{
		int lengthOfString = inputString.length();
		
		for(int i=lengthOfString-1; i>=0; i--)
		{
			if(inputString.charAt(i)=='*')
			{
				
				continue;
			}
			reverseAlphbet = reverseAlphbet +inputString.charAt(i);
		}
		
		for(int i=0; i<lengthOfString; i++) 
		{
			if(inputString.charAt(i)=='*')
			{
				FinalString = FinalString+'*';
				continue;
			}
			
			FinalString = FinalString +reverseAlphbet.charAt(counter);
			counter++;
		}
		return FinalString;
	}
	
	
	
}



class Operator extends Operation{
	void reverse (String s) {
		inputString = s;
	}
}


public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This program is to reverse string without changing position of asterik.
				Operator obcounter = new Operator();
				obcounter.reverse("ABC**bca*");
				System.out.println("Reverse string is "+obcounter.rev());

	}

}
