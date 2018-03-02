package roney.five.rocketquest;

public class Body extends RocketPart
{
	
	private int internalCapacity;

	//Default constructor
	public Body() 
	{
		super();
	}

	//Full constructors
	public Body(int internalCapacity) 
	{
		super();
		this.internalCapacity = internalCapacity;
	}

	//getters and setters
	public int getInternalCapacity() 
	{
		return internalCapacity;
	}

	public void setInternalCapacity(int internalCapacity) 
	{
		this.internalCapacity = internalCapacity;
	}
	
	
	
}
