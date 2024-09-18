package ir.freeland.springboot.relation.onetoone;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import ir.freeland.springboot.config.Iteam;
import ir.freeland.springboot.persistence.base.Baditem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



public class OnetoOne {
	@Component
	public class OneToOneRelation {

		@PersistenceContext
		private EntityManager entityManager;
		
		public void sampleRun() {
			entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
			Session session = entityManager.unwrap(Session.class);
			Transaction transaction = session.getTransaction();
			transaction.begin();		
			
			Iteam item = new Iteam("Samsung", 877.9, "Digital");
		        
	        Baditem baditem = new Baditem();
	        baditem.setReason("power faile");
	        baditem.setName(item.getName());
		
			session.persist(item);
			
			
	    	transaction.commit();
	    	
		}
	       
	    }
	}

