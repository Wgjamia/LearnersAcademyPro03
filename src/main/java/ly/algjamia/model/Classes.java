package ly.algjamia.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="classes")
public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="section")
	private int section;
	
	@ManyToMany
    @JoinTable(name = "student_classes", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "class_id"))
	@JoinColumn(name = "student_id",referencedColumnName = "id")
	public Set<Student> student;
	
	@ManyToOne
	@JoinColumn(name = "subject_id",referencedColumnName = "id")
	private Subject Subject_id ;
	
	@ManyToOne
	@JoinColumn(name = "teacher_id", referencedColumnName = "id") 
	private Teacher Tracher_id;
	
	@Column(name ="date_of_class")
	private String time;

	public Classes() {
		super();
	}

	public Classes(int section, Set<Student> student, Subject subject_id, Teacher tracher_id, String time) {
		super();
		this.section = section;
		this.student = student;
		Subject_id = subject_id;
		Tracher_id = tracher_id;
		this.time = time;
	}

	public Classes(int id, int section, Set<Student> student, Subject subject_id, Teacher tracher_id, String time) {
		super();
		this.id = id;
		this.section = section;
		this.student = student;
		Subject_id = subject_id;
		Tracher_id = tracher_id;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public Subject getSubject_id() {
		return Subject_id;
	}

	public void setSubject_id(Subject subject_id) {
		Subject_id = subject_id;
	}

	public Teacher getTracher_id() {
		return Tracher_id;
	}

	public void setTracher_id(Teacher tracher_id) {
		Tracher_id = tracher_id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", section=" + section + ", student=" + student + ", Subject_id=" + Subject_id
				+ ", Tracher_id=" + Tracher_id + ", time=" + time + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
