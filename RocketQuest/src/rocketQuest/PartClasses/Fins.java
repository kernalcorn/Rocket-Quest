/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
Fins
 */

package rocketQuest.PartClasses;

public class Fins extends RocketPart
{
	//fields
	private int stability;

	//default constructor
	public Fins() {
		super();
	}

	//full constructor
	public Fins(int weight, int price, int tier, String name, int stability) {
		super(weight, price, tier, name);
		this.stability = stability;
	}

	//getters and setters
	public int getStability() {
		return stability;
	}

	public void setStability(int stability) {
		this.stability = stability;
	}
	
	
}
