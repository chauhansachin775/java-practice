package com.demo.collections;

public class Example {

	int x;
	int y;
	
	public Example(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Example) {
			Example e = (Example)obj;
			return (this.x == e.x) && (this.y == e.y);
		}
		return false;
	}
	
	public String toString() {
		return "Ex("+x+","+y+")";
	}
}
