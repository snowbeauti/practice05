package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m1 = new Member("jws", "정우성", 50000);
		Member m2 = new Member("yjs", "유재석", 30000);
		Member m3 = new Member("ihr", "이효리", 40000);
		
		m1.showInf();
		m2.showInf();
		m3.showInf();

		
	}

}
