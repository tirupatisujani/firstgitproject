package Java_Oopsconcepts;

public class Sujani_Constructor {


		// constructor method or default constructor method

//		Sujani() {
	//
//			System.out.println("I am in sujani method");
//		}
		
		// parameterized constructor method

		Sujani_Constructor(String name) {

			System.out.println("I am in sujani method :" + name);
		}
		
		Sujani_Constructor(int age) {

			System.out.println("I am in sujani method :" + age);
		}
		
		Sujani_Constructor(String name, int age, int num) {

			System.out.println("I am in sujani method :" + name + " and age is :" + age + " num :" + num);
		 }

		public static void main(String[] args) {

			//Sujani su = new Sujani(); //I am in sujani method
			
			Sujani_Constructor su1 = new Sujani_Constructor("Uma"); //I am in sujani method : uma
			
			Sujani_Constructor su2 = new Sujani_Constructor(100);// I am in sujani method : 100
			
			Sujani_Constructor su3 = new Sujani_Constructor("test" , 100, 89); //I am in sujani method :test and age is :100

		}

	}
