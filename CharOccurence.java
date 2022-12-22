package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CharOccurence {
	
	public static void main(String args[]) {
	
	String name = "abccddssaaccba";
	
	CharOccurence sa = new CharOccurence();
	
	boolean result = sa.areOccurrencesEqual(name);
	
	if(result == true) {
		System.out.println("All character occurences are same");
	}
	else {
		System.out.println("All character occurences are not same");
	}
}
	
	public boolean areOccurrencesEqual(String s) {
		boolean result = true;
		int count = 0;
		char ch;
		HashMap<Character, Integer> charOccrnc = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++) {
			ch = s.charAt(i);
			if(charOccrnc.containsKey(ch)) {
				count = charOccrnc.get(ch);
				count++;
				charOccrnc.replace(ch, count);
			}
			else {
				charOccrnc.put(ch, 1);
			}
		}
		
		Collection<Integer> values = charOccrnc.values();
		
		ArrayList<Integer> listOfValues = new ArrayList<>(values);
		
		int firstValue = listOfValues.get(0);
		
		for(int i=0;i<listOfValues.size();i++) {
			
			if(firstValue != listOfValues.get(i)) {
				result = false;
			}
		
		}
		
		return result;
	}
}