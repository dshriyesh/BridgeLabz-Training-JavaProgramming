public class GenericInterface implements Container<String>{
    private String item;

    @Override
    public void add(String item) {
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
        this.item=item;
    }

    @Override
    public String get() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'get'");
        return item;
    }
}

interface Container<T>{
    void add(T item);

    T get();
}