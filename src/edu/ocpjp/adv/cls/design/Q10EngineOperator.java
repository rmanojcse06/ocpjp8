package edu.ocpjp.adv.cls.design;

public class Q10EngineOperator extends Q10Operator{
	@Override
	protected void turnON() {
		System.out.println("Q10EngineOperator::turnON");
	}
	@Override
	protected void turnOFF() {
		System.out.println("Q10EngineOperator::turnOFF");
	}
}
