package ly.algjamia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name ="teacher_name")
	private String techName;
	
	
	@Column(name = "age")
	private int age;


	

	public Teacher() {
		super();
	}




	public Teacher(String techName, int age) {
		super();
		this.techName = techName;
		this.age = age;
	}




	public Teacher(int id, String techName, int age) {
		super();
		this.id = id;
		this.techName = techName;
		this.age = age;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTechName() {
		return techName;
	}




	public void setTechName(String techName) {
		this.techName = techName;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Teacher [id=" + id + ", techName=" + techName + ", age=" + age + "]";
	}


	
	
}
