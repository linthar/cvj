package coop.tecso.asociados.cv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import coop.tecso.core.persistence.model.AbstractPersistentObject;

@Entity
public class Curriculum extends AbstractPersistentObject {

	@Column(unique = true)
	@NotNull
	private String username;

	@Column(length = 10000)
	private String json;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

}
