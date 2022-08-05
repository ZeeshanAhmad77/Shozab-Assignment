package qwer;

class BiCycle
{
     String define_me()
    {
    return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle
{
    
	//Constructer of  MotorCycle Class
	
    MotorCycle()
    {
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); 

        System.out.println("My ancestor is a cycle who is "+ temp );
    }
    
    
	String define_me()
    {
        return "a cycle with an engine.";
    }
    
    
}






 class ques6 {

	public static void main(String[] args)
	{

				MotorCycle obj1=new MotorCycle();

	}

}
