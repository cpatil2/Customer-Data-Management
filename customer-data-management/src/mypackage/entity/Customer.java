package mypackage.entity;

import java.util.LinkedHashMap;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Pattern(regexp="[a-zA-Z]*", message="only letters")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Pattern(regexp="[A-Z]*", message="only CAPITAL LETTERS")
	@Column(name="last_name")
	private String lastName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
    @Email(message="email id is not correct")
	@Column(name="email")
	private String email;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Pattern(regexp="(^$|[0-9]{10})", message="must be 10 digits number")
	@Column(name="contact")
	private String contact;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	@Column(name="type")
	private String type;
	
	
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contact=" + contact + ", type=" + type + "]";
	}

	

	
		
}