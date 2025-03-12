package pack1;

import java.io.Serializable;

public class ClassA implements Serializable
{
	static final Long serialVersionUID=1L;
	transient int a=10;
	int b=20;
}