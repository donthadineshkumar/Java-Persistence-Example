package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BOOK_AUTHOR database table.
 * 
 */
@Entity
@Table(name="BOOK_AUTHOR")
@NamedQuery(name="BookAuthor.findAll", query="SELECT b FROM BookAuthor b")
public class BookAuthor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;

	@Column(name="`DESC`")
	private Character[] desc;

	@Column(name="EMAIL")
	private String email;

	@Column(name="FIRST")
	private String first;

	@Column(name="GENDER")
	private String gender;

	@Column(name="LAST")
	private String last;

	@Column(name="OCCUPATION")
	private String occupation;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="RECEIVE_NOTIFICATIONS")
	private String receiveNotifications;

	public BookAuthor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Character[] getDesc() {
		return this.desc;
	}

	public void setDesc(Character[] desc) {
		this.desc = desc;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst() {
		return this.first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLast() {
		return this.last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReceiveNotifications() {
		return this.receiveNotifications;
	}

	public void setReceiveNotifications(String receiveNotifications) {
		this.receiveNotifications = receiveNotifications;
	}

}