package ir.freeland.springboot.persistence.base;

import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import ir.freeland.springboot.config.Iteam;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class JpaBaseInRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save*****************************************
		transaction.begin();
		Iteam itema1 = new Iteam();
		itema1.setName("LapTop");
		itema1.setCatalog("Digital");
		itema1.setPrice(22000);
    	session.persist(itema1);
    	transaction.commit();
    	
    	transaction.begin();
		Iteam itema2 = new Iteam();
		itema1.setName("phone");
		itema1.setCatalog("Digital");
		itema1.setPrice(12000);
    	session.persist(itema1);
    	transaction.commit();
    	
    	//Find*****************************************
    	transaction.begin();
    	List<Iteam> allitems = session.createQuery("from Items" , Iteam.class).getResultList();
    	allitems.stream().forEach( s -> System.out.println(s));    	
    	transaction.commit();
    	
    	//Update *****************************************
    	transaction.begin();
    	allitems.get(0).setName("Ipad");
    	transaction.commit();
    	
    	//Delete *****************************************
    	//transaction.begin();
    	//session.remove(  allitems.get(1) );
    	//transaction.commit();
    	
    	
	}
}
