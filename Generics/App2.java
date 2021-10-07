package main;

public class App2 {

    public static void main(String[] args) {
        Box <Integer> ib = new  Box<>(100);
        Box <Double> db = new  Box<>(100.09);
        Box <String> sb = new  Box<>("abc");
        System.out.println(ib.toString());
        System.out.println(db.toString());
        System.out.println(sb.toString());
    }
}

// Generics
class Box <T> {

    protected T value;

    Box(T value){ this.setValue(value); }

    private void setValue(T value){ this.value = value; }
    private String getValue(){ return this.value.toString(); }
    public String toString(){ return this.getValue(); }
}

