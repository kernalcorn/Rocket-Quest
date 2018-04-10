/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
Tank
 */

package rocketQuest.PartClasses;

public class Tank extends RocketPart
{
	//fields
	private int fuelCapacity;

	//default constructor
	public Tank() {
		super();
	}

	//full constructor
	public Tank(int weight, int price, int tier, String name, int fuelCapacity) {
		super(weight, price, tier, name);
		this.fuelCapacity = fuelCapacity;
	}

	//getters and setters
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	
	
}
