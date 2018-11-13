package de.vh.dev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(of = { "id", "name" })
@Entity
public class Artist {

	@Id
	@GeneratedValue
	private int id;
	private String name;

}
