package pack1;

import java.util.Arrays;

//program to understand array
public class Array1 {
	void meth1() throws ArrayIndexOutOfBoundsException
	{
      System.out.println("Implementing array");
      int arr1[];
      arr1=new int[5];
      int arr2[]=new int[4];
      int arr3[]= {100,200,300};
      int arr4[]=new int[] {11,22,33,44,55,66};
   
      
      
      String s="java";
      System.out.println("arr1 length :"+arr1.length);
      System.out.println("arr2 length :"+arr2.length);
      System.out.println("arr3 length :"+arr3.length);
      System.out.println("arr4 length :"+arr4.length);
      System.out.println("--------------------------");
      System.out.println("length of String s :"+s.length());
      System.out.println("--------------------------");
    //converting arrays into string
      System.out.println("arr1 :"+Arrays.toString(arr1));
      System.out.println("arr1 :"+Arrays.toString(arr2));
      System.out.println("arr1 :"+Arrays.toString(arr3));
      System.out.println("arr1 :"+Arrays.toString(arr4));
      System.out.println("----------------------");
      arr1[0]=25;
      arr1[3]=45;
      System.out.println("arr1 : "+Arrays.toString(arr1));
      System.out.println(arr1[3]);
      System.out.println(arr1[arr1.length-1]);
      System.out.println(arr3[arr3.length-1]);
      System.out.println(arr2[arr2.length-1]);
      System.out.println(arr4[arr4.length/2]);
      System.out.println(arr4[arr4.length-1]);
      System.out.println("retrieving the data from the array by using for loop");
      for(int i=0;i<=arr4.length-1;i++)
    	  System.out.println(arr4[i]);
      System.out.println("\n");
      System.out.println("retrieving data from array in reverse direction");
      for(int i=arr4.length-1;i>=0;i--)
    	  System.out.println(arr4[i]);
      System.out.println("\n");
      System.out.println("retrieving the data using for-each loop");
      for(int x:arr4)
    	  System.out.print(x+" ");
      }
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException 
	{
		new Array1().meth1();
	}
}
