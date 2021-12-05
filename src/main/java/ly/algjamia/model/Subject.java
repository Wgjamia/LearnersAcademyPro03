package ly.algjamia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="subject_name")
	private String name;
	
	@Column(name="shortcut")
	private String shortcut;

	public Subject() {
		super();
	}

	public Subject(String name, String shortcut) {
		super();
		this.name = name;
		this.shortcut = shortcut;
	}

	public Subject(int id, String name, String shortcut) {
		super();
		this.id = id;
		this.name = name;
		this.shortcut = shortcut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortcut() {
		return shortcut;
	}

	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", shortcut=" + shortcut + "]";
	}
	
	
	
}
