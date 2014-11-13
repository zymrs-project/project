package jpa___;



import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Remote
public class PersonManagerBean implements PersonManager {
	
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	
	@PersistenceContext(unitName="jpa_01")
	private EntityManager em;
	
	public void addPerson(String name) {
		Person p = new Person();
		p.setName(name);
		em.persist(p);

	}
	
	public List<Person> getPersons() {
		
		return em.createQuery("From Person").getResultList();
	}

}
