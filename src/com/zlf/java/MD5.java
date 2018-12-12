package com.zlf.java;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5�����㷨 MessageDigest ��ΪӦ�ó����ṩ��ϢժҪ�㷨�Ĺ��ܣ��� MD5 �� SHA �㷨��
 * ��ϢժҪ�ǰ�ȫ�ĵ����ϣ�����������������С�����ݣ�������̶����ȵĹ�ϣֵ��
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
		MessageDigest mdTemp = MessageDigest.getInstance("MD5");// ʵ��������ʼ��������
		// �ö���ͨ��ʹ�� update �����������ݡ��κ�ʱ�򶼿��Ե��� reset ��������ժҪ��
		mdTemp.update(b);
		// һ��������Ҫ���µ����ݶ��Ѿ��������ˣ�Ӧ�õ��� digest ����֮һ��ɹ�ϣ���㡣
		byte[] by = mdTemp.digest();
		int j = by.length;
		System.out.println("by�ĳ���"+j);
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
