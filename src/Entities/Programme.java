package Entities;

public class Programme {
	private int programmeID;
	private Contact contact;
	private String programmeName;
	private String description;
	private boolean isActive;
	
	public Programme() {
		super();
	}

	public Programme(int programmeID, int contactID, String programmeName,
			String description, boolean isActive) {
		super();
		this.programmeID = programmeID;
		this.contact = contact;
		this.programmeName = programmeName;
		this.description = description;
		this.isActive = isActive;
	}

	public int getProgrammeID() {
		return programmeID;
	}

	public void setProgrammeID(int programmeID) {
		this.programmeID = programmeID;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getProgrammeName() {
		return programmeName;
	}

	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
