package Exam.Exam.spring;

public class Student {
	String name;
	int id;
	String sec;
	String cname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", id=" + id + ", sec=" + sec + ", cname=" + cname + "]";
	}

	

}
