
public class Lawnmowerwork {
	
	
	public Lawnmowerwork()
	{
		
		
	}
	public String getSize(String Grasstype)
	{
		if(grasstype.equals("Small"))
		{
			return "Short";
		}
		else if(grasstype.equals("Medium"))
		{
			return "Long";
		}
		else if(company.equals("Big"))
		{
			return "VeryLong";
		}
		
		return null;
	}
	public int getWorkdays(String company)
	{
		if(grasstype.equals("small"))
		{
			return Monday;
		}
		else if(company.equals("Medium"))
		{
			return Wednesday;
		}
		else if(company.equals("Big"))
		{
			return Sunday;
		}
		
		return 0;
	}
	public String getBehaviourType(String grasstype)
	{
		if(grasstype.equals("Small"))
		{
			return "Wet";
		}
		else if(company.equals("Medium"))
		{
			return "Dry";
		}
		else if(company.equals("Big"))
		{
			return "Ice";
		}
		
		return null;
	}

}
