
public class Lawnmower implements BladeSize {
	
	 public String lawnmower_sizes[] = {"Small" , "Medium" ,"Big" };
	
	
	public Iterator createIterator()
	{
		return new LawnmowerIterator(lawnmower_sizes);
	}

}
