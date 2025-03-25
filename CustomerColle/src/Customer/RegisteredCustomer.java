package Customer;

public class RegisteredCustomer extends Customer {
	private String regNo;

	public RegisteredCustomer(String name, String email, String mobileNo, String regNo) {
		super(name, email, mobileNo);
		this.regNo=regNo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RegisteredCustomer [regNo=" + regNo + ", toString()=" + super.toString() + "]";
	}
	
	

}
