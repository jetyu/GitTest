package demo;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		long t1 = new Date().getTime();
		int res = 0;
		int n = 0;
		for (int i = 0; i < 2000000000; i++) {
		int baseNum = 6;
		n = baseNum * 1346;
			res |= n;
		}
		long t2 = new Date().getTime();
		System.out.println(String.format("time: %d, res: %d", t2 - t1, res));

	}

}
