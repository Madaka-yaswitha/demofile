package demo;

public class NestedWhileLoop {
	public static void main(String[] args) {
		int outerLoop = 1;
		while(outerLoop < 4) {
			int innerLoop = 4;
			while(innerLoop < 6) {
				System.out.println(outerLoop + ":" + innerLoop);
				innerLoop++;
				
			}
			outerLoop++;
		}
	}
	

}
