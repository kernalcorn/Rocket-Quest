package roney.five.rocketquest;

public abstract class RocketPart 
{
	
	//fields
	private int weight;
	private int price;
	private int tier;
	private String name;
	
	
	
	//default constructor
	public RocketPart() 
	{
		super();
	}

	//full constructor
	public RocketPart(int weight, int price, int tier, String name) 
	{
		super();
		this.weight = weight;
		this.price = price;
		this.tier = tier;
		this.name = name;
	}
	
	
	//getters and setters
	public int getWeight() 
	{
		return weight;
	}
	
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public int getTier() 
	{
		return tier;
	}
	
	public void setTier(int tier) 
	{
		this.tier = tier;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	
}
