import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner ob = new Scanner(System.in);
      int n = ob.nextInt();
      if(n<10 && n>-10)
      {
        System.out.println(-1);
      }
      n/=10;
      System.out.println(n%10);
	}
}