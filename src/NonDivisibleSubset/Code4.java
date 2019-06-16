package NonDivisibleSubset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();

		Map<Integer, Integer> remainders = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int remainder = in.nextInt() % k;
			remainders.compute(remainder, (key, value) -> (value == null || key == 0) ? 1 : (value + 1));
		}

		int noOfElementsInSubset = remainders.getOrDefault(0, 0);
		int i = 1;
		for(; 2 * i < k; i++) {
			noOfElementsInSubset += Math.max(remainders.getOrDefault(i, 0), remainders.getOrDefault(k - i, 0));
		}

		if(2 * i == k) {
			noOfElementsInSubset++;
		}
		
		System.out.println(noOfElementsInSubset);
		
		in.close();
	}
}