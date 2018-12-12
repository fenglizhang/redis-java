package com.zlf.java;

public class DefaultPath {
public static void main(String[] args) {
	//默认临时文件存储路径
	System.out.println(System.getProperty("java.io.tmpdir"));
	//用户的主目录
	System.out.println(System.getProperty("user.home"));
	//当前用户的工作目录：那盘那个文件夹下的啥工程名
	System.out.println(System.getProperty("user.dir"));

}
}
