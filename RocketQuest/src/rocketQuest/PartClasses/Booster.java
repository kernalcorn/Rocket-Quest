package rocketQuest.PartClasses;

public class Booster extends RocketPart
{
	
	private int thrust;

	public Booster() {
		super();
	}

	public Booster(int weight, int price, int tier, String name, int thrust) {
		super();
		this.thrust = thrust;
	}

	public int getThrust() {
		return thrust;
	}

	public void setThrust(int thrust) {
		this.thrust = thrust;
	}
	
	
	
}
