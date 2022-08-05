package qwer;

public class RunEncapTest {
	 private String Name;
	 private int Age;
	 private int id;
     RunEncapTest() {
	    this.Name=" ";
	    this.Age=0 ;
	    this.id=0;
       }
     RunEncapTest(String name,int age, int id) {
 	    this.Name=name;
 	    this.Age=age;
 	    this.id=id;
       }
     public String getName(){
    	 System.out.println("Name: " + this.Name);
    	 return this.Name;
     }
     public void setName(String name){
    	 this.Name=name;
     }
     
     public int getAge(){
    	 System.out.println("Age: " + this.Age);
    	 return this.Age;
     }
     public void setAge(int age){
    	 this.Age=age;
     }
     public int getId(){
    	 System.out.println("ID: " + this.id);
    	 return this.id;
     }
     public void setId(int id){
    	 this.id=id;
     }
	public static void main(String[] args) {
		
	RunEncapTest encap = new RunEncapTest();
	encap.setName("Shozab");
	encap.setAge(20);
	encap.setId(123);
	encap.getName();
	encap.getAge();
	encap.getId();
	}

}
