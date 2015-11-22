package giveright.entity;

public class VolunteerRequest {
	private int	idVolunteerRequest;
	private int	idReliefOperation;
	private String	task;
	private String	status;
	
	public static final String STATUS_NEEDED = "Needed";
	public static final String STATUS_FINISHED = "Finished";

	public int getIdVolunteerRequest() {
		return idVolunteerRequest;
	}

	public void setIdVolunteerRequest(int idVolunteerRequest) {
		this.idVolunteerRequest = idVolunteerRequest;
	}

	public int getIdReliefOperation() {
		return idReliefOperation;
	}

	public void setIdReliefOperation(int idReliefOperation) {
		this.idReliefOperation = idReliefOperation;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
