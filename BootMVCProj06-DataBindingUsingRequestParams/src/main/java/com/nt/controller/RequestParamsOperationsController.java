package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class RequestParamsOperationsController {
	
	/*	@GetMapping("/data")
		public   String showData(@RequestParam("sno") int no,
				                                      @RequestParam("sname") String name) {
			System.out.println("sno="+no+".... sname="+name);
			return  "show_result";
		}*/
	
	/*	@GetMapping("/data")
		public   String showData(@RequestParam int no,
				                                      @RequestParam String name) {
			System.out.println("sno="+no+".... sname="+name);
			return  "show_result";
		}*/
	
	/*@GetMapping("/data")
	public   String showData(@RequestParam int no,
			                                      @RequestParam(required = false) String name) {
		System.out.println("sno="+no+".... sname="+name);
		return  "show_result";
	}*/
	
	/*@GetMapping("/data")
	public   String showData(@RequestParam int no,
			                                      @RequestParam(defaultValue = "kalki") String name) {
		System.out.println("sno="+no+".... sname="+name);
		return  "show_result";
	}*/
	
	/*	@GetMapping("/data")
		public   String showData(@RequestParam(defaultValue = "1001") int no,
				                                      @RequestParam String name) {
			System.out.println("no="+no+".... name="+name);
			return  "show_result";
		}*/
	
	/*@GetMapping("/data")
	public   String showData(@RequestParam(required = false) Integer no,
			                                      @RequestParam String name) {
		System.out.println("no="+no+".... name="+name);
		return  "show_result";
	}
	*/
	
	/*@GetMapping("/data")
	public   String showData(@RequestParam Integer no,
			                                      @RequestParam String name,
			                                      @RequestParam(name="sadd") String[] addrs,
			                                      @RequestParam(name="sadd") List<String> listAddrs,
			                                      @RequestParam(name="sadd") Set<String> setAddrs ) {
		System.out.println("no="+no+".... name="+name+"..."+Arrays.toString(addrs)+"....."+listAddrs+"...."+setAddrs);
		return  "show_result";
	}*/
	
	
	/*@GetMapping("/data")
	public   String showData(@RequestParam Integer no,
			                                      @RequestParam String name,
			                                      @RequestParam(name="sadd") String sadd ) {
		System.out.println("no="+no+".... name="+name+"..."+sadd);
		return  "show_result";
	}*/
	
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg;
	
	@GetMapping("/data")
	public   String showData(HttpServletRequest req,
			                                      HttpServletResponse  res,
			                                      HttpSession  ses) {
		System.out.println("web application name::"+sc.getContextPath());
		System.out.println("DS logcal name ::"+cg.getServletName());
		System.out.println("request url ::"+req.getRequestURI());
		System.out.println("res obj info ::"+res.getContentType());
		System.out.println("session id ::"+ses.getId());
		
		
		return  "show_result";
	}
	
	

}
