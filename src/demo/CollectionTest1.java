package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionTest1 {

	public static void main(String[] args) {
		
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("元素1");
		arrayList.add(20);
		arrayList.add(34.1);
		System.out.println("arraylist的元素个数为：" + arrayList.size()  + "   Arraylist内容：" + arrayList);
		
		arrayList.forEach(obj -> System.out.println("Lambda表达式的遍历方法：arraylist: " + obj));
		
		//hashset方法
		HashSet<String> hs = new HashSet<String>();
		hs.add("数学");
		hs.add("语文");
		hs.add("英语");
		System.out.println("hashset的个数为:" + hs.size() + " hashset内容：" + hs);
		
		//遍历方法
		
		hs.forEach(obj -> System.out.println("Lambda表达式的遍历方法：hashset: " + obj));
		
		//treeset方法
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add("IBJ");
		ts.add("qwe");
		ts.add("WSE");
		ts.add("DFS");
		
		System.out.println(ts);
		
		
		
	}

}
