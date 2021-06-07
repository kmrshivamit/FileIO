package Serializable_DeSerializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4936133160126987172L;
	private long id;
	private String name;
	private String deparment;
	
	public Employee(long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.deparment=department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deparment=" + deparment + "]";
	}
	
	
	
	

}
