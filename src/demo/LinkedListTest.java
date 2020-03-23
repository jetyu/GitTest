package demo;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
	 LinkedList<String> list = new LinkedList<String>();
	 list.add("200");
	 list.add("TETS");
	 
	 list.offer("offer");
	 list.push("push");
	 list.offerFirst("OfferFirst");
		
	  for (String string : list) {
		System.out.println(string);
	}
		
	}

}
