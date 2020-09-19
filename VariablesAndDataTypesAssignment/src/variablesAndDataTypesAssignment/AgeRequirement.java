package variablesAndDataTypesAssignment;

public class AgeRequirement {
	
	public static void main(String[] args) {
		
		String name = "John";
		int age = 2;
		
		if (age < 18) {
			System.out.println("Sorry! " + name + ", minimum age required to apply for this job position is 18 years.");
		}
		
		else {
			
			System.out.println("Thank you " + name + " for applying for this job position. Your resume will be reviewed.");
		}
	}

}
