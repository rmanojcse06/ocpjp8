package edu.ocpjp.adv.cls.design;

public class Q126 {
public static void main(String[] args) {
	
}
}
class Book{
	private int id;
	private String name;
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
