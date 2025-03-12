package OopsExample;

//SIM.java
public interface SIM {

	public abstract void call();
	public abstract void sms();
	
	public default void videoCall() {
		System.out.println("video calling from SIM interface");
	}
}
