package Java_Oopsconcepts;

public class ObjectsandClasses {
		
		float age = 89.90f;
		
		String course = "Java";
		
		boolean value = false;
		
		void evening() {
			
			System.out.println("Hi Team, good evening"); 
		}
		

		public static void main(String[] args) {
			
			ObjectsandClasses ex = new ObjectsandClasses();

			System.out.println(ex.age);
			
			System.out.println(ex.course);
			
			System.out.println(ex.value);
			
			ex.evening();
		}
		
		

	}

	/*
	 * 89.9
	Java
	false
	Hi Team, good evening
	*/
