package br.com.vin.MethodWithReturn;

public class Quadrilatero {

		public static double area(double side) {
			
			return side * side;
		}
		
		public static  double area(double side1, double side2) {
			
			return side1 * side2;
		}
		
		public static double area(double biggerBase, double lesserBase, double height) {
			
			return ((biggerBase+lesserBase)*height)/2;
		}
}


