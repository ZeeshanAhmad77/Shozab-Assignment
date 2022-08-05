package qwer;

 class Animal{
	   protected String name;
	   protected int age;
	   
	   
	   public void setValue(String name, int age) 
	   {
		   this.name= name;
		   this.age=age;
	   }
   }
   
   class Zebra extends Animal{
	   public void DisplayMessage()
	   {
		   System.out.println("The Zebra Name is " + name);
		   System.out.println("The Zebra Age is " + age);
		   System.out.println("The origin of Zebra is Austrailia");
	   }
   }
	   
    class Dolphin extends Animal{
		   public void DisplayMessage() {
			   System.out.println("The Dolphin Name is " + name);
			   System.out.println("The Dolphin Age is " + age);
			   System.out.println("The origin of Dolphin is Dark Blue Sea");
		   }
    }
	class Inheritance 
	{
      void main(String[] args)
	  {
		
		Zebra zebra= new Zebra();
		Dolphin dolphin=  new Dolphin();
		zebra.setValue ("zebi",7);
		dolphin.setValue ("dolphin",18);
		zebra.DisplayMessage() ;
		dolphin.DisplayMessage() ;
	  }
   }
