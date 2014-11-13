package jpa___;

public interface ClientManager {
	public boolean Register(Client client);
	public Client Login(String username,String password);
}
