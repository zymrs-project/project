package jpa___;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;

@Stateless
@Remote
@NamedQuery(name = "Client.findByUsername",
			query = "select c from client c where c.username =:username")
public class ClientManagerBean implements ClientManager {
	@PersistenceContext(unitName="jpa_01")
	private EntityManager em;
	
	public boolean Register(Client client) {
		List<Client> results = em.createQuery("select c from Client c where c.username = :username").setParameter("username", client.getUsername()).getResultList();
		if(results.isEmpty()){
			em.persist(client);
			return true;
		}else
			return false;
		
		
		

	}

	public Client Login(String username, String password) {
		List<Client> results = em.createQuery("select c from Client c where c.username = :username").setParameter("username",username).getResultList();
		if(!results.isEmpty()){
		if(results.get(0).getPassword().equals(password)){
			return results.get(0);
		}
		}
		return null;
		
	}

}
