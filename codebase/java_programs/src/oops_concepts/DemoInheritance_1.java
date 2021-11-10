package oops_concepts;



class A{}

public class DemoInheritance_1 extends A{

}

class C extends A{}

class D implements A{}

interface I1{}

interface I2 extends I1{}

interface I3 implements I1{}

class E implements I1{}

class F extends I1{}

interface I4 extends A{}

interface I5 extends A{}


//************************************************************

class P{
	
	void m1(){}
}

class Q extends P{}

interface I6{
	
	void m2();
}

interface I7 extends I6{}

class R implements I6{
	
	public  void m2() {
		System.out.println("hello");
	}
}

//**********************************************************************

abstract class U{
	
	abstract void m3();
	void m4() {}
}

class V extends U{
	
}

class W extends U{
	void m3() {}
}

final class X{}

class Y extends X{}
























