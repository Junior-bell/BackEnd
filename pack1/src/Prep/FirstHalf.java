package Prep;

public class FirstHalf {

	public String firsthalf(String str)
	{
		return str.substring(0,str.length()/2);
	}
	public static void main(String[] args) {
		FirstHalf fh=new FirstHalf();
	String result=fh.firsthalf("java");
	System.out.println(result);
		
	}
}
