package com.nt.test;

import com.nt.service.Arithmetic;

public class LAMDATest {
  public static void main(String[] args) {
	//style1
   Arithmetic ar=(int a, int b)->{
		  int c=a+b;
		  return c;
	  };
	  System.out.println("sum::"+ar.add(10,20));
	  
	/* Arithmetic ar=(int a,int b)->a+b;
	   System.out.println("sum::"+ar.add(10,20));*/
	 
	 /* Arithmetic ar=(a,b)->a+b;
	   System.out.println("sum::"+ar.add(10,20));*/
	   
	  /* Arithmetic ar=(x,y)->x+y;
	   System.out.println("sum::"+ar.add(10,20));*/
}
}
