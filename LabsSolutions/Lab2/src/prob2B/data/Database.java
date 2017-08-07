package prob2B.data;

import java.time.LocalDate;
import java.util.HashMap;

public class Database {
	public static HashMap<String, DataRecord> h = new HashMap<>();

	static {
		h.put("1", new DataRecord(1, LocalDate.now(), 1, 200, 5));
		h.put("2", new DataRecord(1, LocalDate.now(), 2, 2300, 2));
		h.put("3", new DataRecord(2, LocalDate.now(), 2, 2300, 2));
		h.put("4", new DataRecord(2, LocalDate.now(), 2, 2300, 2));
		h.put("5", new DataRecord(2, LocalDate.now(), 2, 2300, 2));
	}
}
