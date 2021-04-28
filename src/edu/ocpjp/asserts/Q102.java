package edu.ocpjp.asserts;

public class Q102 {
public static void main(String[] args) {
	Engine e = new Engine(0);
	e.start();
}
}

class Engine {
	double fuelLevel;
	Engine(int fuelLevel){this.fuelLevel = fuelLevel;}
	public void start() {
//		assert (fuelLevel): "Terminating";
//		assert (fuelLevel>0): System.out.println("Impossible Fuel");
//		assert fuelLevel<0:System.exit(0);
		assert fuelLevel>0:"Impossible Fuel";
		System.out.println("Started");
	}
	public void stop() {System.out.println("Stopped");}
}
