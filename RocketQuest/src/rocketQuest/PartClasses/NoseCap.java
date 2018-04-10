/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
NoseCap
 */

package rocketQuest.PartClasses;

public class NoseCap extends RocketPart
{
	//fields
	private int drag;

	//default constructor
	public NoseCap() {
		super();
	}

	//full constructor
	public NoseCap(int weight, int price, int tier, String name, int drag) {
		super(weight, price, tier, name);
		this.drag = drag;
	}

	//getters and setters
	public int getDrag() {
		return drag;
	}

	public void setDrag(int drag) {
		this.drag = drag;
	}
	
	
	
}
