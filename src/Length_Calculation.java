import java.util.Scanner;
public class Length_Calculation {

	public static void main(String[] args) {
		//Building the input variable
		Scanner input =new Scanner(System.in);
		//Asking for the input
		System.out.println("Please enter the co-ordinate x1: ");

		//Reading the input
	   double x1=input.nextDouble();
	  //Asking for the input
	 	System.out.println("Please enter the co-ordinate y1: ");
	 	//Reading the input
	 	 double y1=input.nextDouble();
	 	//Asking for the input
		System.out.println("Please enter the co-ordinate x2: ");
		//Reading the input
		 double x2=input.nextDouble();		
		//Asking for the input
		System.out.println("Please enter the co-ordinate y2: ");
		//Reading the input
		double y2=input.nextDouble();
		double distance= Math.pow(Math.pow((x1-x2),2)+Math.pow((y1-y2), 2), 0.5);
		System.out.println(distance);
	}
}