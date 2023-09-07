package es.nivel36.user;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto implements Serializable {

	private static final long serialVersionUID = 4976686518081723009L;

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
		UserDto other = (UserDto) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return email;
	}
}
