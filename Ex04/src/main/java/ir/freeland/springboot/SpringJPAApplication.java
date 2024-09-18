package ir.freeland.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ir.freeland.springboot.persistence.base.JpaBaseInRun;




@SpringBootApplication
@EnableJpaRepositories("ir.freeland.springboot.persistence.repo")
@EntityScan(basePackages =  {"ir.freeland.springboot.persistence.model",
							 "ir.freeland.springboot.relation",
							 "ir.freeland.springboot.persistence.converter"})
public class SpringJPAApplication {


	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJPAApplication.class, args);
		
		JpaBaseInRun JpaBaseInRun = context.getBean( JpaBaseInRun.class);
		JpaBaseInRun.sampleRun();
		
	

	}

}
