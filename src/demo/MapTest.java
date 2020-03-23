package demo;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(10, "A");
		map.put(11, "B");
		map.put(12, "C");
		map.replace(10, "A", "D");

		for (Object obj : map.keySet()) {

			System.out.println("key:" + obj + " value:" + map.get(obj));

		}
	}

}
