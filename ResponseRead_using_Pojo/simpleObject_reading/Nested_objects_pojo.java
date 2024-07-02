package simpleObject_reading;

public class Nested_objects_pojo 
{
	private String companyName;
	private String companyEmailId;
	private String companyNumber;
	private Nested_object_companyPFDeails_pojo companyPFDeails;
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmailId() {
		return companyEmailId;
	}
	public void setCompanyEmailId(String companyEmailId) {
		this.companyEmailId = companyEmailId;
	}
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	public Nested_object_companyPFDeails_pojo getCompanyPFDeails() {
		return companyPFDeails;
	}
	public void setCompanyPFDeails(Nested_object_companyPFDeails_pojo companyPFDeails) {
		this.companyPFDeails = companyPFDeails;
	}
	
}
