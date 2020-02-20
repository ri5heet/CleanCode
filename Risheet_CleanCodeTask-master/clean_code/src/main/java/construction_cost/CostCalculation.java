package construction_cost;
import java.util.*;
public class CostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int material;
		char automated;
		double sqft;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter area of house in square feet :");
		sqft=sc.nextDouble();
		System.out.println("Choose the type of material to construct your house : ");
		System.out.println("1.Standard Material");
		System.out.println("2.Above Standard Material");
		System.out.println("3.Highly Standard Material");
		material=sc.nextInt();
		System.out.println("Do you want Fully Autoamted Home (Y/N)");
		automated=sc.next().charAt(0);
		ConstructionCostCalculation c=new ConstructionCostCalculation(sqft,material,automated);
		System.out.println("Cost of the house to be constructed is "+c.cost()+" INR");


	}

}
