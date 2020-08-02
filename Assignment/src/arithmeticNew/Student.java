package arithmeticNew;

public class Student {	
	int age;
	int roll_no;
	
	public void display(){
		
	 System.out.println("printmethod1");
	}
	
    public void display2(){
		
	 System.out.println("printmethod2");
	}
	
	

	public static void main(String[] args) {
		Student Deepak =new Student();
		Deepak.age=28;
		Deepak.roll_no =1245;
		System.out.println(Deepak.age);
        System.out.println(Deepak.roll_no);
        Deepak.display();
        Deepak.display2();
        
        
        
		
				
	}

}
