package com.wabao.generator;

import java.io.File;

public class test {

	public static void main(String[] args) {
		System.out.println(File.separator);
		System.out.println("com.test.app".replaceAll("\\.", "\\\\"));
	}

}
