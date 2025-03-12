package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class ClassC implements Serializable {
	static final Long serialVersionUID=1999999L;
    void Operations1() throws Exception
    {
    	System.out.println("Implementing serialization object stream");
    	ClassA aobj1=new ClassA();
    	ClassB bobj1=new ClassB();
    	System.out.println(aobj1.a+" "+aobj1.b);//classA variables
    	System.out.println(bobj1.x+" "+bobj1.y);//class b Variables
    	System.out.println("-----------------------------");
    	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\core java\\ObjectStream.ser"));
    	System.out.println("connection created");
    	oos.writeObject(aobj1);
    	oos.writeObject(bobj1);
    	System.out.println("serialization is completed");
    	oos.close();
    	
    	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\core java\\ObjectStream.ser"));
    	System.out.println("De-serialization is started");
    	ClassA aobj2=(ClassA)ois.readObject();
    	ClassB bobj2=(ClassB)ois.readObject();
    	System.out.println(aobj2.a+" "+aobj2.b);
    	System.out.println(bobj2.x+" "+bobj2.y);
    }
    public static void main(String[] args) throws Exception {
		new ClassC().Operations1();;
	}
 
}