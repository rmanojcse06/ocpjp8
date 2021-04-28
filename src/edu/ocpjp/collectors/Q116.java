package edu.ocpjp.collectors;

import java.util.Arrays;
import java.util.List;

public class Q116 {
public static void main(String[] args) {
	List<Vehicle>vList=Arrays.asList(new Vehicle(2, "Car"),new Vehicle(3, "Bike"),new Vehicle(1, "Truck"));
//	vList.stream().sorted((v1,v2)->v1.vid-v2.vid).forEach(System.out::print);;
//	vList.stream().sorted(Comparator.comparing(Vehicle::getvName).reversed()).forEach(System.out::print);
//	vList.stream().map(v->v).sorted().forEach(v->System.out.print(v.vName));;
	vList.stream().sorted((v1,v2)->Integer.compare(v1.getVid(), v2.getVid())).forEach(System.out::print);
}
}
class Vehicle implements Comparable<Vehicle>{
	int vid;String vName;
	public Vehicle(int v,String n) {this.vid=v;this.vName=n;}
	public int getVid() {return vid;}
	public String getvName() {return vName;}
	public String toString() {return vName;}
	public int compareTo(Vehicle o) {return this.vid-o.vid;}
}
