package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ExercicioAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		System.out.print("Student: ");
		estudante.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Grades: ");
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", estudante.finalGrade()));
		System.out.println(estudante.passedOrFailed());
		System.out.println(estudante);
		
		sc.close();
	}

}
