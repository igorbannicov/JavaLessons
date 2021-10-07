package main;

public class App2 {

    public static void main(String[] args) {
        IntegerBox ib = new  IntegerBox(100);
        DoubleBox db = new  DoubleBox(100.09);
        StringBox sb = new  StringBox("abc");
        System.out.println(ib.toString());
        System.out.println(db.toString());
        System.out.println(sb.toString());
    }
}

// Inheritance/Polymorphism
class Box {

    Object value;
<<<<<<< HEAD
    private void setValue(Object value) { this.value = value; }
    private String getValue() { return this.value.toString(); }
    public String toString(){
        return this.getValue();
    }

}

class IntegerBox extends Box{
    public IntegerBox( Integer value){
        this.value = value;
    }
}

class DoubleBox extends Box{
    public DoubleBox( Double value){
        this.value = value;
    }
}

class StringBox extends Box{
    public StringBox( String value){
        this.value = value;
=======

    Box(Object value){
        this.value = value;
    }
    public void printString(){
        System.out.println(this.value);
>>>>>>> 7639cdbc4dd3e3024ea9077c533d5ae31ac4ed42
    }
}
