package es.nivel36.user;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest implements Serializable {

	private static final long serialVersionUID = -7049088154515501731L;

	private String email;
	
	private String name;
	
	private String surname;
	
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
		UserRequest other = (UserRequest) obj;
		return Objects.equals(email, other.email);
	}
	
	@Override
	public String toString() {
		return email;
	}
}
