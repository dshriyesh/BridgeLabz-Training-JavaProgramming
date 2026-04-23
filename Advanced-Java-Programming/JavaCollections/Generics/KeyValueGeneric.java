public class KeyValueGeneric {
    public static void main(String[] args) {
        Main<String,Integer> pair = new Main("Age",22);

        System.out.println(pair.getValue());
        System.out.println(pair.getKey());
    }
}

class Main<K,V>{

    private K key;
    private V value;

    public Main(K key, V value){
    this.key=key;
    this.value=value;
    }

    public V getValue(){
    return value;
    }

    public K getKey(){
    return key;
    }

}
