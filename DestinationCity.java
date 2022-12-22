package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> listOfCities=new ArrayList<ArrayList<String>>();
		
		ArrayList<String> l2 = new ArrayList<String>();
		ArrayList<String> l3 = new ArrayList<String>();
		ArrayList<String> l4 = new ArrayList<String>();
		ArrayList<String> l5 = new ArrayList<String>();
		ArrayList<String> l6 = new ArrayList<String>();
		
		l2.add("A");
		l2.add("B");
		
		l3.add("B");
		l3.add("C");
		
		l4.add("C");
		l4.add("F");
		
		l5.add("F");
		l5.add("U");
		
		l6.add("U");
		l6.add("G");
		
		listOfCities.add(l2);
		listOfCities.add(l3);
		listOfCities.add(l4);
		listOfCities.add(l5);
		listOfCities.add(l6);
		
		DestinationCity dc = new DestinationCity();
		
		System.out.println(dc.destCity(listOfCities));

	}
	
	public String destCity(ArrayList<ArrayList<String>> paths) {
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
