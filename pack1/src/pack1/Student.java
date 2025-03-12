package pack1;

public class Student implements Cloneable
{
  String stuName;
  int stuId;
  public Student(String stuName,int stuId)
  {
	  this.stuName=stuName;//first obj
	  this.stuId=stuId;//2nd obj
  }
  Student show()throws Exception
  {	
	  return (Student)super.clone();
  }
public static void main(String[] args) throws Exception
{
	Student s1=new Student("sudheer", 101);
	Student s2=s1.show();//cloning the s1 instance and assigning it to the s2
	s2.stuId=501;
	System.out.println(s2.stuName+"  "+s2.stuId);
}
}
