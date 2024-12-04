package Exam.Exam.spring;

public class Employee
{
	int id;
	String name;
	String dep;
	String salary;
	public Employee(int id, String name, String dep, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + ", salary=" + salary + "]";
	}
	
}
