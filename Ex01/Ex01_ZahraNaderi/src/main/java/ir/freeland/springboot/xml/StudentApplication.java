package ir.freeland.springboot.xml;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import generated.Student;
import generated.Teacher;

@SpringBootApplication
@EntityScan("ir.freeland.springboot.persistence.model")
public class StudentApplication {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		SpringApplication.run(StudentApplication.class, args);
		File xmlfile2 = new ClassPathResource("Student.xml").getFile();
		XmlMapper xmlMapper = new XmlMapper();
		Student student = xmlMapper.readValue(xmlfile2, Student.class);
		System.out.println(student);
		
		File xmlfile = new ClassPathResource("Teacher.xml").getFile();
		XmlMapper xmlMapper1 = new XmlMapper();
		Teacher teacher = xmlMapper1.readValue(xmlfile, Teacher.class);
		System.out.println(teacher);
		

		
		  Student student1 = new Student();
		  student1.setName("zahra");
		  student1.setFamily("naderi"); 
		  student1.setAge(27);
		  student1.setMajor("compute"); 
		  xmlMapper.writeValue(new File("generated-from-java-student.xml"), student1);
		  
		  Teacher teacher1 = new Teacher();
		  teacher1.setName("amir");
		  teacher1.setFamily("hoseini");
		  teacher1.setCourse("java");
		  xmlMapper.writeValue(new File("generated-from-java-teacher.xml"), teacher1);
		  
		  
		 
			//read json file
			File jsonfileStudent = new ClassPathResource("Student.json").getFile();
			ObjectMapper mapper = new ObjectMapper();
			var studentjson = mapper.readValue(jsonfileStudent,  Student.class);
			
			System.out.println(studentjson);
			
			File jsonfileTeacher = new ClassPathResource("Teacher.json").getFile();
			//ObjectMapper mapper = new ObjectMapper();
			var teacherjson = mapper.readValue(jsonfileTeacher,  Teacher.class);
			System.out.println(teacherjson);
			
			//write json
			  var studentjson2 = new Student();
			  ObjectMapper jsonmapper = new ObjectMapper();
			  studentjson2.setName("alireza");
			  studentjson2.setFamily("naderi"); 
			  studentjson2.setAge(22);
			  studentjson2.setMajor("compute"); 
			  jsonmapper.writeValue(new File("generated-from-java-student.json"), studentjson2);
			  
			  var teacherjson2 = new Teacher();
			  teacherjson2.setName("fateme");
			  teacherjson2.setFamily("naderi"); 
			  teacherjson2.setCourse("compute"); 
			  jsonmapper.writeValue(new File("generated-from-java-teacher.json"), teacherjson2);
			  
		 
	}

}
