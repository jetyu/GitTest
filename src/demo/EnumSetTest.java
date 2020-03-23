package demo;

import java.util.EnumSet;

public class EnumSetTest {

	public static void main(String[] args) {
		// 用元素对象的类型来初始化一个EnumSet集合，即Season.class
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println("es1: " + es1);

		// 初始化一个空的EnumSet集合
		EnumSet es2 = EnumSet.noneOf(Season.class);
		es2.add(Season.SUMMER);
		es2.add(Season.SPRING);
		es2.add(Season.WINTER);
		System.out.println("es2: " + es2);

		// 初始化一个带参数的EnumSet集合
		EnumSet es3 = EnumSet.of(Season.WINTER, Season.SPRING, Season.SUMMER);
		System.out.println("es3: " + es3);

		// 初始化一个从第一个元素到最后一个元素的集合, 不能从枚举中最后一个到第一个。
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println("es4: " + es4);

		// 初始化一个集合中剩下的元素
		EnumSet es5 = EnumSet.complementOf(es2);
		System.out.println("es5: " + es5);

	}

}
