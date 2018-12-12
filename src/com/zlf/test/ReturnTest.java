package com.zlf.test;

public class ReturnTest {
public static void main(String[] args) {
System.out.println(test(5));	
}



public static String test(int i){
	for (int j = 0; j < i; j++) {
		System.out.println("**********j="+j+"************");
		if(j==1){
			return "中断了for循环，从j=1处跳出";
		}
	}
	return "bb";
}
}
