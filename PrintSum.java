
public class PrintSum {

	private static int num1;
	private static int num2;
	public PrintSum(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	private void add(int num1,int num2) {
		
		System.out.println(" "+num1+" + "+num2+" = "+(num1+num2));
		
	}
	
	private static void subtract(int num1,int num2) {
		
		System.out.println(" "+num1+" - "+num2+" = "+(num1-num2));
	}

	

	public static void main(String[] args) {
		PrintSum s1 = new PrintSum(2,6);
		s1.add(num1, num2);
		PrintSum s2 = new PrintSum(4,6);
		s2.add(num1, num2);
		new PrintSum(6,4);
		subtract(num1, num2);
		subtract(8, 2);
	
	}

}
