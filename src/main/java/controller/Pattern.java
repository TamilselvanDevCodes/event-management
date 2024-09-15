package controller;

public class Pattern {
	public static void main(String[] args) {
		
	triangle(10);
	}
	static void triangle(int rows) {
		int space=rows;
		int star=1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}
	static void revTriangle(int rows) {
		int space=1;
		int star=rows;
		for(int i=1;i<=rows;i++) {
			for(int k=1;k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			
			
			space++;
			star--;
		}
		
	}
	static void leftTtriangle(int rows) {
		int space=rows;
		int star=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.print(" ");
			space--;
			star++;
		}
		
	}
	static void rightTriangle(int rows) {
		int star=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
	}
	static void outer(int rows) {
		int space=rows;
		int star=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=space;j++) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.print("  ");
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println( );
			space--;
			star++;
		}
	}
}







