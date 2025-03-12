package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	List<String> lis=new ArrayList<String>();
	public void meth1()
	{
	lis.add("Football");
	lis.add("Cricket");
	 lis.add("Chess");
	 lis.add("Hockey");
	 System.out.println("Iterating by passing by lambda expression");
	 lis.forEach(games->System.out.println(games));
	 
	}
	public static void main(String[] args) {
		      ArrayList1 aobj=new ArrayList1();
		      aobj.meth1();
	}
}
