package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static long calculateNormal(int i) {
		System.out.println("Fib of " + i + ": ");
		return normalHelper(i);
	}

	public static long calculateDP(int i) {
		Map<Integer, Long> memo = new HashMap<>();
		System.out.println("Fib of " + i + ": ");
		return DPHelper(i, memo);
	}

	private static long normalHelper(int i) {
		if (i == 0 || i == 1) {
			return i;
		}

		return normalHelper(i - 1) + normalHelper(i - 2);
	}

	private static long DPHelper(int i, Map<Integer, Long> memo) {
		if (i == 0 || i == 1) {
			return i;
		}

		if (memo.containsKey(i)) {
			return memo.get(i);
		}

		long fib = DPHelper(i - 1, memo) + DPHelper(i - 2, memo);
		memo.put(i, fib);

		return fib;

	}

}
