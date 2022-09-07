package day2.assignment;

public class Fibonacci {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		for (int i=0;i<8;i++) {
			int  c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}