package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.Databaseexample.employeerepo;
import com.example.demo.entity.Employee;


	@Service
	public class employeeservice {
	@Autowired
	private employeerepo emp;
	public Employee saveDetails(Employee e) {

		return emp.save(e);
			
	}
	public List<Employee> getAllDetails()
	{
		Pageable p = PageRequest.of(0, 2);
		Page<Employee> e = emp.findAll(p);
		//return s.toList();
	List<Employee> pass = emp.findAll(Sort.by(Sort.Direction.ASC,"id"));
	return pass;
	}
	public void deleteDepartmentById(int id)
	{
	 emp.deleteById(id);
	}
	
	public Employee update(int id, Employee e) {
		return emp.saveAndFlush(e);
	}
	
	}

