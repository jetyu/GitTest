package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {

		List<String> mallNameList = new ArrayList<String>();
		mallNameList.add("天猫");
		mallNameList.add("京东");
		mallNameList.add("苏宁易购");
		
	    mallNameList.forEach(str -> System.out.println(str));
	

		HashMap<String, List<String>> mallNolist = new HashMap<>();
		mallNolist.put("电商", mallNameList);
		mallNolist.forEach((key,value) -> System.out.println(key + "--->"+value));
		
		
		
	}

}
