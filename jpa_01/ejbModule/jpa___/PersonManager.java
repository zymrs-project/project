package jpa___;

import java.io.Serializable;

import java.util.List;


public interface PersonManager {
	public void addPerson(String name);
	public List<Person> getPersons();
}
