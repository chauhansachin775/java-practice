package com.demo.collections_4;


public class DemoCollection_4 {

	private Object[] objArr = new Object[10];
	private int index = 0;
	
	public void add(Object obj) {
		
		if(size() == capacity()) {
			increaseCapacity();
		}
		objArr[index] = obj;
		index++;
	}
	
	public int size() {
		return index;
	}
	
	public int capacity() {
		return objArr.length;
	}
	
	public void increaseCapacity() {
		Object[] tempArr = new Object[objArr.length * 2];
		
		for(int i = 0; i< objArr.length; i++) {
			tempArr[i] = objArr[i];
		}
		objArr = tempArr;
	}
	
	public int remove(int index) {
		if(index >= 0 && index < size()) {
		for(int i= index; index < size()-1; i++)
			objArr[i] = objArr[i+1];
		this.index --;	
		return 1;
		}
		return -1;
	}
	
	public int replace(int index, Object obj) {
		if(index >= 0 && index < size()) {
			objArr[index] = obj;
			return 1;
		}
		return -1;
	}
	
	public Object get(int index) {
		if(index >= 0 && index < size()) {
			return objArr[index];
		}
		else
			return Integer.valueOf(-1);
	}

	public int insert(int index, Object obj) {
		if(index >= 0 && index < size()) {
			if(size() == capacity()) {
				increaseCapacity();
			}
			for(int i = size()-1; i >= index; i--) {
				objArr[i+1] = objArr[i];
			}
			objArr[index] = obj;
			return 1;
		}
		return -1;
	}
	public boolean contains(Object obj) {
		
	}
	
	public int indexOf(Object obj) {
		
	}
	
	public String toString() {
		StringBuilder s1 = new StringBuilder();
		s1.append("[");
		for(int i=0; i<size(); i++) {
			s1.append(objArr[i]);
			s1.append(",");
		}
	
		int start = s1.lastIndexOf(",");
		int end = start + 6;
		s1.delete(start, end);

		s1.append("]");
		return s1.toString();	
	}
}