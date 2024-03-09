package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Model.Project;
import Service.Project_Service_Impl;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {
	
	
	@Autowired
	private Project_Service_Impl service;
	
	
	
	// add API end point for getting emp details by id
	// http://localhost:8080/employees/{empId},method=GET
	@GetMapping("/{proid}")
	public Project getEmpDetailsById(@PathVariable Long proid) {
		System.out.println("in get project by id" + proid);
		return service.getProById(proid);
	}
	
	
	// add API end point for deleting existing project details by it's id
	// http://localhost:8080/project/{proid},method=DELETE
	@DeleteMapping("/{proid}") 
	public String deleteEmpFDetails(@PathVariable Long proid) {
		System.out.println("in del project " + proid);
		return service.deleteEmpDetails(proid);
	}
	
	
	// Add REST API endpoint , to return list of all project
	// http://localhost:8080/project ,method=GET
	@GetMapping
	public List<Project> fetchAllProject() {
		System.out.println("in fetch all");
		return service.getAllProjects();
	}
	// add API end point for adding emp details
	// http://localhost:8080/project,method=POST
	@PostMapping
	public Project addEmpDetails(@RequestBody Project pro) {
		System.out.println("in add Project " + pro);// id : null , rest all fields : present
		return service.addNewpro(pro);
	}	
	
	// add API end point for updating existing emp details
	// http://localhost:8080/project,method=PUT
	@PutMapping
	public Project updateProjectDetails(@RequestBody Project pro) {
		System.out.println("in update " + pro);
		return service.updateProject(pro);
	}
	
	
}
