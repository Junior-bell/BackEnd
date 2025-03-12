package Prep;

public class CheckIfgivenletterCapitalOrSmall {

	
	public static void main(String[] args) {
		//CheckIfgivenletterCapitalOrSmall check=new CheckIfgivenletterCapitalOrSmall();
		System.out.println("checking for upper case character ");
		char kal='k';
		System.out.println("Character : "+kal);
		if(Character.isUpperCase(kal))
			System.out.println("Character is in uppercase");
		else
			System.out.println("character "+kal+" is smallercase");
	}
}
