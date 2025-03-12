package pack1;

public class StringA
{
	void meth1() {
		String s1="java";
		String s2=new String("java");
		char arr[]= {'J','A','V','A'};
		String s3=new String(arr);
		String s4=new String(arr,2,2);
		System.out.println("-------------");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println("-------------");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		System.out.println("Hello".length());
		System.out.println("--------------");
		
	}
	void meth2()
	{
		System.out.println("String which are created by using string class are immutable");
		String s="java";
		System.out.println("before concatination :"+s);
		System.out.println(s.concat(" is awesome"));
		System.out.println("after concatination : "+s);
		
	}
	void meth3()
	{
		System.out.println("meth3() called");
		String msg="java";
		System.out.println("msg :"+msg);
		System.out.println(msg.concat(" is object oriented programming language "));
		System.out.println("msg :"+msg);
	}
	public static void main(String[] args) {
		StringA aobj=new StringA();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
	}
}