import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner ob = new Scanner(System.in);
      int side = ob.nextInt();
      int area = side * side;
      System.out.println(area);
	}
}