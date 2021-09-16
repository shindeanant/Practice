package javafellowship.com;

public class AndOperator {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		int num1 =0;
		int num2 = 1;
		
		boolean out1 = ( a & a);
		boolean out2 = ( a & b);
		boolean out3 = ( b & a);
		boolean out4 = ( b & b);
		
		System.out.println(" True & ture:" + out1);
		System.out.println(" true & false:" + out2);
		System.out.println(" false and ture:" + out3);
		System.out.println("false & false:" + out4);
		
		if ( num1==0 && num2==1) {
			
			System.out.println("the condition is : true"  );
			
		}
		

	}
	

}
