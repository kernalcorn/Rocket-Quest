/*
Evan Roberts and Aidan Maney
Period Five
April 10, 2018
Spring Project
Rocket
 */

package rocketQuest.PartClasses;

public class Rocket 
{
	//fields
	private Body body;
	private Tank tank;
	private Booster booster;
	private NoseCap noseCap;
	private Fins fins;
	
	//default constructor
	public Rocket() {
		super();
	}

	//full constructor
	public Rocket(Body body, Tank tank, Booster booster, NoseCap noseCap, Fins fins) {
		super();
		this.body = body;
		this.tank = tank;
		this.booster = booster;
		this.noseCap = noseCap;
		this.fins = fins;
	}

	//getters and setters
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
}
