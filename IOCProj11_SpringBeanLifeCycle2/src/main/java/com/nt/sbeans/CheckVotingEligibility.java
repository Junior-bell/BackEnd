package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/nt/commons/Info.properties")
public class CheckVotingEligibility {

	@Value("${voter.id}")
	private Integer id;
	
	@Value("${voter.name}")
	private String name;
	
	@Value("${voter.age}")
	private Integer age;
	
	private Date verifiedOn;
	
	public CheckVotingEligibility() {
		System.out.println("CheckVotingEligibility::0-param constructor()");
	}
	@PostConstruct //init life cycle method
	public void myInit() {
		System.out.println("CheckVotingEligibility.myInit()");
		//initialize the leftover properties
		verifiedOn=new Date();
		//validation logics
		if(name==null || age<=0)
		{
			throw new IllegalArgumentException("set correct values to name,age properties");
		}
	}
	
	//business method
	public String checkEligibility()
	{
		System.out.println("CheckVotingEligibility.checkEligibility()");
		if(age>18)
		return "Mr/miss/Mrs "+name+" u r eligible for the voting +verifiedOn:::"+verifiedOn;
		else
		{
			return "Mr/miss/Mrs"+name+"u r not eligible for the voting +verifiedOn:::"+verifiedOn;

		}
	}
	@PreDestroy //destroy life cycle method
	public void myDestroy() {
		System.out.println("CheckVotingEligibility.myDestroy()");
		name=null;
		age=null;
		verifiedOn=null;
		id=null;
		
	}
}

