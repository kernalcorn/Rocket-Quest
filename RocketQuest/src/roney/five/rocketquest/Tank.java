package roney.five.rocketquest;

public class Tank extends RocketPart
{
	
	private int fuelCapacity;

	public Tank() {
		super();
	}

	public Tank(int fuelCapacity) {
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
