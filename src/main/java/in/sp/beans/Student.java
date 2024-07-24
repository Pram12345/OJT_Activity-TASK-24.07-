package in.sp.beans;

public class Student {
	private String name;
	private int rollno;
	private String address;
	private String friend_name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getAddress() {
		return address;
	}


	public String getFriend_name() {
		return friend_name;
	}


	public void setFriend_name(String friend_name) {
		this.friend_name = friend_name;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	


	public void display() {
		System.out.println("Name : " + name +"rollno : "+ rollno + "Address : " + address + "friend_name"  + friend_name);	}

}
