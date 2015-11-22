package giveright.entity;

import java.sql.Date;

public class VolunteerWork {
	private int					idVolunteerWork;
	private int					idVolunteer;
	private String				task;
	private String				status;
	private Date				dateCompleted;
	
	public static final String	STATUS_PENDING		= "Pending";
	public static final String	STATUS_INPROGRESS	= "In Progress";
	public static final String	STATUS_COMPLETED	= "Completed";

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getIdVolunteerWork() {
		return idVolunteerWork;
	}

	public void setIdVolunteerWork(int idVolunteerWork) {
		this.idVolunteerWork = idVolunteerWork;
	}

	public int getIdVolunteer() {
		return idVolunteer;
	}

	public void setIdVolunteer(int idVolunteer) {
		this.idVolunteer = idVolunteer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
}
