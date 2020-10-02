import java.lang.Math;
import java.util.Scanner;

public class SolveEquations{
	public static void eq(double a, double b, double c){
		double discriminant = Math.sqrt(b*b-(4*a*c));
		double x1,x2;
		if(discriminant > 0){
			x1 = (-b+discriminant)/(2*a);
			x2 = (-b-discriminant)/(2*a);
			System.out.println("There are two solutions for x:  " + x1 + ", " + x2);
			
		} else if(discriminant == 0){
			x1 = -b/2*a;
			System.out.println("Only one solution for x: " + x1);
		} else {
			System.out.println("Since d<0, there is no solution");
		}
	}
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in a, b and c to get solution for quadratic equation");
		Double a = keyboard.nextDouble();
		Double b = keyboard.nextDouble();
		Double c = keyboard.nextDouble();
		eq(a,b,c);
	}
}