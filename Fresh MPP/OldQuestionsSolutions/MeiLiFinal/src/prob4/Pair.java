package prob4;


public class Pair<T,R> {
	private T first;
    private R second;

    public Pair(T key, R value) {
		this.first = key;
		this.second = value;
    }
 
    public String toString(){
    	return "[" + first + ", " + second + "]";
    }
}