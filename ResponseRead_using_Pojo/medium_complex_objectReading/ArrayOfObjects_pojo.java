package medium_complex_objectReading;

import java.util.List;

public class ArrayOfObjects_pojo 
{
	private String companyName;
	private String companyEmailId;
	private String companyNumber;
	private String companyAddress;
	private List<String> supportedSalaryBanks;
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
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public List<String> getSupportedSalaryBanks() {
		return supportedSalaryBanks;
	}
	public void setSupportedSalaryBanks(List<String> supportedSalaryBanks) {
		this.supportedSalaryBanks = supportedSalaryBanks;
	}
	public List<ArrayOfObjects_employee> getEmployee() {
		return Employee;
	}
	public void setEmployee(List<ArrayOfObjects_employee> employee) {
		Employee = employee;
	}
	public List<ArrayOfObjects_contractors> getContractors() {
		return Contractors;
	}
	public void setContractors(List<ArrayOfObjects_contractors> contractors) {
		Contractors = contractors;
	}
	public List getCompanyPFDeails() {
		return companyPFDeails;
	}
	public void setCompanyPFDeails(List companyPFDeails) {
		this.companyPFDeails = companyPFDeails;
	}
	private List<ArrayOfObjects_employee> Employee;
	private List<ArrayOfObjects_contractors> Contractors;
	private List companyPFDeails;
	
	

}
