package com.example.demo.summerIntern;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class InternController {
	@Autowired
	private InternRepository internRepo;
	
	@GetMapping("/intern")
	public List <Intern> getAllinterns()
	{
		return internRepo.findAll();
	}
	
	@PostMapping("/intern")
	public Intern saveStudent( @RequestBody Intern intern)
	
	{
		
		return internRepo.save(intern);
	
		
	}
	@DeleteMapping("/intern/{id}")
	public void deletestudentsbyid(@PathVariable String id)
	{
		internRepo.deleteById(id);
	}
	@PutMapping("/intern/{id}")
	public Intern updateStudent( @RequestBody Intern intern, @PathVariable String id)
	
	{
		Intern currentIntern;
		currentIntern = internRepo.findById(id).get();
		currentIntern.setEmployeeId(intern.getEmployeeId());
		currentIntern.setFirstName(intern.getFirstName());
		currentIntern.setLastName(intern.getLastName());
		currentIntern.setPhoneNumber(intern.getPhoneNumber());
		currentIntern.setJobId(intern.getJobId());
		currentIntern.setSalary(intern.getSalary());
		currentIntern.setManagerId(intern.getManagerId());
		currentIntern.setDepartmentId(intern.getDepartmentId());
		return internRepo.save(currentIntern);
//		intern.set_id(id);
//		return internRepo.save(intern);
//		
	}

}
