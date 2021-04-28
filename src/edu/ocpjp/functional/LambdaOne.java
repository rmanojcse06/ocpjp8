package edu.ocpjp.functional;

@FunctionalInterface
interface Trail{
	boolean check(Sensor a);
}
class Sensor{
	String name = "";
	boolean motion, temperature, humidity;
	
	public Sensor(String name, boolean motion, boolean temperature, boolean humidity) {
		this.name = name;
		this.motion = motion;
		this.temperature = temperature;
		this.humidity = humidity;
	}
	boolean checkMotion() { return this.motion;}
	boolean checkTemperature() { return this.temperature;}
	boolean checkHumidity() {return this.humidity;}
}


public class LambdaOne {
	void print(Sensor s, Trail t) {
		System.out.println(s.name+" is "+t.check(s));
	}
	public static void main(String[] args) {
		LambdaOne o = new LambdaOne();
		o.print(new Sensor("MotionSensor",true,false,false), s->s.checkMotion());
		o.print(new Sensor("Thermistor",false,true,false), s->s.checkTemperature());
	}
}
