 package DemoReflectionAPI;

public interface Person {
	
	public abstract void eat();
	public abstract void drink();
	public abstract void sleep();
	
	static public final int eyes 	= 2;
	static public final int ears 	= 2;
	static public final int hands 	= 2;
	static public final int legs 	= 2;
	
	static int getEyes() {
		return eyes;
	}
	
	static int getEars() {
		return ears;
	}
	
	static int getHands() {
		return hands;
	}
	
	static int getLegs() {
		return legs;
	}
	
}