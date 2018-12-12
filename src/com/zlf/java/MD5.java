package com.zlf.java;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密算法 MessageDigest 类为应用程序提供信息摘要算法的功能，如 MD5 或 SHA 算法。
 * 信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。
 * 
 * @author Administrator
 * 
 */
public class MD5 {

	public static String MD5(String s) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		byte[] b = s.getBytes("GBK");
		MessageDigest mdTemp = MessageDigest.getInstance("MD5");// 实例化（初始化）对象
		// 该对象通过使用 update 方法处理数据。任何时候都可以调用 reset 方法重置摘要。
		mdTemp.update(b);
		// 一旦所有需要更新的数据都已经被更新了，应该调用 digest 方法之一完成哈希计算。
		byte[] by = mdTemp.digest();
		int j = by.length;
		System.out.println("by的长度"+j);
		char[] str = new char[j * 2];
		int k = 0;
		for (int i = 0; i < j; i++) {
			byte byte0 = by[i];
			System.out.println(byte0);
			str[k++] = hexDigits[byte0 >>> 4 & 0xf];
			str[k++] = hexDigits[byte0 & 0xf];
		}
		return new String(str);

	}
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println(MD5("zhanglife"));
	}
}
