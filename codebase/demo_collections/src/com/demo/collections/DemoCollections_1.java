package com.demo.collections;

public class DemoCollections_1 {
	Object[] objArr;
	int index;

	DemoCollections_1() {
		objArr = new Object[3];
		index = 0;
	}

	void add(Object obj) {
		if (size() == capacity()) {
			increaseCapacity();
		}

		objArr[index++] = obj;
	}

	int size() {
		return index;
	}

	int capacity() {
		return objArr.length;
	}

	void increaseCapacity() {
		Object[] nextArray = new Object[capacity() * 2];
		for (int i = 0; i < objArr.length; i++) {
			nextArray[i] = objArr[i];
		}
		objArr = nextArray;
	}

	boolean contains(Object obj) {
		
		if (obj == null) {
			for (int i = 0; i < size(); i++) {
				if (obj == objArr[i]) {
					return true;
				}
			}
			return false;
		} else {
			for (int i = 0; i < size(); i++) {
				if (obj.equals(objArr[i])) {
					//System.out.println(obj.toString());
					//System.out.println(objArr);
					return true;
				}
			}
			return false;
		}

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