
public class LawnmowerIterator implements Iterator {
	
	String lawnmower_names[];
	
	int count;
	public LawnmowerIterator(String [] lawnmower_sizes)
	{
		this.lawnmower_sizes=lawnmower_sizes;
		
	}
	public boolean hasNext()
	{
		if(count<lawnmower_sizes.length)
		{
			return true;
		}
		return false;
	}
	
	public Object next()
	{
		if(this.hasNext())
		{
			return lawnmower_sizes[count++];
		}
		return null;
	}

}
