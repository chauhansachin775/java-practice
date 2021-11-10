package com.demo.collections_2;

public class Example_2 {
	
	int x;
	int y;
	
	public Example_2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Example_2) {
			Example_2 e = (Example_2)obj;
			return (this.x == e.x) && (this.y == e.y);
		}
		return false;
	}
	
	public String toString() {
		return "Ex("+x+","+y+")";
	}
	
	
}
