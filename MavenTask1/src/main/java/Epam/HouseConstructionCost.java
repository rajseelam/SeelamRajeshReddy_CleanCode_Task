package Epam;

public class HouseConstructionCost {
	public double FullyAutomatedHomeCost(String MaterialStandard,double AreaOfHouseInFeets)
	{
		double cost=0;
		if(MaterialStandard.equals("StandardMaterials"))
	   {
		cost=1200*(AreaOfHouseInFeets);
	   }
		else if(MaterialStandard.equals("AboveStandardMaterials"))
		{
		cost =1500*(AreaOfHouseInFeets);	
		}
		else if(MaterialStandard.equals("HighStandardMaterial"))
		{
		cost=1800*(AreaOfHouseInFeets);	
		}
		else if(MaterialStandard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
		cost=2500*(AreaOfHouseInFeets);	
		}
		return cost;
	}

}
