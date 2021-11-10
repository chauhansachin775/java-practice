package lc_rp_architechture_dynamic_bind_2;

import java.util.Scanner;

public class College {
	
	Scanner in = new Scanner(System.in);
	Student[] stdArr 	= new Student[10];
	Faculty[] facltArr 	= new Faculty[10];
	int i = 0;
	int j = 0;

	
	void info(Person p) {
		if(p instanceof Student) {
			if(i < 9) {
				stdArr[i] = (Student)p;
				
				System.out.println("enter name: ");
				String name = in.nextLine();
				stdArr[i].setName(name);
				
				System.out.println("enter height: ");
				double height = in.nextDouble();
				stdArr[i].setHeight(height);
				
				System.out.println("enter weight:");
				double weight = in.nextDouble();
				stdArr[i].setWeight(weight);
				
				in.nextLine();
				
				System.out.println("enter Sno: ");
				int sno = in.nextInt();
				stdArr[i].setSno(sno);
				
				in.nextLine();
				
				System.out.println("enter course: ");
				String course = in.nextLine();
				stdArr[i].setCourse(course);
				
				System.out.println("enter fee: ");
				double fee = in.nextDouble();
				stdArr[i].setFee(fee);
				
				in.nextLine();
				i++;
				
			}
			}else if(p instanceof Faculty) {
				if(j < 9) {
					facltArr[j] = (Faculty)p;
					
					System.out.println("enter name: ");
					String name = in.nextLine();
					facltArr[j].setName(name);
					
					System.out.println("enter Fno:");
					int fno = in.nextInt();
					facltArr[j].setFno(fno);
					
					System.out.println("enter height: ");
					double height = in.nextDouble();
					facltArr[j].setHeight(height);
					
					System.out.println("enter weight:");
					double weight = in.nextDouble();
					facltArr[j].setWeight(weight);
					
					in.nextLine();
					
					System.out.println("enter department: ");
					String dept = in.nextLine();
					facltArr[j].setDept(dept);
					
					System.out.println("enter salary: ");
					double sal = in.nextDouble();
					facltArr[j].setSal(sal);
					
					in.nextLine();
					j++;
				}
			}
	//i++;
	//j++;
	}
	}