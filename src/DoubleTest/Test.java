package DoubleTest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Test {
//	public static void main(String[] args) {
//		Double d = 123456789.1234540000;
//		DecimalFormat df = new DecimalFormat("###0.0####");//最多保留几位小数，就用几个#，最少位就用0来确定  
//		String s=df.format(d); 
//		System.out.println(s);
//
//	}
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("zhanglf");
		list.add("xiaopang");
		list.add("wangjw");
		list.add("yulh");
		
		int indexOf = list.indexOf("wangjw");
		System.out.println(indexOf);
		
	}
}
