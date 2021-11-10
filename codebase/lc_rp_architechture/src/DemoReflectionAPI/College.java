package DemoReflectionAPI;


public class College {
	
	private Person p;
	
	public void objectCnf(String cnf) throws Exception {
		Class person_class = Class.forName(cnf);
		Object person_obj = person_class.newInstance();				
		
		if(person_obj instanceof Person) {
			p = (Person)person_obj;
			
		}else {
			throw new Exception("Invalid Object");
		}
		
	}

}
