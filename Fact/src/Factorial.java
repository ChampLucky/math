import java.util.*;



public class Factorial {

	public static void main(String[] args) {
		
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;//calculating factorial
		}
		System.out.println("factorial of "+n+" is : "+fact);

	}

}
