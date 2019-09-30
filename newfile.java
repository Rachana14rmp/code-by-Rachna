import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String name;
		int a,b,c,d,e,f;
		double average;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name");
		name=input.nextLine();
		System.out.println("Enter your marks of all the six subjects:");
a=input.nextInt();
b=input.nextInt();
c=input.nextInt();
d=input.nextInt();
e=input.nextInt();
f=input.nextInt();
input.close();
average=(double)(a+b+c+d+e+f)/6;
System.out.println("Your average is:"+average);
	}
}
