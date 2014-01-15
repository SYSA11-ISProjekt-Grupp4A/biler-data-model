import java.util.Calendar;

public class Booking {
	protected Person person;
	protected Item item;
	protected Calendar date;
	
	public Person getPerson() {
		return person; }

	public Item getItem() {
		return item; }

	public Calendar getDate() {
		return date; }
	
	public Booking(Person person, Item item, Calendar date) {
		this.person = person;
		this.item = item;
		this.date = date; } }