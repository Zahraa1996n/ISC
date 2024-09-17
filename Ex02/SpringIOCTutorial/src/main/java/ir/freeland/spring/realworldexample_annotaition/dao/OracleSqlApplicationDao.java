package ir.freeland.spring.realworldexample_annotaition.dao;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleSqlApplicationDao implements DaoInterface {

	@Override
	public void add() {
		System.out.println("Data added to Oracle Database .");
		
	}

}
