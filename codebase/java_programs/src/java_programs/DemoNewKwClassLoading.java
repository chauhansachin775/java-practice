package java_programs;

public class DemoNewKwClassLoading {
	
	int a= 10;
	int b= 20;
	DemoNewKwClassLoadingSource sou;
	
	public static void main(String[] args) {
		DemoNewKwClassLoading obj= new DemoNewKwClassLoading();
		System.out.println(obj.sou.y);
		//`System.out.println(DemoNewKwClassLoadingSource.x);
		
	}

}
