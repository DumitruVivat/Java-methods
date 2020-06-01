package myproject;

public class CalculatorMethodsApp {
	
	// CLASS BEGIN
	static void printResult(int result) {
		
		if( result <= 99999999 ) {
			
			System.out.printf("result: %08d\n",result);
			
		} else {
			
			System.out.println( "ERROR!!" );
			
		}
		
		
	}
	static int add(int a, int b) {
	    int r = a + b;
	    return r;
	}
	static int  sub(int a, int b) {
	    int r = a - b;
	    return r;
	}
	static int mul(int a, int b) {
	    int r = a * b;
	    return r;
	}
	static int div(int a, int b) {
	    int r = a / b;
	    return r;
	}
	static int pow(int a, int b) {
		int r = 1;
		for (int i=1; i<=b; i++){
			r = r * a;
		}
		return r;
	}
	
	static void printDivider() {
	    System.out.println("################");
	}
	
	public static void main(String[] args) {
		
		  printDivider();
		  printResult( sub(add(div(mul(pow(2,3),3),4),1),5) );
		  printResult( 999999999 );
		  printDivider();

	}
	
	// CLASS END
	
}
