package cs2.util;


public class Angle {
	private double radians;

	public Angle(double r) {
		radians = r;
		recenter();
	}
	public Angle() {
		radians = 0;
	}
	/* This doesn't work
	public Angle(double deg) {
		radians = deg * Math.PI / 180;
		recenter();
	}*/

	private void recenter() {
		while(radians > 2*Math.PI) {
			radians -= 2*Math.PI;
		}
		while(radians < 0) {
			radians += 2*Math.PI;
		}
	}

	public double getRadians() {
		return radians;
	}
	public void setRadians(double newRad) {
		radians = newRad;
		recenter();
	}

	public double getDegrees() {
		return this.radians * 180 / Math.PI;
	}
	public void setDegrees(double newDeg) {
		this.radians = newDeg * Math.PI / 180;
		this.recenter();
	}

	public Angle add(Angle other) {
    return new Angle(this.radians + other.radians);
	}
	public Angle add(double amt) {
		return new Angle(this.radians + amt);
	}

	public static Angle staticAdd(Angle left, Angle right) {
		return new Angle(left.radians + right.radians);
	}


	public static Angle fromDegrees(double deg) {
		return new Angle(deg * Math.PI / 180);
	}

}

class AngleTester {
	public static void main(String[] args) {
    Angle a = new Angle(7*Math.PI);
		Angle b = new Angle(Math.PI/4);

		//Angle c = a.add(b);
		Angle c = Angle.staticAdd(a,b);
		System.out.println("C = " + c.getRadians());

		Angle d = Angle.fromDegrees(270);
		System.out.println("D = " + d.getRadians());

		Angle e = new Angle();
		System.out.println("E = " + e.getRadians());

		System.out.println(a.getRadians());
		a.setRadians(9*Math.PI/4);
		System.out.println(a.getRadians());
		a.setDegrees(720);
		System.out.println(a.getRadians());
	}
}


