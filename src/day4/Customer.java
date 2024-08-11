package day4;

public class Customer {
		private String Customername;
		private int customerId;
		private String Customercity;
		
	public Customer() {
		System.out.println("default constructor");
	}
	public Customer(String Customername,int customerId,String Customercity) {
		this();
		System.out.println("parameterized constructor");
		this.Customername=Customername;
		this.customerId=customerId;
		this.Customercity=Customercity;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomercity() {
		return Customercity;
	}
	public void setCustomercity(String customercity) {
		Customercity = customercity;
	}
	@Override
	public String toString() {
		return "Customer [Customername=" + Customername + ", customerId=" + customerId + ", Customercity=" + Customercity
				+ "]";
	}
	


}
