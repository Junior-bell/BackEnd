package Prep;

public class firsttwo {

	public String Firsttwo(String str)
	{
		if(str.length()>=2)
		return str.substring(0,2);
		return str;
	}
	public static void main(String[] args) {
		firsttwo ft=new firsttwo();
      		String result=ft.Firsttwo("xi");
      		System.out.println(result);
	}
}
