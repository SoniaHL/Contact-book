
public class BuddyInfo {
	private String name;
	private String address;
	private String phone;
	private String planet;
	
	public BuddyInfo(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public BuddyInfo() {
		this("John Doe","123","John Doe");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPlanet() {
		return this.planet;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Britt","123","8888888888");
		System.out.println("Hello "+ buddy.getName());
		System.out.println("Hello World!");

	}

}
