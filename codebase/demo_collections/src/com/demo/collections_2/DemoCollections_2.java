package com.demo.collections_2;

public class DemoCollections_2 {

	private Object[] objArr;
	private int index;

	DemoCollections_2() {
		objArr = new Object[3];
		index = 0;
	}

	public void add(Object obj) {
		if (size() == capacity()) {
			increaseCapacity();
		}
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
		for (int i = 0; i < capacity(); i++) {
			nextArr[i] = objArr[i];
		}
		objArr = nextArr;
	}

	public boolean contains(Object obj) {
		return indexOf(obj) >= 0;
	}

	public int indexOf(Object obj) {
		if (obj == null) {
			for (int i = 0; i < size(); i++) {
				if (obj == objArr[i]) {
					return i;
				}
			}
			return -1;
		} else {
			for (int i = 0; i < size(); i++) {
				if (obj.equals(objArr[i])) {
					return i;
				}
			}
			return -1;
		}
	}

	public int lastIndexOf(Object obj) {
		if (obj == null) {
			for (int i = size() - 1; i > 0; i--) {
				if (obj == objArr[i]) {
					return i;
				}
			}
			return -1;
		} else {
			for (int i = size() - 1; i > 0; i--) {
				if (obj == objArr[i]) {
					return i;
				}
			}
			return -1;
		}
	}

	public boolean remove(Object obj) {
		if (contains(obj)) {
			int tempIndex = indexOf(obj);
			for (; tempIndex < size() - 1; tempIndex++) {
				objArr[tempIndex] = objArr[tempIndex + 1];
			}
			objArr[tempIndex] = null;
			index--;
			return true;
		}
		return false;
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
		int end = start + 6;
		res.delete(start, end);

		res.append("]");
		return res.toString();
	}
}
