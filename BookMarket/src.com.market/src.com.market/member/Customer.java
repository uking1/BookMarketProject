package member;

public class Customer {
	private String name; // 고객 이름
	private int phone; // 연락처
	private String address; // 주소

	public Customer() {

	}

	public Customer(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}

	public Customer(String name, int phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
