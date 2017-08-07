package prob2C.data;

import java.util.HashMap;

public class Database {
	
	public static HashMap<String, DataRecord> h = new HashMap<>();
	
	static {
		h.put("1", new DataRecord("dipesh", 1, 12));
		h.put("2", new DataRecord("rijal", 2, 23));
		h.put("3", new DataRecord("john", 3, 22));
		h.put("4", new DataRecord("dipesh", 1, 22));
	}

}
