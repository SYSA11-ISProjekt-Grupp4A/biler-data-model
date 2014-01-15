import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

public class Main {
	protected static final DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");

	public static void main(String[] argv) {
		// our registers
		ItemRegistry items = new ItemRegistry();
		PersonRegistry persons = new PersonRegistry();

		// add some stuff
		persons.add(new Person("Kalle"));
		persons.add(new Person("Lisa"));
		persons.add(new Person("Rudolf"));
		
		items.add(new Item("Gul-Bil"));
		items.add(new Item("Blå-Bil"));
		items.add(new Item("Grå-Moppe"));
				
		Booking b1 = new Booking(persons.get("Kalle"), items.get("Gul-Bil"), Calendar.getInstance());
		items.get("Gul-Bil").addBooking(b1);
		persons.get("Kalle").addBooking(b1);
		Booking b2 = new Booking(persons.get("Lisa"), items.get("Blå-Bil"), Calendar.getInstance());
		items.get("Blå-Bil").addBooking(b2);
		persons.get("Kalle").addBooking(b2);
		Booking b3 = new Booking(persons.get("Lisa"), items.get("Grå-Moppe"), Calendar.getInstance());
		items.get("Grå-Moppe").addBooking(b3);
		persons.get("Lisa").addBooking(b3);

		// print the stuff
		print(persons.get("Kalle"));
		print(persons.get("Lisa"));
		print(persons.get("Rudolf"));

		print(items.get("Gul-Bil"));
		print(items.get("Blå-Bil"));
		print(items.get("Grå-Moppe")); }

	private static void print(Item item) {
		System.out.println(item.getId());
		Iterator<Booking> i = item.getBookings().iterator();
		while (i.hasNext()) {
			print(i.next()); } }
	
	private static void print(Person person) {
		System.out.println(person.getName());
		Iterator<Booking> i = person.getBookings().iterator();
		while (i.hasNext()) {
			print(i.next()); } }
	
	private static void print(Booking booking) {
		System.out.println("Booking of " + booking.getItem().getId() + " by " + booking.getPerson().getName() + " at " + dateFormat.format(booking.getDate().getTime())); } }