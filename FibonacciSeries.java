package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int sum;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<=6; i++)
		{
			sum = a+b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}

}
