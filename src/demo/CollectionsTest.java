package demo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("2淘宝");
		list.add("1京东");
		
		Collections.sort(list);
		Collections.reverse(list);
	
		for (String string : list) {
			System.out.println(string);
		}
	}

}
