package Prep;



public class DoubleChar {
 public String doubleChar(String str)
 {
	 String word=" ";
	 for(int i=0;i<=str.length()-1;i++)
		 word=word+str.charAt(i)+str.charAt(i);
		return word;
	 
	 
 }
 public static void main(String[] args) {
	DoubleChar db=new DoubleChar();
	String result=db.doubleChar("Java");
	System.out.println(result);
}
}
