package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//target class
@Component("pinfo")
@PropertySource(value="com/nt/commons/Info.properties")
public class PersonalInfo 
{
	@Value("${per.id")
  private String pid;
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.addrs}")
	private String addrs;
	
	//injecting direct values to spring properties 
	@Value("9175485595")
    private Long MNo;
	
	//injecting system property values
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version}")
	private String os_version;
	
	//injecting environmental variables;
	
	@Value("${Path}")
	private String path_name;
	
	//To String method
	@Override
	public String toString()
	{
		return "PersonalInfo[pid="+pid+", pname="+pname+", addrs="+addrs+", MobileNo="+MNo+", os_name="+os_name+",os_version="+os_version+",path_data="+path_name+"]"; 
	} 
	

}
