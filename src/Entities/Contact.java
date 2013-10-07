package Entities;

public class Contact {
	private int contactID;
	private String contactFirstName;
	private String contactSurname;
	private String knowAs;
	private int officePhone;
	private int mobileHomePhone;
	private int STHomePhone;
	private String emailAddress;
	private Contact managerName;
	private String contactType;
	private String contactMethod;
	private String jobRole;
	private String workbase;
	private String jobTitle;
	private boolean isActive;
	
	public Contact() {
		super();
	}
	public Contact(int contactID, String contactFirstName,
			String contactSurname, String knowAs, int officePhone,
			int mobileHomePhone, int sTHomePhone, String emailAddress,
			Contact managerName, String contactType, String contactMethod,
			String jobRole, String workbase, String jobTitle, boolean isActive) {
		super();
		this.contactID = contactID;
		this.contactFirstName = contactFirstName;
		this.contactSurname = contactSurname;
		this.knowAs = knowAs;
		this.officePhone = officePhone;
		this.mobileHomePhone = mobileHomePhone;
		STHomePhone = sTHomePhone;
		this.emailAddress = emailAddress;
		this.managerName = managerName;
		this.contactType = contactType;
		this.contactMethod = contactMethod;
		this.jobRole = jobRole;
		this.workbase = workbase;
		this.jobTitle = jobTitle;
		this.isActive = isActive;
	}
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public String getContactSurname() {
		return contactSurname;
	}
	public void setContactSurname(String contactSurname) {
		this.contactSurname = contactSurname;
	}
	public String getKnowAs() {
		return knowAs;
	}
	public void setKnowAs(String knowAs) {
		this.knowAs = knowAs;
	}
	public int getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(int officePhone) {
		this.officePhone = officePhone;
	}
	public int getMobileHomePhone() {
		return mobileHomePhone;
	}
	public void setMobileHomePhone(int mobileHomePhone) {
		this.mobileHomePhone = mobileHomePhone;
	}
	public int getSTHomePhone() {
		return STHomePhone;
	}
	public void setSTHomePhone(int sTHomePhone) {
		STHomePhone = sTHomePhone;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Contact getManagerName() {
		return managerName;
	}
	public void setManagerName(Contact managerName) {
		this.managerName = managerName;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getContactMethod() {
		return contactMethod;
	}
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getWorkbase() {
		return workbase;
	}
	public void setWorkbase(String workbase) {
		this.workbase = workbase;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

}
