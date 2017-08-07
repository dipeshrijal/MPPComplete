package playground.genericclass;

public class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Pair<String, String> p = new Pair<>("Dip", "Rijal");
		System.out.println(p.getKey());
		System.out.println(p.getValue());
	}
	

}

