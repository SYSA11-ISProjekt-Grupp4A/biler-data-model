import java.util.HashMap;
import java.util.Map;

public class PersonRegistry {
	protected Map<String, Person> map = new HashMap<String, Person>();
	
	public void add(Person person) {
		map.put(person.getName(), person); }
	
	public Person get(String name) {
		return map.get(name); } }