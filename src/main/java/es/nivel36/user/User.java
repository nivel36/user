package es.nivel36.user;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PERSON")
public class User implements Serializable {
	
	private static final long serialVersionUID = 5829289218093687301L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    @Column(nullable = false, unique = true)
	private String email;
	
    @Column(nullable = false)
	private String name;
	
    @Column(nullable = false)
	private String surname;
	
	private boolean disabled;
	
	private String avatar;
	
	private String phoneNumber;
	
	private String company;
	
	private String profile;
	
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email);
	}
	
	@Override
	public String toString() {
		return email;
	}
}
