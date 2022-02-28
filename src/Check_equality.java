import java.util.Scanner;
public class Check_equality {

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

				//Asking for the input
				System.out.println("Please enter the co-ordinate x3: ");

				//Reading the input
			   double x3=input.nextDouble();
			  //Asking for the input
			 	System.out.println("Please enter the co-ordinate y3: ");
			 	//Reading the input
			 	 double y3=input.nextDouble();
			 	//Asking for the input
				System.out.println("Please enter the co-ordinate x4: ");
				//Reading the input
				 double x4=input.nextDouble();		
				//Asking for the input
				System.out.println("Please enter the co-ordinate y4: ");
				//Reading the input
				double y4=input.nextDouble();

				double distance1= Math.pow(Math.pow((x1-x2),2)+Math.pow((y1-y2), 2), 0.5);
				double distance2= Math.pow(Math.pow((x3-x4),2)+Math.pow((y3-y4), 2), 0.5);
				System.out.println(distance1);
				System.out.println(distance2);
				if(distance1==distance2) {
					System.out.println("Two lines are equal");
				}
				else {
					System.out.println("Lines are not equal");
			
	}
	}
}
