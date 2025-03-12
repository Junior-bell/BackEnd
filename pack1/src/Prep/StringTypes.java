package Prep;

public class StringTypes {
 void meth1()
 {
	 String s1=new String("java");
	 StringBuffer buffer1=new StringBuffer("Java");
	 StringBuilder builder1=new StringBuilder("Java");
	 System.out.println("-------------Before-----------");
	 System.out.println("String class : "+s1);
	 System.out.println("StringBuffer class "+buffer1);
	 System.out.println("StringBuilder1 class "+builder1+"\n");
	 s1.concat(" is awesome");
	 buffer1.append(" is awesome");
	 builder1.append(" is awesome");
	 
	 System.out.println("----------after-----------");
	 System.out.println("String class : "+s1);
	 System.out.println("StringBuffer class "+buffer1);
	 System.out.println("StringBuilder class "+builder1+"\n");
	 
	 
	 
	 
 }
 void meth2()
 {
	 String s1=new String("java");
	 StringBuffer buffer1=new StringBuffer("Java");
	 StringBuilder builder1=new StringBuilder("Java");
	 String s2=new String("java");
	 StringBuffer buffer2=new StringBuffer("Java");
	 StringBuilder builder2=new StringBuilder("Java");
	 System.out.println("String class "+s1.equals(s2));
	 System.out.println("String buffer class "+buffer1.equals(buffer2));
	 System.out.println("String builder class "+builder1.equals(builder2));
	 System.out.println(s1==s2);
	 System.out.println(buffer1==buffer2);
	 System.out.println(builder1==builder2);
	 System.out.println("comparing the contents present inside string buffer and string builder");
	 System.out.println(buffer1.toString().equals(buffer2.toString()));
	 System.out.println(builder1.toString().equals(builder2.toString()));
 }
  void meth3()
  {
	  System.out.println("meth3() called");
	  StringBuffer sb=new StringBuffer();
	  System.out.println("capacity () : "+sb.capacity());
	  sb.append("abcdefghijklmno");
	  System.out.println("length() : "+sb.length());
	  sb.append("p");
	  System.out.println(sb);
	  sb.append("q");
	  System.out.println(sb);
	  System.out.println("length() : "+sb.length());
	  System.out.println("capacity () : "+sb.capacity());//string buffer have storage capacity of 16
	  //will increase to double after length increases more than 16
	  System.out.println("CharAt() :"+sb.charAt(sb.length()-1));
	  System.out.println(sb.reverse());
	  System.out.println("CharAt() :"+sb.charAt(sb.length()-1));
  }
 public static void main(String[] args) {
	StringTypes st=new StringTypes();
	st.meth1();
	st.meth2();
	st.meth3();
}
}
