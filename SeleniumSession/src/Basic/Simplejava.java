package Basic;

import java.util.Scanner;

import org.openqa.selenium.interactions.Actions;

public class Simplejava {
static boolean c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean c=IsNumberTwoDigit();
		System.out.println(c);
		
	}
public static boolean IsNumberTwoDigit() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	if(n>=10&&n<=100) {
		System.out.println("number is two digit");
		return true;
	}
	else {
		System.out.println("invalid");
	}
	return false;
}
}
