package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import ir.freeland.collection.model.Person;

@SpringBootApplication
public class collectionApp {
	public static void main(String[] args) {

   


        Person zahra = new Person("zahra", "zahranaderi3681@gmail.com", 26);
        Person alireza = new Person("alireza", "zahranaderi3681@gmail.com", 24);
        Person mahsa = new Person("mahsa", "zahranaderi3681@gmail.com", 22);

        List persons = new ArrayList();
        persons.add(zahra);
        persons.add(alireza);
        persons.add(mahsa);
        persons.remove(0);

        
        Person amin = new Person("amin", "zahranaderi3681@gmail.com", 20);
        System.out.println(persons.contains(amin));

        
        Person newPerson = new Person("amin", "zahranaderi3681@gmail.com", 20);
        System.out.println(persons.indexOf(newPerson));

        
        int found = Collections.binarySearch(persons, zahra);
        System.out.println(persons.get(found) );
        
        Collections.sort(persons , new SortByAddres());
		
	}
}
