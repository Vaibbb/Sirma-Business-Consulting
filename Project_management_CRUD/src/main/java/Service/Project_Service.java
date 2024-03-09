package Service;

import java.util.List;

import Model.Project;

public interface Project_Service {
	
	List<Project> getAllProjects();
	Project addNewpro(Project pro);
	Project updateProject(Project pro);
	String deleteEmpDetails(Long proid);
	Project getProById(Long proid);

}
