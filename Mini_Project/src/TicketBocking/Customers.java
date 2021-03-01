package TicketBocking;


public class Customers {
	private String password;
	private String username;
	private String firstName;
	private String lastName;
	private String countryName;
	private String email;
	private String destination;
	private String deperture;
	private String acOption;
	private String trip;
	private String seatClass;
	private int totalSeat;
	private int totalPrice;
	private int age;
	
	public Customers() {
				
	}
	
	//constructor for Authentication
	public Customers(String username,String password,String firstName,String lastName,String countryName,int age,String email) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryName = countryName;
		this.age = age;
		this.email = email;
	}
	
	
	//constructor for buy ticket for bus
	public Customers(String deperture,String destination,String acOption,int totalSeat) {
		this.deperture = deperture;
		this.destination = destination;
		this.acOption = acOption;
		this.totalSeat = totalSeat;
	}
	
	//constructor for Buy ticket for Train
	public Customers(String deperture,String destination,String acOption,int totalseat,int price) {
		this.deperture = deperture;
		this.destination = destination;
		this.acOption = acOption;
		this.totalSeat = totalseat;
		this.totalPrice = totalseat;
	}
	
	//Constructor for buy Air Ticket
	public Customers(String deperture, String destination,String trip, String seatClass,int totalseat,int totalPrice) {
		this.deperture = deperture;
		this.destination = destination;
		this.trip = trip;
		this.seatClass = seatClass;
		this.totalSeat = totalseat;
		this.totalPrice = totalPrice;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeperture() {
		return deperture;
	}

	public void setDeperture(String deperture) {
		this.deperture = deperture;
	}

	public String getAcOption() {
		return acOption;
	}

	public void setAcOption(String acOption) {
		this.acOption = acOption;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	
}
