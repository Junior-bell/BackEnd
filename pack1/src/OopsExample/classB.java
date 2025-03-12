package OopsExample;

import java.util.Scanner;
//program to understand encapsulation
public class classB {
 
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		classA aobj=new classA();
		System.out.println("what is your name");
		String name=sc.next();
		aobj.setEmpName(name);
		System.out.println("Enter your ID");
		int id=sc.nextInt();
		aobj.setEmpId(id);
		System.out.println("Enter your department");
		String dept=sc.next();
		aobj.setEmpDept(dept);
		System.out.println("details entered by user");
		System.out.println("Employee name :"+aobj.getEmpName());
		System.out.println("Employee Id :"+aobj.getEmpId());
		System.out.println("Employee Department :"+aobj.getEmpDept());
		
	}
	public static void main(String[] args) {
		classB bobj=new classB();
		bobj.meth1();
	}
}
