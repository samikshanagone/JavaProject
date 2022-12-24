package com.github.project;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("samiksha");
	list.add("mayuri");
	list.add("sita");
	list.add("gita");
	
	for(String s:list) {
		System.out.println(s);
	}
}
}
