package pack1;

public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void ThreadStatus()
    {
    	System.out.println("Thread is running");
    }
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
        Thread t2=new Thread(MethodReference::ThreadStatus);
        t2.start();
    }  
}  