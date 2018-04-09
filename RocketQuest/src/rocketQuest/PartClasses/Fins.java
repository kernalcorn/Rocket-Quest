package rocketQuest.PartClasses;

public class Fins extends RocketPart
{
	private int stability;

	public Fins() {
		super();
	}

	public Fins(int weight, int price, int tier, String name, int stability) {
		super(weight, price, tier, name);
		this.stability = stability;
	}

	public int getStability() {
		return stability;
	}

	public void setStability(int stability) {
		this.stability = stability;
	}
	
	
}
