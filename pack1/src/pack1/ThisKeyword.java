package pack1;

public class ThisKeyword {
 
	int x=10;
	static int y=20;
	void meth1() {
		int x=100;//local variable
		int y=200;
		System.out.println("instance variable "+this.x);
		System.out.println("static variable "+ThisKeyword.y);
		//Not required to use this keyword for 
		//static variable directly with help of class name
	System.out.println("local variable "+x);
	System.out.println("local variable "+y);
	}
	
	public ThisKeyword meth2() {
		System.out.println("i am returning class");
		return this;
	}
	public static void main(String[] args) {
		
		ThisKeyword aobj=new ThisKeyword();
		aobj.meth1();
		aobj.meth2();
	}
	 
}
