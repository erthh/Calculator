import java.util.*;


public class Calculator {
		public static void main(String [] args){
			
			
			Scanner input =new Scanner(System.in);
			
			
			System.out.println("Push Pull dai la sard");
			
			System.out.println("Num1 : ");
			int a = input.nextInt();
			System.out.println("Num2 : ");
			int b = input.nextInt();
			
			System.out.println("A+b =  ");
			System.out.println(plus(a,b));
			
			
		}
		public static double plus(int x , int y){
			return x+y;
		}
		public static double minus(int x , int y){
			return x-y;
		}
		public static double multiply(int x , int y){
			return x*y;
		}
		
}
