package com.demo.collections_3;

public class DemoCollections_3 {

	Object[] objArr;
	int index;
	
	DemoCollections_3() {
		objArr = new Object[10];
		index = 0;
	}
	
	public void add (Object obj) {
		if(size() == capacity())
			increaseCapacity();
		
			objArr[index++] = obj;	
	}
	
	public int size() {
		return index;
	}
	
	public int capacity() {
		return objArr.length;
	}
	
	public void increaseCapacity() {
		Object[] nextArr = new Object[capacity() * 2];
		
		for (int i = 0; i < size(); i++) {
			nextArr[i] = objArr[i];
		}
		objArr = nextArr;
	}
	
	public boolean contains(Object obj) {
		return indexOf(obj) >= 0;
	}
	
	public int indexOf(Object obj) {
		if(obj == null) {
			for (int i = 0; i < size(); i++) {
				if(obj == objArr[i])
					return i;
			}
			return -1;
		}
		
		for (int i = 0; i < size(); i++) {
			if(obj.equals(objArr[i]))
				return i;
		}
		return -1;
	}
	
	public int lastIndexOf(Object obj) {
		if(obj == null) {
			for (int i = size()-1; i >= 0; i--) {
				if(obj == objArr[i])
					return i;
			}
			return -1;
		}
		
		for (int i = size()-1; i >= 0; i--) {
			if(obj.equals(objArr[i]))
				return i;
		}
		return -1;
	}
	
	public boolean remove(Object obj) {
		if(contains(obj)) {
			int tempIndex =indexOf(obj);
			for (; tempIndex < size()-1; tempIndex++) {
				objArr[tempIndex] = objArr[tempIndex + 1];
			}
			objArr[tempIndex] = null;
			index --;
			return true;
		}
		return false;
	}
	
	public void replace(int index, Object obj) {
		if(index < 0 || index >= size())
			throw new IndexOutOfBoundsException(index);
		
		objArr[index] = obj;
	}
	
	public void insert(int tempIndex, Object obj) {
		if(tempIndex < 0 || tempIndex >= size())
			throw new IndexOutOfBoundsException(index);
		
		if(size() == capacity())
			increaseCapacity();
		
		for(int i = size()-1; i>= tempIndex; i--) {
			objArr[i+1] = objArr[i];
		}
		objArr[tempIndex] = obj;
		index ++;
	}
	
	public String toString() {
		if (size() == 0)
			return "[]";

		StringBuilder res = new StringBuilder("[");
		for (int i = 0; i < size(); i++) {
			res.append(objArr[i]);
			res.append(",");
		}

		int start = res.lastIndexOf(",");
		int end = start + 2;
		res.delete(start, end);

		res.append("]");
		return res.toString();
	}
}
