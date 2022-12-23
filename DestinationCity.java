package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {

	public static void main(String[] args) {

		ArrayList<List<String>> listOfCities=new ArrayList<List<String>>();
		
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		List<String> l4 = new ArrayList<String>();
		
		l2.add("B");
		l2.add("C");
		
		l3.add("D");
		l3.add("B");
		
		l4.add("C");
		l4.add("A");
		
		listOfCities.add(l2);
		listOfCities.add(l3);
		listOfCities.add(l4);
		
		DestinationCity dc = new DestinationCity();
		
		System.out.println(dc.destCity(listOfCities));

	}
	
	public String destCity(ArrayList<List<String>> paths) {
		String destCity = null;
		
		HashMap<String, String> cityMap = new HashMap<String, String>();
		HashSet<String> citySet = new HashSet<String>();
		
		for(List<String> ls : paths) {
			String from = ls.get(0);
			String to = ls.get(1);
			cityMap.put(from, to);
			citySet.add(from);
			citySet.add(to);
		}
		
		for(String city : citySet) {
			String currentCity = city;
			
			while(cityMap.containsKey(currentCity)) {
				currentCity = cityMap.get(currentCity);
			}
			destCity = currentCity;
		}
		
		
		
		return destCity;
	}

}
