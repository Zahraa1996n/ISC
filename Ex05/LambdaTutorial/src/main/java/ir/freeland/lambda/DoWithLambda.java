package ir.freeland.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Intermediate Operations:
 * 
 * filter() map() flatMap() distinct() sorted() peek() limit() skip()
 * 
 * Terminal Operations:
 * 
 * forEach() forEachOrdered() toArray() reduce() collect() min() max() count()
 * anyMatch() allMatch() noneMatch() findFirst() findAny()
 * 
 */
public class DoWithLambda {

	public static void main(String[] args) {
		
	//new student
	List<Student> students = new ArrayList<>();
	Student zahra = new Student("zahra", "naderi", 26, 13.10);
	students.add(zahra);
	Student fateme = new Student("fateme", "ahmadi", 26, 16.12);
	students.add(fateme);
	Student ahmad = new Student("ahmad", "akbari", 26, 17.13);
	students.add(ahmad);
	Student leila = new Student("leila", "naderi", 26, 18.22);
	students.add(leila);
	Student fariba = new Student("fariba", "janipor", 26, 18.30);
	students.add(fariba);
	Student sara = new Student("sara", "sadeqi", 26, 18.15);
	students.add(sara);
	Student saba = new Student("saba", "naderi", 26, 17.10);
	students.add(saba);
	Student mahsa = new Student("mahsa", "farabi", 20, 10.10);
	students.add(mahsa);
	Student neda = new Student("neda", "naderi", 26, 17.10);
	students.add(neda);
	Student roja = new Student("roja", "naderi", 26, 17.10);
	students.add(roja);
	Student farangis = new Student("farangis", "naderi", 26, 17.10);
	students.add(farangis);
	Student fattane = new Student("fattane", "naderi", 26, 17.10);
	students.add(fattane);
	Student lale = new Student("lale", "naderi", 26, 17.10);
	students.add(lale);
	
	//sort by grade
	Comparator<Student> gradeCompare = Comparator.comparing(Student::getGrade);
	List<Student> sortedByAge = students.stream()
	    .sorted(gradeCompare.reversed())
	    .collect(Collectors.toList());

	System.out.println("Sort By Grade Descending:");
	sortedByAge.forEach(System.out::println);
	System.out.println("****************************");  

	//sort by revese age
	students.sort(Comparator.comparing(Student::getAge));
	System.out.println("Sort By Age Ascending:");
	students.forEach(System.out::println);
	System.out.println("****************************");  
	
	//group by grade 
	List<Student> higherGrades = students.stream()
		    .filter(student -> student.getGrade() >= 10)
		    .collect(Collectors.toList());
	System.out.println("****************************");  

		List<Student> lowerGrades = students.stream()
		    .filter(student -> student.getGrade() < 10)
		    .collect(Collectors.toList());
		System.out.println("****************************");  

		System.out.println("Grades Higher than 10:");
		higherGrades.forEach(System.out::println);
		System.out.println("****************************");  

		System.out.println("Grades Lower than 10:");
		lowerGrades.forEach(System.out::println);
		System.out.println("****************************");  
		
	// group by age
		Map<Integer, List<Student>> groupAge = students.stream()
			    .collect(Collectors.groupingBy(Student::getAge));

			System.out.println("Group by Age:");
			groupAge.forEach((age, studentList) -> {
			    System.out.println("Age: " + age);
			    studentList.forEach(System.out::println);
			    System.out.println("****************************");  
			     
			});

	
	// avg grade
		double averageGrade = students.stream()
			    .mapToDouble(Student::getGrade)
			    .average()
			    .getAsDouble();

			System.out.printf("The Average of Grades is: %.2f%n", averageGrade);  
			System.out.println("****************************");  

	// avg grade age > 18
		double averagegrade = students.stream()
			    .filter(p -> p.getAge() >= 18)
			    .mapToDouble(Student::getGrade)
			    .average()
			    .orElse(0.0);  

			System.out.println("Average Grades of Students Older than 18 is: " + averagegrade);

	

	}    

}
