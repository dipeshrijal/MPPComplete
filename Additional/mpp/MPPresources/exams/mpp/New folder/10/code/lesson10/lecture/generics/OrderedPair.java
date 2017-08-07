package lesson10.lecture.generics;

//This version implements the generic class Pair<K,V>
public class OrderedPair<X, Y> implements Pair<X, Y> {
    private X key;
    private Y value;

    public OrderedPair(X key, Y value) {
		this.key = key;
		this.value = value;
    }

    public X getKey()	{ return key; }
    public Y getValue() { return value; }
    
    @Override
	public String toString() {
		return defaultToString();
	}
    
    public static void main(String[] args) {
    	Pair<String, Integer> p = new OrderedPair<>("Bob", 1001);
    	System.out.println(p);
    	
    }
    
    
    
}