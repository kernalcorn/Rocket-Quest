/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
Booster
 */

package rocketQuest.PartClasses;

public class Booster extends RocketPart
{
	//fields
	private int thrust;

	//default constructor
	public Booster() {
		super();
	}

	//full constructor
	public Booster(int weight, int price, int tier, String name, int thrust) {
		super(weight, price, tier, name);
		this.thrust = thrust;
	}

	//getters and setters
	public int getThrust() {
		return thrust;
	}

	public void setThrust(int thrust) {
		this.thrust = thrust;
	}
	
	
	
}
