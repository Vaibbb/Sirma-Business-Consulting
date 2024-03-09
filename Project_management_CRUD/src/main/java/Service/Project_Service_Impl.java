package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Model.Project;
import Repositery.Project_Repositery;
import custom_exceptions.ResourceNotFoundException;

public class Project_Service_Impl implements Project_Service {

	@Autowired
	Project_Repositery repo;
	
	@Override
	public Project getProById(Long proid) {
		// TODO Auto-generated method stub
		return repo.findById(proid).orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID!!!!!"));
	}
	
	@Override
	public String deleteEmpDetails(Long proid) {
		// TODO Auto-generated method stub
		String mesg = "Project deletion failed !!!! invalid project id";
		if (repo.existsById(proid)) {
			repo.deleteById(proid);
			mesg = "Emp details deleted ....";
		}
		return mesg;
	}
		
	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Project addNewpro(Project pro) {
		// TODO Auto-generated method stub
		return repo.save(pro);
	}

	@Override
	public Project updateProject(Project pro) {
		// TODO Auto-generated method stub
		return repo.save(pro);
	}
	

}
