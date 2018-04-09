package rocketQuest.PartClasses;

public class NoseCap extends RocketPart
{
	
	private int drag;

	public NoseCap() {
		super();
	}

	public NoseCap(int weight, int price, int tier, String name, int drag) {
		super(weight, price, tier, name);
		this.drag = drag;
	}

	public int getDrag() {
		return drag;
	}

	public void setDrag(int drag) {
		this.drag = drag;
	}
	
	
	
}
