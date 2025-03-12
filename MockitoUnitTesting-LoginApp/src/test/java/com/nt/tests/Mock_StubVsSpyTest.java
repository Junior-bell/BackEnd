package com.nt.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Mock_StubVsSpyTest {

	@Test
	public void testList()
	{
		List<String> listMock=Mockito.mock(ArrayList.class);//Mock
		List<String> ListSpy=Mockito.spy(new ArrayList<String>());//spy or
		//List<String> ListSpy1=Mockito.spy(new ArrayList<String>());
		
		listMock.add("table");
		Mockito.when(listMock.size()).thenReturn(10);
		
		ListSpy.add("table");
		Mockito.when(ListSpy.size()).thenReturn(10);
		
		//test the size method
		
		System.out.println(listMock.size()+" "+ListSpy.size());
	}
}
