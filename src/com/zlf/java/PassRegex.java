package com.zlf.java;

public class PassRegex {
public static void main(String[] args) {
	String reg="/(?!^[0-9]+$)(?!^[A-z]+$)(?!^[^A-z0-9]+$)^.{8,16}$/";
	
}
}
