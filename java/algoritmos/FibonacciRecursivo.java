/*
 * 29/01/2014
 * */
public class FibonacciRecursivo {
	public static long fib(long n) {
		if (n < 2) { return n;                       } 
		else 	   { return fib(n - 1) + fib(n - 2); }
	}
	public static void main(String[] args) {
			System.out.print(fib(42) + "\n");
	}
}
