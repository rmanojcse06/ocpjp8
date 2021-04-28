package edu.ocpjp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q142 {
public static void main(String[] args) {
	class Block{
		String color;
		int size;
		public Block(int size,String color) {
			this.color = color;
			this.size = size;
		}
		public int getSize() {
			return size;
		}
		@Override
		public String toString() {return "S-"+size+"-C-"+color;}
	}
	class ColorSorter implements Comparator<Block>{
		public int compare(Block a, Block b) {
			return a.color.compareTo(b.color);
		};
	}
	List<Block>blocks=new ArrayList<>();
	blocks.add(new Block(10,"Green"));
	blocks.add(new Block(7,"Red"));
	blocks.add(new Block(12,"Blue"));
//	Collections.sort(blocks,(Block b1, Block b2)->b1.getSize()-b2.getSize());
	Collections.sort(blocks,new ColorSorter());
	blocks.stream().forEach(System.out::println);
}
}
