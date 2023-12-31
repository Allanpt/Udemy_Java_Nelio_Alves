package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String passedOrFailed() {
		if(finalGrade() >= 60) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
	public double missingGrade() {
		return 60 - finalGrade();
	}
	
	public String toString() {
		if(finalGrade() < 60) {
			return "MISSING " + String.format("%.2f", missingGrade()) + " POINTS";
		}else {
			return " ";
		}
	}
}

