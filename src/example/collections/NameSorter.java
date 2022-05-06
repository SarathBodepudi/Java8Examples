package example.collections;

import java.util.Comparator;

import example.streams.dto.Employee;

public class NameSorter implements Comparator<Employee> {
	@Override
    public int compare(Employee e1, Employee e2) 
    {
        return e1.getFirstName().compareToIgnoreCase( e2.getFirstName() );
    }
}
