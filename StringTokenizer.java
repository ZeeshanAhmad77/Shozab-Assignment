package qwer;

import java.util.*;
 class StringTokenizer {
	
 	 private String inputString;


	 
	 //Defualt constucter
	StringTokenizer()
	 {

	 }
	  //Parameterize constucter
	 StringTokenizer(String inputstring)
	  {
		this.inputString=inputstring;
 
	  }
	 
	 
	 
	   //setter 

	   void setInputString(String input )
	  {
		this.inputString=input;


	  }
	  	   //Getter 

			 String  getInputString( )
			 {
			    return inputString;
	   
	   
			 }
			 
	  int CountToken( )
	  {
				int counter=0;
				int n= inputString.length();
				char[] ch= new char[n];
				for(int i=0;i<n;i++) 
				{
				   ch[i]=inputString.charAt(i);
				   if (ch[i]=='@'|| ch[i]==','||ch[i]==' '|| ch[i]=='*'||ch[i]=='#')
				   {
					   counter++;
				   }
			   }
				return counter;
		}

	
	 static void main(String[] args) {
		
    	
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter any string input");
    	String inputString = myObj.nextLine(); 

    	StringTokenizer stringTokenizer=new StringTokenizer();
    	//calling the setter
		stringTokenizer.setInputString(inputString);
    	
    	int count=stringTokenizer.CountToken();
    	System.out.println("Delimeters counted are " + count);

	}
}
