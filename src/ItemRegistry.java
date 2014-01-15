import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
	protected Map<String, Item> map = new HashMap<String, Item>();
	
	public void add(Item item) {
		map.put(item.getId(), item); }
	
	public Item get(String id) {
		return map.get(id); }  }