package day02;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
	public static void main(String[] args) {
		Cell c=new Cell(1,2);
		Collection C=new ArrayList();
		C.add(c);
		System.out.println(c);
		System.out.println(C);
		c.setX(2);
		System.out.println(c);
		System.out.println(C);
	}
}
class Cell{
	private int x;
	private int y;
	
	public Cell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}