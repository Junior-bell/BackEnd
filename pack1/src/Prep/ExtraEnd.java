package Prep;

public class ExtraEnd {

	public String extraend(String str)
	{
		String s=str.substring(str.length()-2);
		return s+s+s;
	}
	public static void main(String[] args) {
		ExtraEnd ed=new ExtraEnd();
		String result=ed.extraend("java");
		System.out.println(result);
	}
}
