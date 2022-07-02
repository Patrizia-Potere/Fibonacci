
public class Main {
// Static Method to evaluate fibonacci sequence with parameter
	static void Fibonacci(int fib) {
		int x = 1;
		int y = 0;
		int temp;		//temporary variable to keep x old value
		while (fib>=0) {
			System.out.println(y);
			temp = x;
			x = x+y;
			y = temp;
			fib--;
		}
	}
// Static Method to evaluate fibonacci sequence till 1million
	static void Fibo() {
		int x = 1;
		int fib = 0;
		int temp;		//temporary variable to keep x old value
		while (fib<=1000000) {
			System.out.println(fib);
			temp = x;
			x = x+fib;
			fib = temp;
		}
	}
//	Recursion Method 
	static int Fib(int fib) {
		if (fib<=2) return 1;
		return Fib(fib-1)+Fib(fib-2);
	}	
	
//	Calling methods
	public static void main(String[] args) {
		Fibonacci(5);
		Fibo();
		int result = Fib(6);
		System.out.println(result);
	}
}
