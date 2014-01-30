/*
 * 29/01/2014
 * */
public class FibonacciIterative {
	public static long fib(int n) {
                long prev1=0, prev2=1;
                for(int i=0; i<n; i++) {
                    long savePrev1 = prev1;
                    prev1 = prev2;
                    prev2 = savePrev1 + prev2;
                }
                return prev1;
	}
	public static void main(String[] args) {
			System.out.print(fib(60)+"\n");
	}
}
