package rocketQuest;

public class Rocket 
{
	
	private Body body;
	private Tank tank;
	private Booster booster;
	private NoseCap noseCap;
	private Fins fins;
	private String imagePath;
	
	public Rocket() {
		super();
	}

	public Rocket(Body body, Tank tank, Booster booster, NoseCap noseCap, Fins fins, String imagePath) {
		super();
		this.body = body;
		this.tank = tank;
		this.booster = booster;
		this.noseCap = noseCap;
		this.fins = fins;
		this.imagePath = imagePath;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public Booster getBooster() {
		return booster;
	}

	public void setBooster(Booster booster) {
		this.booster = booster;
	}

	public NoseCap getNoseCap() {
		return noseCap;
	}

	public void setNoseCap(NoseCap noseCap) {
		this.noseCap = noseCap;
	}

	public Fins getFins() {
		return fins;
	}

	public void setFins(Fins fins) {
		this.fins = fins;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	
}
