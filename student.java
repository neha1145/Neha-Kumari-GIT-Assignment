package practice;
import java.util.Scanner;


public class student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll number:");
		int roll = sc.nextInt();
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Enter the fees:");
		double fee = sc.nextDouble();
		System.out.println("Roll no.: "+ roll + "\nName:" + name + "\nfee:" + fee);
		sc.close();
	}

}
