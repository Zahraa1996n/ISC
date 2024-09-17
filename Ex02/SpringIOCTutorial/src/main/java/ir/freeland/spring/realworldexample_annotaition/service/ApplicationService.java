package ir.freeland.spring.realworldexample_annotaition.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import ir.freeland.spring.realworldexample.dao.DaoInterface;

@SpringBootApplication
public class ApplicationService implements IApplicationService{
	private DaoInterface database;
	
	public ApplicationService(DaoInterface database) {
		this.database = database;
	}

	@Override
	public void create() {
		System.out.println("New App creating...");
		database.add();	
	}

}
