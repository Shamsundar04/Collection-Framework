package com.sham.Arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private LocalDate dateOfAdmission;

	public Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	public static Student getStudentObject() {

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the student id : ");
		Integer id = scn.nextInt();
		scn.nextLine();

		System.out.print("Enter the student name : ");
		String name = scn.nextLine();

		System.out.print("Enter the student fees : ");
		Double fees = scn.nextDouble();
		scn.nextLine();

		System.out.print("Enter the admission date (dd-MM-yyyy): ");
		String input = scn.nextLine();

		// Define the date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		// Parse the input string into a LocalDate object
		LocalDate date = LocalDate.parse(input, formatter);
		
		scn.close();
		return new Student(id, name, fees, date);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

}

class StoreStudentObject {

	public void storeObject() throws IOException {
		List<Student> list = new ArrayList<>();

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the len of Object ");
		int len = scn.nextInt();scn.nextLine();

		var fos = new FileOutputStream("c:\\image\\student.txt");
		var oos = new ObjectOutputStream(fos);

		for (int i = 0; i < len; i++) {
			
			list.add(Student.getStudentObject());
		}
		oos.writeObject(list);
		
		System.out.println("List Object stored");
		
		oos.close();
		scn.close();
	}
}



class RetriveStudentObject {

	public void retriveObject() throws IOException, ClassNotFoundException {

		var fos = new FileInputStream("c:\\image\\student.txt");
		var oos = new ObjectInputStream(fos);
		
		@SuppressWarnings("unchecked")
		List<Student> student=(ArrayList<Student>)oos.readObject();
		
		student.forEach(System.out::println);		
		
		System.out.println("List Object re-stored");
		oos.close();
	}
}

public class SerializationAndDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StoreStudentObject store=new StoreStudentObject();
		store.storeObject();
		
		RetriveStudentObject retrive=new RetriveStudentObject();
		retrive.retriveObject();
	}

}
