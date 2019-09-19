import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> list;
	
	public AddressBook() {
		this.list = new ArrayList<BuddyInfo>();
	}

	public ArrayList<BuddyInfo> getList() {
		return list;
	}

	public void setList(ArrayList<BuddyInfo> list) {
		this.list = list;
	}
	
	public void addBuddy(BuddyInfo buddy) {
		list.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy) {
		list.remove(buddy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("Britt","123","123");
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		book.removeBuddy(buddy);
		
	}
}
