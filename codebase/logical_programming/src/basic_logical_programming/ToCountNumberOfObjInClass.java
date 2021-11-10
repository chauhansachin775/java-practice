package basic_logical_programming;

public class ToCountNumberOfObjInClass {
	int x = 10;
	static int i = 0;

	ToCountNumberOfObjInClass() {
		i++;
	}

	public static void main(String[] args) {

		ToCountNumberOfObjInClass e1 = new ToCountNumberOfObjInClass();
		ToCountNumberOfObjInClass e2 = new ToCountNumberOfObjInClass();
		ToCountNumberOfObjInClass e3 = new ToCountNumberOfObjInClass();

		System.out.println(i);
	}

}
