package interest_calc;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rate,time,amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount ");
		amount=sc.nextDouble();
		System.out.println("Enter the number of years ");
		time=sc.nextDouble();
		System.out.println("Enter the rate ");
		rate=sc.nextDouble();
		InterestCalculation i= new InterestCalculation(rate,time,amount);
		System.out.println("Simple interest : "+i.simpleInterest());
		System.out.println("Compound interest : "+i.compoundInterest());

	}

}
