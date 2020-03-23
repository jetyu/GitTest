package demo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<Object>();
		arrayList.add(12.2);
		arrayList.add("90");
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}
	
	

}
