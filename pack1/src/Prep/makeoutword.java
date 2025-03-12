package Prep;

public class makeoutword {

	public String makeOutWord(String out,String word)
	{
		return out.substring(0,2)+word+out.substring(2);
	}
	public static void main(String[] args) {
		makeoutword ot=new makeoutword();
	String result=ot.makeOutWord("<<>>", "Java");
		System.out.println(result);//<<Java>>
	}
}
