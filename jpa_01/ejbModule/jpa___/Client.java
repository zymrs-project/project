package jpa___;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1862404544310188842L;
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue
	private int cid;
	
	private String username;
	private String password;
	private String sec_question;
	private String sec_answer;
	private Timestamp register_date;
	private String first_name;
	private String last_name;
	private String email;
	private String address;
	private Gender gender;
	private String city;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSec_question() {
		return sec_question;
	}
	public void setSec_question(String sec_question) {
		this.sec_question = sec_question;
	}
	public String getSec_answer() {
		return sec_answer;
	}
	public void setSec_answer(String sec_answer) {
		this.sec_answer = sec_answer;
	}
	public Timestamp getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Timestamp register_date) {
		this.register_date = register_date;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
