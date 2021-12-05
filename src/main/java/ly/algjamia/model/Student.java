package ly.algjamia.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity

@Table(name="Student")
public class Student {

	//DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="student_name", length = 80)
	private String sname;
	
	@Column(name="age")
	private int age;
	
	@Column(name="date_of_birth",length = 16)
	private String dateOfbirth;
	
	@ManyToMany(mappedBy = "student")
	private Set<Classes> classes;
	
	public Student() {
		
	}

	public Student(String sname, int age, String dateOfbirth) {
		super();
		this.sname = sname;
		this.age = age;
		this.dateOfbirth = dateOfbirth;
		
	}

	public Student(int id, String sname, int age, String dateOfbirth){
		super();
		this.id = id;
		this.sname = sname;
		this.age = age;
		this.dateOfbirth =  dateOfbirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfbirth()   {
		return   dateOfbirth;
	}

	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth =  dateOfbirth;
	}

	public Set<Classes> getClasses() {
		return classes;
	}

	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", age=" + age + ", dateOfbirth=" + dateOfbirth + ", classes="
				+ classes + "]";
	}


	
	
	
}
