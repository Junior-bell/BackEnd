package Prep;

public class SalaryIncrement {

	void meth1(int salary,int years_of_service)
	{
		int bonus=(salary*5)/100;
		int new_Sal=salary+bonus;
		if(years_of_service>=5)
		{
			System.out.println("congratulations for your 5 years of service");
			System.out.println("Bonus Amount : "+bonus);
			System.out.println("updated salary "+new_Sal);
		}
		else
		{
			System.out.println("salary not updated "+salary);
		}
	}
	public static void main(String[] args) {
		SalaryIncrement s=new SalaryIncrement();
		s.meth1(50000, 5);
	}
}
