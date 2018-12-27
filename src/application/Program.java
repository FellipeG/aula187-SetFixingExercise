package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> courseA = new HashSet<>();
		Set<Student> courseB = new HashSet<>();
		Set<Student> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int studentsA = sc.nextInt();
		for(int i=0;i<studentsA;i++) {
			courseA.add(new Student(sc.nextInt()));
		}
		System.out.println();
		System.out.print("How many students for course B? ");
		int studentsB = sc.nextInt();
		for(int i=0;i<studentsB;i++) {
			courseB.add(new Student(sc.nextInt()));
		}
		System.out.println();
		System.out.print("How many students for course C? ");
		int studentsC = sc.nextInt();
		for(int i=0;i<studentsC;i++) {
			courseC.add(new Student(sc.nextInt()));
		}
		Set<Student> totalStudent = new HashSet<>(courseA);
		totalStudent.addAll(courseB);
		totalStudent.addAll(courseC);
		
		System.out.println();
		System.out.println("Total users: " + totalStudent.size());
				
		sc.close();
	}

}
