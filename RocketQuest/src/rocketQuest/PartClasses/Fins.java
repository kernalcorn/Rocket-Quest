package rocketQuest.PartClasses;

public class Fins extends RocketPart
{
	private int stability;

	public Fins() {
		super();
	}

	public Fins(int stability) {
		super();
		this.stability = stability;
	}

	public int getStability() {
		return stability;
	}

	public void setStability(int stability) {
		this.stability = stability;
	}
	
	
}
