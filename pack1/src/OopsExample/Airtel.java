package OopsExample;

//Airtel.java
public class Airtel implements SIM{

	@Override
	public void call() {
		System.out.println("calling from airtel sim card");
	}
	
	@Override
	public void sms() {
		System.out.println("sending sms from airtel sim");
	}
	
	@Override
	public void videoCall() {
		System.out.println("video calling using airtel");
	}
}
