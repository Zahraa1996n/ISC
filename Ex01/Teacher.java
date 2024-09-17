package generated;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class Teacher{
	
	private String name;
	private String family;
	private String course;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFamily() {
		return family;
	}



	public void setFamily(String family) {
		this.family = family;
	}




	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}

	
	@Override
	public String toString() {
		return "Note [name=" + name + ", family=" + family 
				+ ", course=" + course + "]";
	}


	
}