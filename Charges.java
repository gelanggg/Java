import java.util.Scanner;
public class Charges{

       public static void main(Strings[] args) {
	            Scanner sc = new Scanner(System.in);
				System.out.println("Enter an Amount:");
				double input=sc.nextDouble();
				double serviceCharge;
				
                                if(amount < 10.0) 
                                   serviceCharge = 1.0;
                                else if(amount < 100.0)
                                   serviceCharge = 0.1 * amount;
                                else if(amount < 1000.0)
                                   serviceCharge = 5.0 + 0.05 * amount;
                                else
                                   serviceCharge = 40.0 + 0.01 * amount;
				
      }
}      


