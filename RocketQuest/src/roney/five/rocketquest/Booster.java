package roney.five.rocketquest;

public class Booster extends RocketPart
{
	
	private int thrust;

	public Booster() {
		super();
	}

	public Booster(int thrust) {
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
