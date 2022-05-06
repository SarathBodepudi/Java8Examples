package example.streams.dto;

public class Salary {
	private int employeeId;
	private double salary;
	private String department;
	private String costCenter;
		
	public Salary() {
		super();
	}

	public Salary(int employeeId, double salary, String department, String costCenter) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.department = department;
		this.costCenter = costCenter;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salary [employeeId=");
		builder.append(employeeId);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", department=");
		builder.append(department);
		builder.append(", costCenter=");
		builder.append(costCenter);
		builder.append("]");
		return builder.toString();
	}
}
