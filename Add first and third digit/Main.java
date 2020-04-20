import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner ob = new Scanner(System.in);
      int num1 = ob.nextInt();
      int sum = (num1/100)+(num1%10);
      System.out.println(sum);
	}
}