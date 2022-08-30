package sample;

import java.util.Scanner;

public class Coupon {

	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cart amount: ");
		double i=sc.nextDouble();
		sc.close();
		if(i<999) 
			System.out.println("coupon Applied!");
		else
			throw new RewardNotApplicableException();
	}
}
