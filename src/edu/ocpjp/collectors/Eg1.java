package edu.ocpjp.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Eg1 {
	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(
				new Emp("Adlin", "Johanna", 2354, "B", 10, false),
				new Emp("Mary", "Bruce", 1354, "C", 12, false),
				new Emp("Sanjana", "S", 4325, "A", 26, false),
				new Emp("Barry", "Test", 3524, "B", 52, true),
				new Emp("Nathan", "Clarke", 1653, "C", 39, true),
				new Emp("Manoj", "R", 3244, "B", 31, true)
		);
		
		Supplier<Map<Integer,List<Emp>>> supplier = TreeMap<Integer,List<Emp>>::new; 
		
		BiConsumer<Map<Integer,List<Emp>>, Emp> maleAccumulator = (des, src)-> {
			int k = (int)(src.sex?'M':'F');
			List<Emp> l = des.get(k);
			if(null == l) {
				l = new ArrayList<Emp>();
			}
			l.add(src);
			des.put(k, l);
		};
		
		BiConsumer<Map<Integer,List<Emp>>,Map<Integer,List<Emp>>> collector = (src, des)->{
			
		};
		
		list.stream().collect(supplier, maleAccumulator, collector).forEach((src,des)->{System.out.println("map["+src+"]="+des);});;
		
	}
}

class Emp{
 String fName;
 String lName;
 int eid;
 String dept;
 int age;
 boolean sex;
	public Emp(String fName, String lName, int eid, String dept, int age, boolean sex) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.eid = eid;
		this.dept = dept;
		this.age = age;
		this.sex = sex;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [fName=" + fName + ", lName=" + lName + ", eid=" + eid + ", dept=" + dept + ", age=" + age
				+ ", sex=" + sex + "]";
	}
	
}

