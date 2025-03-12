package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prn")
@Scope("prototype")
public class Printer {
  private static Printer Instance;
  
  //private constructor
  private Printer()
  {
	  System.out.println("Printer::0-param constructor");
  }
  
  //static factory method having singleton Logic
  public static Printer getInstace()
  {
	  if(Instance==null)
		Instance=new Printer();
	  return Instance;
  }
  //business method
  public void PrintMessage(String msg)
  {
	  System.out.println(msg);
  }
}
