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

// Overload
class IntegerBox {

    protected Integer value;

    IntegerBox(Integer value){
        this.setValue(value);
    }
    private void setValue (Integer value) { this.value = value; }
    private String getValue () { return this.value.toString(); }
    public String toString(){ return this.getValue(); }
}

class DoubleBox {

    Double value;

    DoubleBox(Double value){ this.setValue(value); }
    private void setValue (Double value) { this.value = value; }
    private String getValue () { return this.value.toString(); }
    public String toString(){return this.getValue(); }
}

class StringBox {

    String value;

    StringBox(String value){
        this.value = value;
    }
    private void setValue (String value) { this.value = value; }
    private String getValue () { return this.value.toString(); }
    public String toString(){return this.getValue(); }
}
