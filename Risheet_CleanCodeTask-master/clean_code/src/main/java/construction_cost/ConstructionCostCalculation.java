package construction_cost;

public class ConstructionCostCalculation {
	double sqft;
	int material;
	char automated;
	ConstructionCostCalculation(double sqft,int material,char automated)
	{
		this.sqft=sqft;
		this.material=material;
		this.automated=automated;
	}
	public double cost()
	{
		double housecost=0;
		if(material==1)
		{
			housecost=sqft*1200;
		}
		else if(material==2)
		{
			housecost=sqft*1500;
		}
		else if(material==3)
		{
			if(automated=='Y')
			{
				housecost=sqft*1800;
			}
			else
			{
				housecost=sqft*2500;
			}
			
		}
		return housecost;
		
		
	}
}
