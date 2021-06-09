package com.cyient.helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		output1 obj=new output1();
		int a =10;
		int b=20;
		obj.meth(a,b);
		System.out.println(a +" "+b);
	
	}
	

}
 class output1{
	int a,b;
	void meth(int i ,int j) {
		i++;
		j++;
	}
	
}



