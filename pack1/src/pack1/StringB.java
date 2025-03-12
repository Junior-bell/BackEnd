package pack1;

public class StringB {

	void meth1()
	{
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4=new String("java");
		System.out.println("Using equals method of object class");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("java".equals(s4));
		System.out.println("java".equalsIgnoreCase(s4));
		System.out.println("Java".equals("java"));
		System.out.println("java".equalsIgnoreCase("jAvA"));
	    System.out.println(s3.equals("Java"));
	    System.out.println("Java".equals(new String("java")));
	    System.out.println(s2.equals(s4)+"\n");
	}
	public static void main(String[] args) {
		StringB sb=new StringB();
		sb.meth1();
	}
}
