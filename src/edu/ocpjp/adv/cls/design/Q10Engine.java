package edu.ocpjp.adv.cls.design;

public class Q10Engine {
	Q10Operator m = new Q10EngineOperator();
	public void operate() {
		System.out.println("Q10Engine::operate");
		m.turnON();
		m.turnOFF();
	}
}
