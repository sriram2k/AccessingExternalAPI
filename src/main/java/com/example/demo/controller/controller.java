package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;
import com.example.demo.repo.EmployeeRepo;

@RestController
@RequestMapping("/api/v2")
public class controller {

	@Autowired
	private EmployeeRepo erepo;

	@PostMapping("/Employees")
	public model createEmployee(@RequestBody model emp) {
		return erepo.save(emp);

	}

	@GetMapping("/Employees/{id}")
	public String getEmployeeById(@PathVariable(value = "id") Long empID) throws Exception {
		model m = erepo.findById(empID).get();
		GetCountry obj = new GetCountry();
		String city = m.getCity();
		String finalResponse = m.toString() + "\n" + obj.getCountry(city);
		return finalResponse;

	}

	@GetMapping("/Employees")
	public ResponseEntity<Iterable<model>> getAllEmployee() {
		Iterable<model> iterable = erepo.findAll();
		for (model employee : iterable) {
			System.out.println(employee);
		}
		return ResponseEntity.ok().body(iterable);

	}

}
