package Customer;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name;
	private String email;
	private String mobileNo;
	public Customer(String name, String email, String mobileNo) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	

}
