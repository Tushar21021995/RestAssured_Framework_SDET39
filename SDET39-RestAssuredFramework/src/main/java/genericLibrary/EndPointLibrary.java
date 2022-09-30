package genericLibrary;

public interface EndPointLibrary
{
	/**
	 * This interface will contain all the endpoints
	 * @author Tushar
	 */
	public interface EndPointsLibrary {

		String createProject = "/addProject";
		String getAllProjects = "/projects";
		String getSingleProject = "/projects/";
		String deleteProject = "/projects/";
		String updateProject = "/projects/";

	}

}
