package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("PurchaseService")
public class PurchaseOrderImpl implements IpurchaseOrder {

	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@Override
	public String purchase(String[] items, double[] prices, String[] emails) throws Exception {
	//calculate the bill amount
		double billAmt=0.0;
		for(double p:prices)
		{
			billAmt=billAmt+p;
			String msg=Arrays.toString(items)+" with prices "+Arrays.toString(prices)+" are purhchased with BillAmount "+billAmt;
			//send mail
			String status=sendMail(msg,emails);
			return msg="--->"+status;
		}
		return null;
	}
	
	private String sendMail(String msg,String[] toEmails) throws Exception
	{
		MimeMessage message=sender.createMimeMessage();//Empty email msg
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		helper.setFrom(fromEmail);
		helper.setCc(toEmails);
		helper.setSubject("open it to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		//getting exceptions while sending attachments
		//helper.addAttachment("CV_2021-08-23-013651.pdf\"",new ClassPathResource("\"C:\\Users\\Shivam\\Downloads\\CV_2021-08-23-013651.pdf\""));
		sender.send(message);
		return "mail sent";
	}
}
