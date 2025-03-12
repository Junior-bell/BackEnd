package pack1;

public class ThisConstructor {

	String name;
	ThisConstructor()
	{
		this("Abdul Kalam Azad");//this constructor call
	    this.display();// this keyword 
	}
	ThisConstructor(String name)
	{
		this.name=name;
	}
	void display() {
		System.out.println("person name is : "+name);
	}
	public static void main(String[] args) {
		ThisConstructor th=new ThisConstructor();
		//creating object with default constructor
	}
}
