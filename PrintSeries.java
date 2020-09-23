import java.util.Random;
import java.util.Scanner;

public class PrintSeries {

protected static int start;
protected static int end;
protected int iterations;
protected int number1,number2,number3,number4;
	public Series(int start,int end,int iterations) {
		this.start=start;
		this.end=end;
		this.iterations=iterations;
	}

	protected void acceptInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting number from where you want to print series:");
		start=input.nextByte();		
		System.out.println("Enter Ending number till where you want to print series:");
		end=input.nextByte();
		System.out.println("Enter number of comparisions do you want to see:");
		iterations=input.nextByte();
	}
	
	protected void printInput() {
		System.out.println("The user entered range is: "+start+" to "+end);
	}
	
	protected void generateSeries() {
		
		int count = 1;
		for(int i=start;i<end;i++){
			while(count<=iterations) {
				System.out.println("Random Number Genrations round "+count);
				number1=(int) ((Math.random() * ((end - start ) + 1)) + start);
				System.out.println("First Number: "+number1);
			
				number2=(int) ((Math.random() * ((end - start ) + 1)) + start);
				System.out.println("Second Number: "+number2);
			
				number3=(int) ((Math.random() * ((end - start ) + 1)) + start);
				System.out.println("Third Number: "+number3);
			
				number4=(int) ((Math.random() * ((end - start ) + 1)) + start);
				System.out.println("Fourth Number: "+number4);
				count++;
	
			}
			
		}
		compareSeries();
	}
	
	protected void compareSeries() {
		int count = 1;
		while(count<=iterations){
			System.out.println("Comparision "+count);
			if(number2 > number1){
				System.out.println(" "+number2+"> "+number1);
			}
			if(number3 > number1){
	        System.out.println(" "+number3+"> "+number1);
			}
			if(number4 < number1){
				System.out.println(" "+number4+"< "+number1);
			}
			count++;
		}
	}
	
	public static void main(String[] args) {
		
		Series s = new Series(1,1,1);
		s.acceptInput();
		s.printInput();
		s.generateSeries();
		
	}

	

	

}
