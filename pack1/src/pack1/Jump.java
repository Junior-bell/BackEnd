package pack1;

public class Jump {

	void meth1()
	{
		System.out.println("implementing jump statement");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;// will stop the loop 
				continue; // will just skip one iteration i==5
				//return;//will stop the loop
			}
			System.out.println("i value "+i);
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		new Jump().meth1();
		System.out.println("end");
	}
	
}
