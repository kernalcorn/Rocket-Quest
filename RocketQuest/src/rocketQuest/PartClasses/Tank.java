package rocketQuest.PartClasses;

public class Tank extends RocketPart
{
	
	private int fuelCapacity;

	public Tank() {
		super();
	}

	public Tank(int weight, int price, int tier, String name, int fuelCapacity) {
		super();
		this.fuelCapacity = fuelCapacity;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	
	
}
