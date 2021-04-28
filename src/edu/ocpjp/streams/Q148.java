package edu.ocpjp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q148 {
public static void main(String[] args) {
	class Test{
		List<String>list=null;
		public List<String> printValues() {
			return(getList());
		}
		public List<String>getList(){return list;}
		public void setList(List<String>l) {this.list=l;}
	}
	List<String>list=Arrays.asList("Dog","Cat","Mouse");
	Test t=new Test();
	t.setList(list);
	list.stream().collect(Collectors.toList()).forEach(System.out::print);
}
}
