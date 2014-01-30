import java.util.ArrayList;
import java.util.List;

public class FibonacciMemoized {
	private static List<Long> fibCache = new ArrayList<Long>();
	static {
		fibCache.add(0L);
		fibCache.add(1L);
	}
	
	public static Long fib(int n) {
		if (n >= fibCache.size()) {
			fibCache.add(n, fib(n - 1) + fib(n - 2));
		}
		return fibCache.get(n);
	}
	public static void main(String[] args) {
			System.out.print(fib(60)+"\n");
	}
}
