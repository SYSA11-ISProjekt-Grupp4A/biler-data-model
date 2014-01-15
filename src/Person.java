import java.util.LinkedList;
import java.util.List;

public class Person {
	protected String name;
	protected List<Booking> bookings = new LinkedList<Booking>();
	
	public Person(String name) {
		this.name = name; }

	public List<Booking> getBookings() {
		return bookings; }
	
	public String getName() {
		return name; }

	public void addBooking(Booking booking) {
		bookings.add(booking); } }
