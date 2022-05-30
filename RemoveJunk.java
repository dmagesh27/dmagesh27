package com.JavaPractise;

public class RemoveJunk {

	public static void main(String[] args) {

		String s="%#$^^ 1233 testin#g j@unk";
		s=s.replaceAll("[^a-zA-Z0-9' ']", "");
		System.out.println(s);

	}

}
