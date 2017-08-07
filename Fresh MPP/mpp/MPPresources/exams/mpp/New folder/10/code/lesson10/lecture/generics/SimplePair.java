package lesson10.lecture.generics;


public class SimplePair<K,V> {
	private K key;
    private V value;

    public SimplePair(K key, V value) {
		this.key = key;
		this.value = value;
    }
    public K getKey()	{ return key; }
    public V getValue() { return value; }
    
    public static void main(String[] args) {
		SimplePair<String, String> pair = new SimplePair<String, String>("Hello", "World");
		System.out.println(pair.getKey());
	}
}
