package ThredDemo;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("Enter 3 numbers ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else if (c > a && c > b) {
			System.out.println(c);
		}
	}

}
