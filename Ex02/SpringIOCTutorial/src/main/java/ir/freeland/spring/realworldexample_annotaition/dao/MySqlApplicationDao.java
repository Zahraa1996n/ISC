package ir.freeland.spring.realworldexample_annotaition.dao;

import org.springframework.stereotype.Component;

@Component("Mysql")
public class MySqlApplicationDao implements DaoInterface{

	@Override
	public void add() {
		System.out.println("Data added to MySql Database .");
		
	}

}
