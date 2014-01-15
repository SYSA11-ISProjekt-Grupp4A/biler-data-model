import java.util.LinkedList;
import java.util.List;

public class Item {
	protected String id;
	protected List<Booking> bookings = new LinkedList<Booking>();

	public List<Booking> getBookings() {
		return bookings; }

	public Item(String id) { 
		this.id = id; }
	
	public String getId() {
		return id; }

	public void addBooking(Booking booking) {
		bookings.add(booking); } }