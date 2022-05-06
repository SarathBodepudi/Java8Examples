package example.dto;

public class Contact {
	private String address1;
	private String address2;
	private String email;
	private String phoneNum;
	private int zipCode;
	
	
	public Contact(String address1, String address2, String email, String phoneNum, int zipCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.email = email;
		this.phoneNum = phoneNum;
		this.zipCode = zipCode;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Contact [address1=" + address1 + ", address2=" + address2 + ", email=" + email + ", phoneNum="
				+ phoneNum + ", zipCode=" + zipCode + "]";
	}
	
}
