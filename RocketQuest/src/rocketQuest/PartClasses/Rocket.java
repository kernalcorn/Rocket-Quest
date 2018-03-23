package rocketQuest.PartClasses;

public class Rocket 
{
	
	private Body body;
	private Tank tank;
	private Booster booster;
	private NoseCap noseCap;
	private Fins fins;
	
	private String imagePath;
	private String bodyImgString = "b1";
	private String noseCapImgString = "n1";
	private String finsImgString = "f1";
	
	public Rocket() {
		super();
	}

	public Rocket(Body body, Tank tank, Booster booster, NoseCap noseCap, Fins fins) {
		super();
		this.body = body;
		this.tank = tank;
		this.booster = booster;
		this.noseCap = noseCap;
		this.fins = fins;
		
		bodyImgString = "b1";
		noseCapImgString = "n1";
		finsImgString = "f1";
		imagePath = bodyImgString + noseCapImgString + finsImgString;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body, int tier) {
		this.body = body;
		this.bodyImgString = ("b" + String.valueOf(tier));
		imagePath = bodyImgString + noseCapImgString + finsImgString;
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

	public void setNoseCap(NoseCap noseCap, int tier) {
		this.noseCap = noseCap;
		this.noseCapImgString = ("n" + String.valueOf(tier));
		imagePath = bodyImgString + noseCapImgString + finsImgString;
	}

	public Fins getFins() {
		return fins;
	}

	public void setFins(Fins fins, int tier) {
		this.fins = fins;
		finsImgString = ("f" + String.valueOf(tier));
		imagePath = bodyImgString + noseCapImgString + finsImgString;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
